package com.sy;
/**
* @author ����
* @version ����ʱ�䣺2019��1��17�� ����10:27:33
* ��˵��
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
