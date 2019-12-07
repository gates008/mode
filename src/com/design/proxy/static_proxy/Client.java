package com.design.proxy.static_proxy;

import com.design.proxy.static_proxy.impl.Car;
import com.design.proxy.static_proxy.impl.CarLogProxy;
import com.design.proxy.static_proxy.impl.CarTimeProxy;

/**
* @author 作者
* @version 创建时间：2019年4月2日 上午11:08:02
* 类说明
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

	   //引入问题:如果现在更多的realsubject 需要事件代理，那么现在需要新建多个代理类吗？类膨胀。
	   //动态产生代理，实现对不同类，不同方法的代理。

}
