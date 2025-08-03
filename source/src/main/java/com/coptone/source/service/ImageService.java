package com.coptone.source.service;

import com.coptone.source.dto.ImageProcessDTO;
import com.coptone.source.result.ImageProcessResult;

public interface ImageService {
    ImageProcessResult processImage(ImageProcessDTO dto) throws Exception;
}
