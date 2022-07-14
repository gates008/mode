package com.design.singleton;
/**
 * �Ǽ�ʽ����ģʽ
 */
import java.util.HashMap;

public class RegSingleton {
	
	static private HashMap m_registry = new HashMap();
	static 
	 { 
		 RegSingleton x = new RegSingleton(); 
		 m_registry.put( x.getClass().getName(), x); 
	 } 
	 /** 
	 * ������Ĭ�Ϲ�����
	 */ 
	 protected RegSingleton() {} 
	 /** 
	 * ��̬������������������Ωһ��ʵ��
	 */ 
	  public static RegSingleton getInstance(String name) 
	 { 
		 if (name == null) 
		 { 
			 name = "com.javapatterns.singleton.demos.RegSingleton"; 
		 } 
		 if (m_registry.get(name) == null) 
		 { 
			 try 
			 { 
				 m_registry.put( name, Class.forName(name).newInstance() ) ; 
			 } 
			 catch(Exception e) 
			 { 
				 System.out.println("Error happened."); 
			 } 
		 } 
	 return (RegSingleton) (m_registry.get(name) ); 
	 } 
	 /** 
	 * һ��ʾ���Ե���ҵ����
	 */ 
	 public String about() 
	 { 
		 return "Hello�� I am RegSingleton."; 
	 }
}
