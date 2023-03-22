package com.test.project;

import java.util.Scanner;

import com.test.user.*;
import com.test.search.*;

public class Main {

	public static void main(String[] args) {
		
		Start();
		//UI.SeatUI("AIRPLANE");
		
	}
	
	public static void Start() {
		
		boolean loop = true;
		Scanner scan = new Scanner(System.in);
		
		while (loop) {
			
			UI.mainMenu();
			
			System.out.print("원하시는 서비스를 입력하세요 : ");
			String sel = scan.nextLine();
			
			if(sel.equals("1")) {
				SearchUI.selectMenu();
			} else if(sel.equals("2")) {
				UI.subMenu("로그인"); 
				if(user_Service.login()) {
					UI.loginloop();
				};
				
			} else if(sel.equals("3")) {
				UI.subMenu("회원가입");
				user_UI.join();
			} else if(sel.equals("4")) {
				System.exit(0);
				loop = false;
			} else {
				loop = false;
			}
			UI.pause();
		}//while(menu)
	}

}