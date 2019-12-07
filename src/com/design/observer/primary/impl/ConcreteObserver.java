package com.design.observer.primary.impl;

import com.design.observer.primary.Observer;

/**
* @author 作者
* @version 创建时间：2019年3月26日 下午2:17:14
* 类说明
*/
public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		  //加入hashCode以区别不同的对象
	      System.out.println(this.hashCode()+"  says: I'm notified !");
	}

}
