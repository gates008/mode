package com.design.adpter;
/**
* @author ����
* @version ����ʱ�䣺2019��1��31�� ����2:49:07
* ��˵��
*/
public class AdapterMain {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GBTwoPlug plug = new GBTwoPlug();
		TwoPlugAdapter adpter = new TwoPlugAdapter(plug);
		adpter.powerWithThreePlug();
		adpter.setImpl(new ThreePlugIfImpl());
		adpter.getImpl().powerWithThreePlug();
		
	}

}
