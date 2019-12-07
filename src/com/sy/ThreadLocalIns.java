package com.sy;

import java.util.Random;

/**
* @author ä½œè??
* @version åˆ›å»ºæ—¶é—´ï¼?2019å¹?1æœ?30æ—? ä¸Šåˆ10:13:11
* ç±»è¯´æ˜?
*/
public class ThreadLocalIns {

	public static ThreadLocal<Integer> thread = new ThreadLocal<Integer>();
	
	public static void main(String[] args) {
		  new ThreadLocalIns().init();
	}
	 private void init(){
       //  for(int i =0;i<2;i++){
              new Thread(new Runnable() {
                   public void run() {
                        int data = new Random().nextInt();
                        thread.set(data);
                        Student.getInstance().setName(Thread.currentThread().getName()); 
                        Student.getInstance().setId(data);
                        new A().get(); 
                        new B().get();
               } 
          }).start();
      // }
   } 
	//A
	 class A {
	 	 Student person = Student.getInstance();
	      public void get(){
	    	  int data =thread.get();
	           System.out.println("A£º-"+Thread.currentThread().getName()+":name:"+person.getName()+":id:"+person.getId()+"data:"+data);
	         }
	 }
	 //B
	 class B {
	 	 Student person = Student.getInstance();
	      public void get(){
	    	   int data =thread.get();
	           System.out.println("B£º-"+Thread.currentThread().getName()+":name:"+person.getName()+":id:"+person.getId()+"data:"+data);
	      }
	 }


}

class Student {
	 private static ThreadLocal<Student>  threadLocal = new ThreadLocal<Student>(); 
	/**
	 * not new Student
	 */
	private Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Student getInstance() {
		Student student = threadLocal.get();
		if(student==null){
			student = new Student();
            threadLocal.set(student);
       }
       return student;
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}