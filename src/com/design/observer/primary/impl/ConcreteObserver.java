package com.design.observer.primary.impl;

import com.design.observer.primary.Observer;

/**
* @author ����
* @version ����ʱ�䣺2019��3��26�� ����2:17:14
* ��˵��
*/
public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		  //����hashCode������ͬ�Ķ���
	      System.out.println(this.hashCode()+"  says: I'm notified !");
	}

}
