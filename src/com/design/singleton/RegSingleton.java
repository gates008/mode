package com.design.singleton;
/**
 * 登记式单例模式
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
	 * 保护的默认构造子
	 */ 
	 protected RegSingleton() {} 
	 /** 
	 * 静态工厂方法，返还此类惟一的实例
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
	 * 一个示意性的商业方法
	 */ 
	 public String about() 
	 { 
		 return "Hello， I am RegSingleton."; 
	 }
}
