package com.design.observer.state;
/**
* @author ����
* @version ����ʱ�䣺2019��3��26�� ����2:47:09
* ��˵��
*/
public class ConcreteSubject extends Subject {
	Object state;//�������Ȿ���״̬
	
	public Object getState()
	{
		return state;
	}
 
	public void setState(Object state)
	{
		this.state = state;
	}

}
