package com.test.Airplane;


public class AirPlane_Main {

	public static void main(String[] args) {
		
		//AirPlane_Route_data.load();
		AirPlane_Route_data.findFile("김포 공항", "원주 공항");
		AirPlane_Route_data.print();
		
//		Train_Route_data.Select("ITX","");
//		Train_Route_data.findFile("용산역", "왕십리역");
//		Train_Route_data.print();

	}

}
