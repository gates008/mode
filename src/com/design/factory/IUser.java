package com.design.factory;
/**
* @author ����
* @version ����ʱ�䣺2019��1��30�� ����2:55:24
* ��˵��
*/
public interface IUser {
	public void insert(User user);
    public User getUser(int uid);
    public void loginInfoInsert(User user);
    
}
