package com.sy;

import javax.swing.event.TreeWillExpandListener;

/**
* @author 作者
* @version 创建时间：2019年1月17日 下午3:41:17
* 类说明
*/
public class Test002 implements Runnable{
    static Test002 t = new Test002();
    Object o1 = new Object();
    Object o2 = new Object();
	public static void main(String[] args) {
        Thread  th1 =new Thread(t);
        Thread  th2 =new Thread(t);
        th1.start();
        th2.start();
        
	}
	@Override
	public void run() {
		synchronized(o1) {
			System.out.println("start_this:"+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("end_this:"+Thread.currentThread().getName());
		}
		synchronized(o2) {
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
