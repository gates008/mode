package com.design.strategy.quack.impl;

import com.design.strategy.quack.QuackBehavior;

/**
* @author 作者
* @version 创建时间：2019年3月25日 下午6:16:24
* 类说明
*/
public class FakeQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Qwak");
	}

}
