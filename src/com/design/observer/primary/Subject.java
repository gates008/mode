package com.design.observer.primary;
/**
* @author 作者
* @version 创建时间：2019年3月26日 下午2:14:38
* 类说明
*/
public interface Subject {
	public void registerObserver(Observer o);
	 
	public void removeObserver(Observer o);
 
	public void notifyObservers();

}
