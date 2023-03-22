package com.test.user;

public class user_milige {
	
	public static int milige(String id) {
		
		int milige = Integer.parseInt(user_data.milige_check(id));
		
		return milige;
	}
	
	public static String plus_Milige(int point) {
		
		int milige = milige(user_Service.LOGIN_NOW);
		
		String sum = milige+point+"";
		
		return sum;
	}
	
//	public static String Minus_Milige(int point) {
//		
//		int milige = milige(user_Service.LOGIN_NOW);
//		
//		String sum = milige-point+"";
//		
//		return sum;
//	}
	
	
			
}
