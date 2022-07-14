package com.design.singleton;
/**
 * ¿¡∫∫ Ωµ•¿˝¿‡
 * @author Administrator
 *
 */
public class LazySingleton {
	
	private LazySingleton() {
	}
	
	public static LazySingleton l = null;
	
	public static LazySingleton getInstance() {
		if(l == null) {
			l = new LazySingleton();
		}
		return l;
	}
	
	public void print() {
		System.out.println("LazySingleton..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazySingleton.getInstance().print();;

	}

}
