package com.design.strategy;

import com.design.strategy.fly.impl.FlyWithWings;
import com.design.strategy.quack.impl.Quack;

/**
* @author 作者
* @version 创建时间：2019年3月25日 下午5:54:30
* 类说明
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
