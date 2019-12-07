package com.design.proxy.static_proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.design.proxy.static_proxy.Moveable;
import com.design.proxy.static_proxy.impl.Car;

/**
* @author 作者
* @version 创建时间：2019年4月2日 下午2:23:01
* 类说明
*/
public class TestDynamicProxy {

	public static void main(String[] args) {
		  Car car = new Car();
	      InvocationHandler handler = new MyHandler(car);
	      InvocationHandler handler1 = new My1Handler(handler);
	      Class<?> cs = car.getClass();
	      /*
	       * @param ：  classloader 被代理对象的类加载器
	       * @param : interfaces 被代理对象实现的接口
	       * @param ：  Invocationhandler handler /子类
	       */
	      Moveable moveable=(Moveable)Proxy.newProxyInstance(cs.getClassLoader(),
	              cs.getInterfaces(), handler1);//这一步动态生成代理对象 moveable
	      moveable.move();
	}

}
