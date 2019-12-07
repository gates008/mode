package com.design.adpter;
/**
* @author 作者
* @version 创建时间：2019年1月31日 下午3:07:29
* 类说明 继承的方式实现适配器模式
*/
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

    public void powerWithThreePlug() {
        System.out.print("通过继承适配器类实现 ");
        this.powerWithTwo();
    }

}