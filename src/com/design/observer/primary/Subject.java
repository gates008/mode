package com.design.observer.primary;
/**
* @author ����
* @version ����ʱ�䣺2019��3��26�� ����2:14:38
* ��˵��
*/
public interface Subject {
	public void registerObserver(Observer o);
	 
	public void removeObserver(Observer o);
 
	public void notifyObservers();

}
