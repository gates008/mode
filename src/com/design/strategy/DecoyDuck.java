package com.design.strategy;

import com.design.strategy.fly.impl.FlyNoWay;
import com.design.strategy.quack.impl.MuteQuack;

/**
* @author ����
* @version ����ʱ�䣺2019��3��25�� ����6:04:51
* ��˵��
*/
public class DecoyDuck extends Duck {

	public DecoyDuck() {
		// TODO Auto-generated constructor stub
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a duck Decoy");
	}

}
