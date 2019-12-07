package com.design.strategy;

import com.design.strategy.fly.impl.FlyWithWings;
import com.design.strategy.quack.impl.Quack;

/**
* @author 作者
* @version 创建时间：2019年3月25日 下午6:02:51
* 类说明
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
