package com.design;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
* @author 作者
* @version 创建时间：2019年1月30日 下午1:46:07
* 类说明
*/
public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = Student.getStudentInstance();
		Student s2 = Student.getStudentInstance();
		if(s1==s2) {
			System.out.println(Singleton.class.getName() + "同一个");
		}else {
			System.out.println(Singleton.class.getName() + "不同一个");
		}
		Singleton s = new Singleton();
		Map<String,String> map =s.getProperties();
		System.out.println(map.get("name"));
	}
	public  Map<String,String> getProperties() {
		Properties prop = new Properties();
		InputStream in =getClass().getResourceAsStream("type.properties");
		Map<String,String> map = new HashMap<String,String>();
		try {
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Enumeration en = prop.propertyNames();
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();
			String value = prop.getProperty(key);
			map.put(key, value);
		}
		return map;
	}

}
class Student {
	private static Student student;
	public static Student getStudentInstance() {
		if(student==null) {
			student= new Student();
		}
		return student;
	}
	/**
	 * 
	 */
	private Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	private int name ;
	
}
