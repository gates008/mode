package com.design.strategy.quack.impl;

import com.design.strategy.quack.QuackBehavior;

/**
* @author ����
* @version ����ʱ�䣺2019��3��25�� ����6:16:24
* ��˵��
*/
public class FakeQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Qwak");
	}

}
