package com.sy;
/**
* @author ����
* @version ����ʱ�䣺2019��1��18�� ����10:01:20
* ��˵��
*/
public class Test004 implements Runnable{

	  static Test004 t1 = new Test004();
	    static Test004 t2 = new Test004();
	 
		public static void main(String[] args) {
	        Thread  th1 =new Thread(t1);
	        Thread  th2 =new Thread(t2);
	        th1.start();
	        th2.start();
	        
		}
		@Override
		public void run() {
			if("Thread-0".equals(Thread.currentThread().getName())) {
				this.method1();
			}else {
				this.method2();
			}
		}
		
		synchronized void method1 () {
			System.out.println("start:"+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("end:"+Thread.currentThread().getName());
		}
		 void method2 () {
			System.out.println("start:"+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("end:"+Thread.currentThread().getName());
		}
}
