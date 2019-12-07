package com.design.adpter;
/**
* @author 作者
* @version 创建时间：2019年1月31日 下午2:47:26
* 类说明 这个类完成了实现目标接口，同时把被适配类组合到目标接口方法中
*/
public class TwoPlugAdapter implements ThreePlugIf {
private GBTwoPlug gbTwoPlug;
private ThreePlugIf impl;
    
	public ThreePlugIf getImpl() {
		return impl;
	}
	
	public void setImpl(ThreePlugIf impl) {
		this.impl = impl;
	}

	public TwoPlugAdapter(GBTwoPlug twoPlug) {
        this.gbTwoPlug = twoPlug;
    }
    
    //重写实现接口的方法，把二相的供电能力包装成三相供电能力
    public void powerWithThreePlug() {
     //   System.out.println("通过转换");
        gbTwoPlug.powerWithTwo();
    }
}
