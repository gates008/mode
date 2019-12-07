package com.design.proxy.static_proxy.impl;

import com.design.proxy.static_proxy.Moveable;

/**
* @author 作者
* @version 创建时间：2019年4月2日 上午11:07:13
* 类说明
*/
public class CarLogProxy implements Moveable {

	 private Moveable moveable;//将movable 类型的对象聚合进来，其实movable是一个接口，这里用到了多态的概念。

	    public CarLogProxy(Moveable moveable) {
	        super();
	        this.moveable = moveable;
	    }

	    @Override
	    public void move() {
	        System.out.println("日志开始...");
	        moveable.move();
	        System.out.println("日志结束...");
	    }
}
