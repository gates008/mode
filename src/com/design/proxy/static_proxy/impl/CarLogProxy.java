package com.design.proxy.static_proxy.impl;

import com.design.proxy.static_proxy.Moveable;

/**
* @author ����
* @version ����ʱ�䣺2019��4��2�� ����11:07:13
* ��˵��
*/
public class CarLogProxy implements Moveable {

	 private Moveable moveable;//��movable ���͵Ķ���ۺϽ�������ʵmovable��һ���ӿڣ������õ��˶�̬�ĸ��

	    public CarLogProxy(Moveable moveable) {
	        super();
	        this.moveable = moveable;
	    }

	    @Override
	    public void move() {
	        System.out.println("��־��ʼ...");
	        moveable.move();
	        System.out.println("��־����...");
	    }
}
