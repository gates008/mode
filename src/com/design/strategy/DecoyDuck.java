package com.design.strategy;

import com.design.strategy.fly.impl.FlyNoWay;
import com.design.strategy.quack.impl.MuteQuack;

/**
* @author 作者
* @version 创建时间：2019年3月25日 下午6:04:51
* 类说明
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
