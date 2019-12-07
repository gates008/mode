package com.design.strategy;

import com.design.strategy.fly.FlyBehavior;
import com.design.strategy.quack.QuackBehavior;

/**
* @author 作者
* @version 创建时间：2019年3月25日 下午5:44:07
* 类说明
*/
public abstract class Duck {
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	//不同的鸭子长相不同
		abstract void display();
	        //将飞行行为委托给飞行行为类处理
		public void performFly() {
			flyBehavior.fly();
		}
	        //将呱呱叫行为委托给呱呱叫行为类处理
		public void performQuack() {
			quackBehavior.quack();
		}
	        //所有鸭子都会浮水
		public void swim() {
			System.out.println("All ducks float, even decoys!");
		}
}
