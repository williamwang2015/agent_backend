/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.aiforest.com
 * 注意：
 * 本软件为www.aiforest.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.aiforest.cloud.estate.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.aiforest.cloud.estate.common.dto.AuditDTO;
import com.aiforest.cloud.estate.common.entity.AwesomeShooting;
import org.apache.ibatis.annotations.Param;

/**
 * 房产炫拍
 *
 * @author way
 * @date 2020-04-09 09:05:26
 */
public interface AwesomeShootingMapper extends BaseMapper<AwesomeShooting> {

	IPage<AwesomeShooting> selectPage1(IPage<AwesomeShooting> page, @Param("query") AuditDTO auditDTO);

	boolean addViews(String id);

	IPage<AwesomeShooting> selectPage2(IPage<AwesomeShooting> page, @Param("query") AwesomeShooting awesomeShooting);

}
