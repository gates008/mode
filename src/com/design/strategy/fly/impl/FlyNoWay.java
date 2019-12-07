package com.design.strategy.fly.impl;

import com.design.strategy.fly.FlyBehavior;

/**
* @author 作者
* @version 创建时间：2019年3月25日 下午5:51:52
* 类说明
*/
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I'm flying with a rocket");
	}

}
