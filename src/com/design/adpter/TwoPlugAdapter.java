package com.design.adpter;
/**
* @author ����
* @version ����ʱ�䣺2019��1��31�� ����2:47:26
* ��˵�� ����������ʵ��Ŀ��ӿڣ�ͬʱ�ѱ���������ϵ�Ŀ��ӿڷ�����
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
    
    //��дʵ�ֽӿڵķ������Ѷ���Ĺ���������װ�����๩������
    public void powerWithThreePlug() {
     //   System.out.println("ͨ��ת��");
        gbTwoPlug.powerWithTwo();
    }
}
