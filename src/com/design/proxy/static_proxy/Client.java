package com.design.proxy.static_proxy;

import com.design.proxy.static_proxy.impl.Car;
import com.design.proxy.static_proxy.impl.CarLogProxy;
import com.design.proxy.static_proxy.impl.CarTimeProxy;

/**
* @author ����
* @version ����ʱ�䣺2019��4��2�� ����11:08:02
* ��˵��
*/
public class Client {

	public static void main(String[] args) {
	      Car car1 = new Car();
	      CarLogProxy carLogProxy = new CarLogProxy(car1);
	      CarTimeProxy carTimeProxy = new CarTimeProxy(carLogProxy);
//
	      carTimeProxy.move();
//	      carLogProxy.move();
	   }

	   //��������:������ڸ����realsubject ��Ҫ�¼�������ô������Ҫ�½�����������������͡�
	   //��̬��������ʵ�ֶԲ�ͬ�࣬��ͬ�����Ĵ���

}
