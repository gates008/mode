package com.design.observer.primary;

import com.design.observer.primary.impl.ConcreteObserver;
import com.design.observer.primary.impl.ConcreteSubject;

/**
* @author 作者
* @version 创建时间：2019年3月26日 下午2:17:58
* 类说明
*/
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new ConcreteSubject();
		 
		Observer o1 = new ConcreteObserver();
		Observer o2 = new ConcreteObserver();
		Observer o3 = new ConcreteObserver();
 
		subject.registerObserver(o1);
		subject.registerObserver(o2);
		subject.registerObserver(o3);
		subject.registerObserver(o1);//测试重复注册
 
		subject.notifyObservers();

	}

}
