package com.design.observer.primary.impl;

import java.util.ArrayList;
import java.util.List;

import com.design.observer.primary.Observer;
import com.design.observer.primary.Subject;

/**
* @author 作者
* @version 创建时间：2019年3月26日 下午2:16:09
* 类说明
*/
public class ConcreteSubject implements Subject {

	List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void registerObserver(Observer o)
	{
		if (o == null)
			throw new NullPointerException();
		if (!observers.contains(o))
		{
			observers.add(o);
		}
	}
 
	@Override
	public void removeObserver(Observer o)
	{
		observers.remove(o);
 
	}
 
	@Override
	public void notifyObservers()
	{
		for (Observer o : observers)
			o.update();
	}

}
