package com.design.singleton;

public class RegSingletonChild extends RegSingleton{

		// TODO Auto-generated method stub
		public RegSingletonChild() {} 
		 /** 
		 * 静态工厂方法
		 */ 
		 static public RegSingletonChild getInstance() 
		 { 
			 return (RegSingletonChild)  RegSingleton.getInstance( 
			 "com.javapatterns.singleton.demos.RegSingletonChild" ); 
		 } 
		 /** 
		 * 一个示意性的商业方法
		 */ 
		 public String about() 
		 { 
			 return "Hello， I am RegSingletonChild."; 
		 }
		 
		 public static void main(String[] args) {
				// TODO Auto-generated method stub

		 }

}
