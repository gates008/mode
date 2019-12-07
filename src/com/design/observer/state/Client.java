package com.design.observer.state;
/**
* @author 作者
* @version 创建时间：2019年3月26日 下午2:53:17
* 类说明
*/
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject concreteSubject = new ConcreteSubject();
		ConcreteObserver o1 = new ConcreteObserver(concreteSubject);
		ConcreteObserver o2 = new ConcreteObserver(concreteSubject);
 
		concreteSubject.notifyObservers();
		o1.unRegister();
		o2.unRegister();
		concreteSubject.notifyObservers();
	}

}
