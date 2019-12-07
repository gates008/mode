package com.design.factory;
/**
* @author 作者
* @version 创建时间：2019年1月30日 下午3:00:37
* 类说明
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
