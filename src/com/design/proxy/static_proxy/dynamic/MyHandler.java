package com.design.proxy.static_proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
* @author 作者
* @version 创建时间：2019年4月2日 下午2:21:26
* 类说明
*/
public class MyHandler implements InvocationHandler {
	private Object target;//被代理对象

    public MyHandler(Object target) {
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
		    System.out.println("汽车开始运行了...");
	        method.invoke(target, args);//运行被代理对象的方法，采用反射的机制。
	        System.out.println("汽车运行结束...");
	        return null;
	}

}
