package com.design.strategy;

import com.design.strategy.fly.impl.FlyNoWay;
import com.design.strategy.quack.impl.Quack;

/**
* @author 作者
* @version 创建时间：2019年3月25日 下午6:01:59
* 类说明
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
