package com.design.strategy;

import com.design.strategy.fly.impl.FlyWithWings;
import com.design.strategy.quack.impl.Quack;

/**
* @author ����
* @version ����ʱ�䣺2019��3��25�� ����6:02:51
* ��˵��
*/
public class MallardDuck extends Duck {

	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Mallard duck");
	}

}
