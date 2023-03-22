package com.test.user;

import java.util.ArrayList;
import java.util.Scanner;

public class user_Service {
	
	public static String LOGIN_NOW = "";
	public static boolean login() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID : ");
		String id = scan.next();
		
		System.out.print("PW : ");
		String pw = scan.next();
		
		if(user_data.login_check(id, pw)) {
			System.out.println("로그인이 완료되었습니다.");
			user_data.user_file(id);
			LOGIN_NOW=id;
			return true;
		}else {
			System.out.println("로그인에 실패하였습니다.");
			return false;
		}
		
	}
	
	

}
