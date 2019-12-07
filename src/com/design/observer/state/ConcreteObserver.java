package com.design.observer.state;
/**
* @author 作者
* @version 创建时间：2019年3月26日 下午2:48:07
* 类说明
*/
public class ConcreteObserver implements Observer {
	// 具体观察者内部维持一个ConcreteSubject类型的指向具体主题的引用
	ConcreteSubject subject;
	Object state;
 
	public ConcreteObserver(ConcreteSubject subject)
	{
		if(subject==null)   //观察者不能监听null 
			throw new NullPointerException();
	    this.subject = subject;
		this.subject.registerObserver(this);
	}
        //解除对主题的依赖（注册）
	public void unRegister()
	{
		this.subject.removeObserver(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		state = this.subject.getState();
		// hashCode用于区别不同的观察者
		System.out.println(this.hashCode() + "I'm notified!!");

	}

}
