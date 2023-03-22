package com.test.reservation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import com.test.project.UI;
import com.test.search.RouteData;
import com.test.user.user_Join;
import com.test.user.user_Service;
import com.test.user.user_data;
import com.test.user.user_reservationUI;



public class CheckReservation {
	
	public static String rvnum1;
	
	
	public static void aaa() { 
	String userid = user_Service.LOGIN_NOW;
	
	Path path = Paths.get("/Users/kimdaehwan/Desktop/class/code/java/TrafficCombine/userFile/reservationList.txt");
	
	try {
		String content = Files.readString(path);
		String[] temp = content.split("/");
		int a = temp.length;
		for(int i = 0; i<a; i++) {
			if(temp[i].contains(userid)) {
				System.out.print(temp[i]);
				System.out.println();
			}
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
	

	
	public static void load() {
		
		Scanner scan = new Scanner(System.in);
		
		user_reservationUI.reservationUI();
		
		System.out.println();
		
		
		System.out.println("1.결제 영수증 출력");
		System.out.println("2.예약취소");
		System.out.println("3.이전 화면으로 돌아가기");
		System.out.print("원하는 서비스를 입력하세요: ");
		int answer = scan.nextInt();
		
		if(answer == 1) {
			System.out.print("결제 영수증을 출력 하시겠습니까?(y/n)");
			String answer1 = scan.next();
			
			if(answer1.equals("y")) {
				System.out.print("예약번호를 입력하세요 :");
				String rvnum = scan.next();
				checkui(rvnum);
			}
			
			
		}
		else if(answer == 2) {
			System.out.print("예약을 취소하시겠습니까?(y/n)");
			String answer2 = scan.next();
			
			if(answer2.equals("y")) {
				System.out.print("예약번호를 입력하세요 :");
				rvnum1 = scan.next();
				RouteData.ReservationDel(rvnum1);
				RouteData.ResevationSave();
				
				
				System.out.println("[취소완료]");
			}
		}else if(answer == 3) {
			System.out.println("이전 화면으로 돌아갑니다..");
			UI.loginloop();
		}
		
		
	}
	
	public static String checkui(String rvnum) {
		
		Scanner scan = new Scanner(System.in);
		Path path = Paths.get("/Users/kimdaehwan/Desktop/class/code/java/TrafficCombine/userFile/reservationList.txt");
		String txt = "";
		
		try {
			String content = Files.readString(path);
			String[] temp = content.split("/");
			int a = temp.length;
			for(int i = 0; i<a; i++) {
				if(temp[i].contains(rvnum)) {
					txt = temp[i];
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		String[] temp2 = txt.split(",");
		
		
		
			System.out.println();
		    System.out.println("■■■■■■■■[예약 내역 조회]■■■■■■■■");
		    System.out.println();

		    
		    System.out.print("\t1) 예약번호 \t: "+ temp2[0] +"\n");
		    System.out.print("\t2) 교통수단 \t: "+ temp2[1] +"\n");
		    System.out.print("\t3) 출발지 \t: "+ temp2[2] +"\n");
		    System.out.print("\t4) 도착지 \t: "+ temp2[3] +"\n");
		    System.out.print("\t5) 출발일 \t: "+ temp2[4] +"\n");
		    System.out.print("\t6) 출발시 \t: "+ temp2[5] +"\n");
		    System.out.print("\t7) 요금 \t\t: "+ temp2[6] +"\n");
		    System.out.print("\t8) 좌석 \t\t: "+ temp2[7] +"\n");
		    
		    System.out.println("출력완료");
		    System.out.println("*이전 화면으로 돌아가고싶으시면 Enter를 누르세요*");
		    System.out.println();
		    System.out.print("선택(숫자만 입력가능) : ");
			String sel = scan.nextLine();   
			if(sel.equals("")) UI.loginUI(); 
			return sel;
		
		
	}	
	
}