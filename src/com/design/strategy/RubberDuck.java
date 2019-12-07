package com.design.strategy;

import com.design.strategy.fly.impl.FlyNoWay;
import com.design.strategy.quack.impl.Squeak;

/**
* @author ����
* @version ����ʱ�䣺2019��3��25�� ����6:04:23
* ��˵��
*/
public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a rubber duckie");
	}

}
