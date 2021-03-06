/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.aiforest.com
 * 注意：
 * 本软件为www.aiforest.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.aiforest.cloud.estate.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/**
 * 房产布告
 *
 * @author way
 * @date 2020-04-01 16:51:04
 */
@Data
@TableName("advertisement")
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "房产布告")
public class Advertisement extends Model<Advertisement> {
    private static final long serialVersionUID=1L;

    /**
     * PK
     */
    @TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "PK")
    private String id;
    /**
     * 所属租户
     */
    @ApiModelProperty(value = "所属租户")
    private String tenantId;
//    /**
//     * 应用ID
//     */
//    @ApiModelProperty(value = "应用ID")
//    private String appId;
    /**
     * 逻辑删除标记（0：显示；1：隐藏）
     */
    @ApiModelProperty(value = "逻辑删除标记（0：显示；1：隐藏）")
    private String delFlag;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
    /**
     * 最后更新时间
     */
    @ApiModelProperty(value = "最后更新时间")
    private LocalDateTime updateTime;
    /**
     * 创建者ID
     */
    @ApiModelProperty(value = "创建者ID")
    private String createId;
    /**
     * 类型1、小程序首页轮播图；2、小程序首页公告
     */
    @ApiModelProperty(value = "类型1、小程序首页轮播图；2、小程序首页公告")
    private String type;
    /**
     * 通知名
     */
    @ApiModelProperty(value = "通知名")
    private String name;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remarks;
    /**
     * （1：开启；0：关闭）
     */
    @ApiModelProperty(value = "（1：开启；0：关闭）")
    private String enable;

	@TableField(exist = false)
	private List<AdvertisementItem> listAdvertisementItem;

}
