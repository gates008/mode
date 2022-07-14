package com.design.singleton;
/**
 * ����ʽ������
 * ������ֻ����һ��ʵ����
 * ����������Լ������Լ���Ωһ��ʵ����
 * �����������������������ṩ��һʵ����
 * @author Administrator
 *
 */
public class EagerSingleton {
	/** 
	 * ˽�е�Ĭ�Ϲ�����
	 */
	private EagerSingleton() {
		
	}
	/** 
	 * ��̬��������
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
