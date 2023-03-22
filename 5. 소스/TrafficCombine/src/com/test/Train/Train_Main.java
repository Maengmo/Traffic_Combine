package com.test.Train;

public class Train_Main {

	public static void main(String[] args) {
		
		Train_Route_data.Select("ITX","");
		Train_Route_data.findFile("용산역", "왕십리역");
		Train_Route_data.print();
		
	}
	
	public static void Train_print() {
		
		Train_UI.list();
		Train_data.Select("2");
		Train_data.load();
		Train_data.print();
		
	}

}
