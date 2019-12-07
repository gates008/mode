package com.design.proxy.static_proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
* @author 作者
* @version 创建时间：2019年4月2日 下午2:52:19
* 类说明
*/
public class My1Handler implements InvocationHandler {

	private Object target;//被代理对象

    public My1Handler(Object target) {
        this.target = target;
    }

    /* (non-Javadoc)
     * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     * proxy--指被代理的对象（感觉java这个参数的名字并不是很好）
     * method--被代理对象的方法
     * args:被代理对象的方法参数
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		    System.out.println("1汽车开始运行了1...");
	        method.invoke(target, args);//运行被代理对象的方法，采用反射的机制。
	        System.out.println("1汽车运行结束1...");
	        return null;
	}

}
