package com.design.strategy;

import com.design.strategy.fly.impl.FlyWithWings;
import com.design.strategy.quack.impl.Quack;

/**
* @author ����
* @version ����ʱ�䣺2019��3��25�� ����5:54:30
* ��˵��
*/
public class RedHeadDuck extends Duck {

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Red Headed duck");
	}
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}


}
