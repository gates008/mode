package com.design.observer.primary;

import com.design.observer.primary.impl.ConcreteObserver;
import com.design.observer.primary.impl.ConcreteSubject;

/**
* @author ����
* @version ����ʱ�䣺2019��3��26�� ����2:17:58
* ��˵��
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
		subject.registerObserver(o1);//�����ظ�ע��
 
		subject.notifyObservers();

	}

}
