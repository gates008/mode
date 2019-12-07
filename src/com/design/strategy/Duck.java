package com.design.strategy;

import com.design.strategy.fly.FlyBehavior;
import com.design.strategy.quack.QuackBehavior;

/**
* @author ����
* @version ����ʱ�䣺2019��3��25�� ����5:44:07
* ��˵��
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

	//��ͬ��Ѽ�ӳ��಻ͬ
		abstract void display();
	        //��������Ϊί�и�������Ϊ�ദ��
		public void performFly() {
			flyBehavior.fly();
		}
	        //�����ɽ���Ϊί�и����ɽ���Ϊ�ദ��
		public void performQuack() {
			quackBehavior.quack();
		}
	        //����Ѽ�Ӷ��ḡˮ
		public void swim() {
			System.out.println("All ducks float, even decoys!");
		}
}
