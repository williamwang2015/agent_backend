/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.aiforest.com
 * 注意：
 * 本软件为www.aiforest.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.aiforest.cloud.estate.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aiforest.cloud.estate.common.entity.Likes;

import java.util.List;


/**
 * 房产点赞
 *
 * @author way
 * @date 2020-04-13 11:15:42
 */
public interface LikesService extends IService<Likes> {
	List<Likes> list1(Likes likes);
}
