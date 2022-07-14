package com.design.templatemethod;

public abstract class AbstractClass {
	
	/**
	 * /ģ�� ��׼����
	 */
    public void TemplateMethod()
    {
        doOperation1();

        doOperation2();

        doOperation3();
    }

    /**
     * �������
     */
    protected abstract void doOperation1();
    
    /**
     * �ŵ���
     */
    protected abstract void doOperation2();

    /**
     * �Է�
     */
    private final void doOperation3()
    {
        System.out.println("�Է�");
    }
}
