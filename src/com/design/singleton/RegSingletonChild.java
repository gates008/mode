package com.design.singleton;

public class RegSingletonChild extends RegSingleton{

		// TODO Auto-generated method stub
		public RegSingletonChild() {} 
		 /** 
		 * ��̬��������
		 */ 
		 static public RegSingletonChild getInstance() 
		 { 
			 return (RegSingletonChild)  RegSingleton.getInstance( 
			 "com.javapatterns.singleton.demos.RegSingletonChild" ); 
		 } 
		 /** 
		 * һ��ʾ���Ե���ҵ����
		 */ 
		 public String about() 
		 { 
			 return "Hello�� I am RegSingletonChild."; 
		 }
		 
		 public static void main(String[] args) {
				// TODO Auto-generated method stub

		 }

}
