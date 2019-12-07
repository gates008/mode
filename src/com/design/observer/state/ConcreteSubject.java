package com.design.observer.state;
/**
* @author 作者
* @version 创建时间：2019年3月26日 下午2:47:09
* 类说明
*/
public class ConcreteSubject extends Subject {
	Object state;//具体主题本身的状态
	
	public Object getState()
	{
		return state;
	}
 
	public void setState(Object state)
	{
		this.state = state;
	}

}
