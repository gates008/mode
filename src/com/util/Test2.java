package com.util;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;

/**
* @author 作者
* @version 创建时间：2019年1月14日 上午10:39:42
* 类说明
*/
class Test2 {

	@Test
	void test() {
		long start = System.currentTimeMillis();
		System.out.println(start);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println( System.currentTimeMillis() );
		  System.out.println( System.currentTimeMillis() - start);

		  System.out.printf("添加耗时：%dms\n", System.currentTimeMillis() - start);
	}


}


