package com.sy;
/**
* @author ����
* @version ����ʱ�䣺2019��1��17�� ����3:59:35
* ��˵��
*/
public class Test003 implements Runnable{

    static Test003 t1 = new Test003();
    static Test003 t2 = new Test003();

	public static void main(String[] args) {
        Thread  th1 =new Thread(t1);
        Thread  th2 =new Thread(t2);
        th1.start();
        th2.start();
        
	}
	@Override
	public void run() {
		synchronized(this) {
			System.out.println("start:"+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("end:"+Thread.currentThread().getName());
		}
		
	}
}
