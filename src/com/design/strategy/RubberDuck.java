package com.design.strategy;

import com.design.strategy.fly.impl.FlyNoWay;
import com.design.strategy.quack.impl.Squeak;

/**
* @author 作者
* @version 创建时间：2019年3月25日 下午6:04:23
* 类说明
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
