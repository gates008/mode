package com.design.strategy;

import com.design.strategy.fly.impl.FlyRocketPowered;

/**
* @author ����
* @version ����ʱ�䣺2019��3��25�� ����5:56:34
* ��˵��
*/
public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck	mallard = new MallardDuck();
//		RubberDuck	rubberDuckie = new RubberDuck();
//		DecoyDuck	decoy = new DecoyDuck();
//		ModelDuck	model = new ModelDuck();
 
		mallard.performQuack();
		
//		rubberDuckie.performQuack();
//		decoy.performQuack();
//   
//		model.performFly();	
//		model.setFlyBehavior(new FlyRocketPowered());
//		model.performFly();


	}

}
