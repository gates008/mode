package com.design.factory;
/**
* @author ����
* @version ����ʱ�䣺2019��1��30�� ����2:57:15
* ��˵��
*/
public class MysqlUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("mysql insert");
		
	}

	@Override
	public User getUser(int uid) {
		// TODO Auto-generated method stub
		return new User();
	}

	@Override
	public void loginInfoInsert(User user) {
		// TODO Auto-generated method stub
		
	}

}
