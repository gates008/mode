package com.design.strategy;

import com.design.strategy.fly.impl.FlyRocketPowered;

/**
* @author 作者
* @version 创建时间：2019年3月25日 下午5:56:34
* 类说明
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
