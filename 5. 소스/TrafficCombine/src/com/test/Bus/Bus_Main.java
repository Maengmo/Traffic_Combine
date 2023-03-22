package com.test.Bus;

public class Bus_Main {

	public static void main(String[] args) {
		
		//Bus_data.load();
		//Bus_data.print();
		Bus_UI.list();
		Bus_data.select("16");
		Bus_data.load();
		Bus_data.print();
		

	}

}
