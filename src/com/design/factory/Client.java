package com.design.factory;
/**
* @author ����
* @version ����ʱ�䣺2019��1��30�� ����3:02:31
* ��˵��
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
