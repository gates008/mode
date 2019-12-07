package com.design.observer.state;
/**
* @author ����
* @version ����ʱ�䣺2019��3��26�� ����2:53:17
* ��˵��
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
