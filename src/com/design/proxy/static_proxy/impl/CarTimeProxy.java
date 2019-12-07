package com.design.proxy.static_proxy.impl;

import com.design.proxy.static_proxy.Moveable;

/**
* @author ����
* @version ����ʱ�䣺2019��4��2�� ����11:22:05
* ��˵��
*/
public class CarTimeProxy implements Moveable {

	 private Moveable moveable;//ͬ����ʾ

	    public CarTimeProxy(Moveable moveable) {
	        super();
	        this.moveable = moveable;
	    }

	    @Override
	    public void move() {
	        long starttime = System.currentTimeMillis();
	        System.out.println("������ʼ��ʻ");
	        moveable.move();
	        long endtime = System.currentTimeMillis();
	        System.out.println("������ʻ��������ʻ��"+(endtime-starttime)+" ����");
	    }

}
