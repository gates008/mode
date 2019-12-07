package com.design.factory;
/**
* @author 作者
* @version 创建时间：2019年1月30日 下午3:00:19
* 类说明
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
