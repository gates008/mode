package com.design.adpter;
/**
* @author ����
* @version ����ʱ�䣺2019��1��31�� ����3:07:29
* ��˵�� �̳еķ�ʽʵ��������ģʽ
*/
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

    public void powerWithThreePlug() {
        System.out.print("ͨ���̳���������ʵ�� ");
        this.powerWithTwo();
    }

}