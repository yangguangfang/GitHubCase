package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

/**
 * 定义商品类接口
 * @author Administrator
 *
 */
public interface ItemService {
	/**
	 * 通过商品ID获取商品信息
	 * @param orderId
	 * @return
	 */
	List<Item> getItems(String orderId);
	/**
	 * 修改用户积分
	 * @param list
	 */
	void decreaseNumbers(List<Item> list);
}