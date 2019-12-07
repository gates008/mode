package com.sy;
/**
* @author 作者
* @version 创建时间：2019年1月18日 上午10:01:20
* 类说明
*/
public class Test6 implements Runnable{

	  static Test6 t1 = new Test6();
	    static Test6 t2 = new Test6();
	 
		public static void main(String[] args) {
	        Thread  th1 =new Thread(t1);
	        Thread  th2 =new Thread(t2);
	        th1.start();
	        th2.start();
	        
		}
		@Override
		public void run() {
			if("Thread-0".equals(Thread.currentThread().getName())) {
				method1();
			}else {
				this.method2();
			}
		}
		static synchronized void method1 () {
			System.out.println("start:"+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("end:"+Thread.currentThread().getName());
		}
		synchronized void method2 () {
			System.out.println("start:"+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("end:"+Thread.currentThread().getName());
		}
}
