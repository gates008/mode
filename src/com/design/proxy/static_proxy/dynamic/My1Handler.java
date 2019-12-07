package com.design.proxy.static_proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
* @author ����
* @version ����ʱ�䣺2019��4��2�� ����2:52:19
* ��˵��
*/
public class My1Handler implements InvocationHandler {

	private Object target;//����������

    public My1Handler(Object target) {
        this.target = target;
    }

    /* (non-Javadoc)
     * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     * proxy--ָ�������Ķ��󣨸о�java������������ֲ����Ǻܺã�
     * method--����������ķ���
     * args:����������ķ�������
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		    System.out.println("1������ʼ������1...");
	        method.invoke(target, args);//���б���������ķ��������÷���Ļ��ơ�
	        System.out.println("1�������н���1...");
	        return null;
	}

}