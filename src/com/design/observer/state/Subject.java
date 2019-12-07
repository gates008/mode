package com.design.observer.state;

import java.util.ArrayList;
import java.util.List;

/**
* @author ����
* @version ����ʱ�䣺2019��3��26�� ����2:45:17
* ��˵��  ���������ɫ
*/
public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	 
	public void registerObserver(Observer o)
	{
		if (o == null)
			throw new NullPointerException();
		// ����ͬһ���۲���ע����
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
