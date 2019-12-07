package com.design.strategy;

import com.design.strategy.fly.impl.FlyNoWay;
import com.design.strategy.quack.impl.Quack;

/**
* @author ����
* @version ����ʱ�䣺2019��3��25�� ����6:01:59
* ��˵��
*/
public class ModelDuck extends Duck {

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a model duck");
	}
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}


}
