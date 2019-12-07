package com.design.factory;

import java.io.BufferedReader;
import java.io.FileReader;

import org.json.JSONObject;

/**
* @author 作者
* @version 创建时间：2019年1月30日 下午3:40:14
* 类说明
*/
public class EasyFactory implements IFactory{
	private static String packName;
    private static String db;

    // 读取配置文件内容，初始化变量值
    static {
        try {
            FileReader fileReader = new FileReader("E:\\Program Files\\eclipse\\eclipse-workspace\\test\\src\\com\\design\\factory\\type.json");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer config = new StringBuffer();
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
                config.append(s);
            }
            bufferedReader.close();
            JSONObject jsonObject = new JSONObject(config.toString());

            packName = jsonObject.getString("packName");
            db = jsonObject.getString("DB");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  IUser createUser()  {
        String className = packName + "." + db + "User";
        try {
			return (IUser) Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }
    public static void main(String main[]) {
    	System.out.println(packName + "." + db + "User");
    }

	

	@Override
	public Object getUserInstance() {
	      try {
	    	String className = packName + "." + db + "User";
			return (IUser) Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
