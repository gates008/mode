package com.design.adpter;
/**
* @author 作者
* @version 创建时间：2019年1月31日 下午2:49:07
* 类说明
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
