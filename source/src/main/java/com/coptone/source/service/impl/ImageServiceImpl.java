package com.coptone.source.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coptone.source.dto.ImageProcessDTO;
import com.coptone.source.result.ImageProcessResult;
import com.coptone.source.service.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
@Slf4j
@Service
public class ImageServiceImpl  implements ImageService  {
        private static final String BASE64_PREFIX_REGEX = "^data:image/[^;]+;base64";

        public ImageProcessResult processImage(ImageProcessDTO dto) {
            try {
                // 1. 验证和解码图片
                ImageData imageData = validateAndDecodeImage(dto.getImageData());

                // 2. 读取原始图片
                BufferedImage originalImage = ImageIO.read(
                        new ByteArrayInputStream(imageData.getImageBytes())
                );

                if (originalImage == null) {
                    throw new IllegalArgumentException("不支持的图片格式");
                }

                // 3. 计算新尺寸
                int originalWidth = originalImage.getWidth();
                int originalHeight = originalImage.getHeight();
                double scale = dto.getOperationType() == ImageProcessDTO.OperationType.ENLARGE ?
                        dto.getScale() : 1.0 / dto.getScale();

                int newWidth = (int) (originalWidth * scale);
                int newHeight = (int) (originalHeight * scale);

                // 4. 处理图片
                BufferedImage processedImage = resizeImage(
                        originalImage,
                        newWidth,
                        newHeight,
                        dto.getOperationType()
                );

                // 5. 编码处理后的图片
                String processedBase64 = encodeImageToBase64(
                        processedImage,
                        imageData.getFormat()
                );

                // 6. 构建并返回结果
                return new ImageProcessResult(
                        processedBase64,
                        originalWidth,
                        originalHeight,
                        newWidth,
                        newHeight,
                        imageData.getFormat()
                );

            } catch (Exception e) {
                throw new RuntimeException("图片处理失败: " + e.getMessage(), e);
            }
        }

        private ImageData validateAndDecodeImage(String base64Data) {
            if (base64Data == null || base64Data.isEmpty()) {
                throw new IllegalArgumentException("图片数据不能为空");
            }

            // 提取格式和纯base64数据
            String[] parts = base64Data.split(",");
            if (parts.length < 2) {
                throw new IllegalArgumentException("无效的base64图片格式");
            }

            String prefix = parts[0];
            String pureBase64 = parts[1];

            // 验证格式
            if (!prefix.matches(BASE64_PREFIX_REGEX)) {
                throw new IllegalArgumentException("不支持的图片格式，仅支持JPEG/PNG/GIF");
            }

            // 提取格式
            String format = prefix.split("/")[1].split(";")[0];
            log.debug(format);
            if (!format.equalsIgnoreCase("jpeg") &&
                    !format.equalsIgnoreCase("png") &&
                    !format.equalsIgnoreCase("gif")) {
                throw new IllegalArgumentException("不支持的图片格式: " + format);
            }

            try {
                // 解码base64
                byte[] imageBytes = Base64.getDecoder().decode(pureBase64);

                // 验证图片大小
                if (imageBytes.length > 10 * 1024 * 1024) { // 10MB限制
                    throw new IllegalArgumentException("图片大小不能超过10MB");
                }

                return new ImageData(imageBytes, format);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("无效的base64编码", e);
            }
        }

        private BufferedImage resizeImage(BufferedImage original,
                                          int newWidth, int newHeight,
                                          ImageProcessDTO.OperationType operationType) {
            // 创建新图像
            BufferedImage resized = new BufferedImage(
                    newWidth, newHeight,
                    operationType == ImageProcessDTO.OperationType.ENLARGE ?
                            BufferedImage.TYPE_INT_RGB : original.getType()
            );

            // 使用高质量缩放
            Graphics2D g = resized.createGraphics();
            g.setRenderingHint(
                    RenderingHints.KEY_INTERPOLATION,
                    operationType == ImageProcessDTO.OperationType.ENLARGE ?
                            RenderingHints.VALUE_INTERPOLATION_BICUBIC :
                            RenderingHints.VALUE_INTERPOLATION_BILINEAR
            );

            g.drawImage(original, 0, 0, newWidth, newHeight, null);
            g.dispose();

            return resized;
        }

        private String encodeImageToBase64(BufferedImage image, String format) throws Exception {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, format, baos);
            byte[] bytes = baos.toByteArray();
            return "data:image/" + format.toLowerCase() + ";base64," +
                    Base64.getEncoder().encodeToString(bytes);
        }

        // 内部类用于存储图片数据
        private static class ImageData {
            private final byte[] imageBytes;
            private final String format;

            public ImageData(byte[] imageBytes, String format) {
                this.imageBytes = imageBytes;
                this.format = format;
            }

            public byte[] getImageBytes() {
                return imageBytes;
            }

            public String getFormat() {
                return format;
            }
        }
}

