package com.design.proxy.static_proxy.impl;

import java.util.Random;

import com.design.proxy.static_proxy.Moveable;

/**
 * @author ����
 * @version ����ʱ�䣺2019��4��2�� ����11:05:59 ��˵��
 */
public class Car implements Moveable {
	public Car() {
		System.out.println("����Car...");
	}
	@Override
	public void move() {
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("������ʻ��");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
