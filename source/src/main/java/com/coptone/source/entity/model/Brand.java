/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Brand)实体类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:54
 */
@Builder
@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
@Accessors(chain = true)
@TableName("Brand")
public class Brand implements Serializable {
    private static final long serialVersionUID = -97206550636126458L;
    @TableId(type = IdType.AUTO)
    private Integer brandId;
    @TableField("chineseName")
    private String chineseName;
    @TableField("englishName")
    private String englishName;
    @TableField("countryId")
    private Integer countryId;


}

