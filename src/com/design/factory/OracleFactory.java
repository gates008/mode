package com.design.factory;
/**
* @author ����
* @version ����ʱ�䣺2019��1��30�� ����3:00:37
* ��˵��
*/
public class OracleFactory implements IFactory {

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new OraclelUser();
	}

	@Override
	public Object getUserInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
