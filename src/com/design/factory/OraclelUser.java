package com.design.factory;
/**
* @author 作者
* @version 创建时间：2019年1月30日 下午2:58:54
* 类说明
*/
public class OraclelUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("oracle insert");

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
