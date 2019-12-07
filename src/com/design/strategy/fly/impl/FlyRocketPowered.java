package com.design.strategy.fly.impl;

import com.design.strategy.fly.FlyBehavior;

/**
* @author 作者
* @version 创建时间：2019年3月25日 下午6:15:12
* 类说明
*/
public class FlyRocketPowered implements FlyBehavior{
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}

}
