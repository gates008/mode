package com.design.strategy.quack.impl;

import com.design.strategy.quack.QuackBehavior;

/**
* @author ����
* @version ����ʱ�䣺2019��3��25�� ����6:06:51
* ��˵��
*/
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("<< Silence >>");

	}

}
