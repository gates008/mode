package com.util;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;

/**
* @author 作者
* @version 创建时间：2019年1月24日 下午5:53:02
* 类说明
*/
public class Test3 {

	public static void main(String[] args) throws UnsupportedEncodingException {
			String str ="[19-1-14 9:23:12:614 CST] 00000084 SystemOut     O INFO  [WebContainer : 0] - 执行的命令INSERT INTO BGT_PARAS_MANAGE VALUES ('10656','1841','1841..§......±....・............¤>\r\n" + 
					"....................', '11','..§......±....・............¤....................','1841','1','2019-01-14 09:14:25.518159','036947',CURRENT DATE )";
			String temp=new String(str.getBytes("iso-8859-1"),"gb2312"); 
			System.out.println(temp);
	}

}
