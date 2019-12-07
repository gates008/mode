package com.design.proxy.static_proxy.impl;

import com.design.proxy.static_proxy.Moveable;

/**
* @author 作者
* @version 创建时间：2019年4月2日 上午11:22:05
* 类说明
*/
public class CarTimeProxy implements Moveable {

	 private Moveable moveable;//同上所示

	    public CarTimeProxy(Moveable moveable) {
	        super();
	        this.moveable = moveable;
	    }

	    @Override
	    public void move() {
	        long starttime = System.currentTimeMillis();
	        System.out.println("汽车开始行驶");
	        moveable.move();
	        long endtime = System.currentTimeMillis();
	        System.out.println("汽车行驶结束，行驶了"+(endtime-starttime)+" 毫秒");
	    }

}
