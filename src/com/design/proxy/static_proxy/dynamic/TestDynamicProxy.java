package com.design.proxy.static_proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.design.proxy.static_proxy.Moveable;
import com.design.proxy.static_proxy.impl.Car;

/**
* @author ����
* @version ����ʱ�䣺2019��4��2�� ����2:23:01
* ��˵��
*/
public class TestDynamicProxy {

	public static void main(String[] args) {
		  Car car = new Car();
	      InvocationHandler handler = new MyHandler(car);
	      InvocationHandler handler1 = new My1Handler(handler);
	      Class<?> cs = car.getClass();
	      /*
	       * @param ��  classloader �����������������
	       * @param : interfaces ���������ʵ�ֵĽӿ�
	       * @param ��  Invocationhandler handler /����
	       */
	      Moveable moveable=(Moveable)Proxy.newProxyInstance(cs.getClassLoader(),
	              cs.getInterfaces(), handler1);//��һ����̬���ɴ������ moveable
	      moveable.move();
	}

}
