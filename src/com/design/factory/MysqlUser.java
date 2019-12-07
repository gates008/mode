package com.design.factory;
/**
* @author 作者
* @version 创建时间：2019年1月30日 下午2:57:15
* 类说明
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
