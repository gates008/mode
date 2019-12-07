package com.design.observer.state;

import java.util.ArrayList;
import java.util.List;

/**
* @author 作者
* @version 创建时间：2019年3月26日 下午2:45:17
* 类说明  抽象主题角色
*/
public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	 
	public void registerObserver(Observer o)
	{
		if (o == null)
			throw new NullPointerException();
		// 避免同一个观察者注册多次
		if (!observers.contains(o))
		{
			observers.add(o);
		}
	}
 
	public void removeObserver(Observer o)
	{
		observers.remove(o);
	}
 
	public void notifyObservers()
	{
		for (Observer o : observers)
		{
			o.update();
		}
	}

}
