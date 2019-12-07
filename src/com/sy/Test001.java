package com.sy;
/**
* @author 作者
* @version 创建时间：2019年1月17日 上午10:27:33
* 类说明
*/
public class Test001 implements Runnable{

	static Test001 test = new Test001();
	static int i =0;
	public static void main(String[] args) throws InterruptedException {
       Thread t = new Thread(test);
       Thread t1 = new Thread(test);
       t.start();
       t1.start();
       t.join();
       t1.join();
       System.out.println(i);
	}
	@Override
	public  void run() {
		for(int j=0;j<100000;j++) {
			i++;
		}
	}
}
