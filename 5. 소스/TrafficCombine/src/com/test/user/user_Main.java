package com.test.user;

public class user_Main {

	public static void main(String[] args) {
		
		user_data.load();
		//user_UI.join();
		user_Service.login();
		user_deposit.deposit_UI(user_Service.LOGIN_NOW);
		user_data.save();
		
		
	}

}
