package com.tedu.sp01.service;


import com.tedu.sp01.pojo.Order;
/**
 * 定义订单接口
 * @author Administrator
 *
 */
public interface OrderService {
	/**
	 * 根据订单id获取订单信息
	 * @param orderId
	 * @return
	 */
	Order getOrder(String orderId);
	/**
	 * 新增订单信息
	 * @param order
	 */
	void addOrder(Order order);
}