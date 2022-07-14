package com.design.templatemethod;

public abstract class AbstractClass {
	
	/**
	 * /模板 标准化吃
	 */
    public void TemplateMethod()
    {
        doOperation1();

        doOperation2();

        doOperation3();
    }

    /**
     * 制做面饼
     */
    protected abstract void doOperation1();
    
    /**
     * 放调料
     */
    protected abstract void doOperation2();

    /**
     * 吃饭
     */
    private final void doOperation3()
    {
        System.out.println("吃饭");
    }
}
