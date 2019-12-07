package com.design.factory;
/**
* @author 作者
* @version 创建时间：2019年1月30日 下午3:02:31
* 类说明
*/
public class Client {

	public static void main(String[] args) {
		User user=new User();

//        IFactory factory=new OracleFactory();
//        IUser iuser=factory.createUser();
//
//        iuser.getUser(1);
//        iuser.insert(user);
//        iuser.loginInfoInsert(user);
        IFactory f = new EasyFactory();
        MysqlUser u= (MysqlUser)f.getUserInstance();
        u.insert(user);
        
	}

}
