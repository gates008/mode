package com.design.factory;
/**
* @author 作者
* @version 创建时间：2019年1月30日 下午2:59:34
* 类说明
*/
public interface IFactory {
	 public IUser createUser();
	 
	 public Object getUserInstance();
}
