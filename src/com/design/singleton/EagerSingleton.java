package com.design.singleton;
/**
 * 饿汉式单例类
 * 单例类只可有一个实例。
 * 单例类必须自己创建自己这惟一的实例。
 * 单例类必须给所有其他对象提供这一实例。
 * @author Administrator
 *
 */
public class EagerSingleton {
	/** 
	 * 私有的默认构造子
	 */
	private EagerSingleton() {
		
	}
	/** 
	 * 静态工厂方法
	 */
	public static final EagerSingleton e = new EagerSingleton();
	
	public static EagerSingleton getInstance() {
		return e;
	}
	
	public void print() {
		System.out.print("EagerSingleton...");
	}
	
	public static void main(String[] args) {
		EagerSingleton.getInstance().print();;

	}

}
