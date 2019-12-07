package com.design.factory;
/**
* @author 作者
* @version 创建时间：2019年1月30日 下午2:55:24
* 类说明
*/
public interface IUser {
	public void insert(User user);
    public User getUser(int uid);
    public void loginInfoInsert(User user);
    
}
