package com.design.factory;
/**
* @author ����
* @version ����ʱ�䣺2019��1��30�� ����3:00:19
* ��˵��
*/
public class MysqlFactory implements IFactory {

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new MysqlUser();
	}

	@Override
	public Object getUserInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
