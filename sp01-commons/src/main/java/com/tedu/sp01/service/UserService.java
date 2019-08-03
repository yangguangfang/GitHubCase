package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

/**
 * 定义用户接口
 * @author Administrator
 *
 */
public interface UserService {
	/**
	 * 根据用户id获取用户信息
	 * @param id
	 * @return
	 */
	User getUser(Integer id);
	/**
	 * 根据商品数量增加商品积分
	 * @param id
	 * @param score
	 */
	void addScore(Integer id, Integer score);
}