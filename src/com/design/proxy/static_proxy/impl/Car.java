package com.design.proxy.static_proxy.impl;

import java.util.Random;

import com.design.proxy.static_proxy.Moveable;

/**
 * @author 作者
 * @version 创建时间：2019年4月2日 上午11:05:59 类说明
 */
public class Car implements Moveable {
	public Car() {
		System.out.println("构造Car...");
	}
	@Override
	public void move() {
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
