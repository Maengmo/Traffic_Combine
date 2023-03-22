package com.test.reservation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.test.Airplane.AirPlane_Route_data;
import com.test.Train.Train_Route_data;
import com.test.project.Picture_UI;
import com.test.project.UI;
import com.test.search.SearchRoute;
import com.test.search.SearchUI;
import com.test.user.user_Service;
import com.test.user.user_data;
import com.test.user.user_deposit;
import com.test.user.user_milige;

public class ReservationRoute {
	public static String departure = "";
	public static String kind = "";
	public static String arrive = "";
	public static String seatNum = "";
	public static int distance = 0;
	public static void search() {
		
		SearchRoute.selectRoute3("회원 전용");
		//1. 교통수단 선택
		String result =	ReservationUI.selectTransfort();
		
		Scanner scan = new Scanner(System.in);
		//2. 노선조회
		//2-1. 출발지 입력
		Select_Traffic(result);
		
		if(result.equals("3")||result.equals("비행기")) {
			AirPlane_Route_data.findFile(departure, arrive);
			AirPlane_Route_data.print();
		}else if(result.equals("1")||result.equals("기차")) {
			Train_Route_data.Select(kind,"");
			Train_Route_data.findFile(departure, arrive);
			Train_Route_data.print();
		}
		
		//3. 출발일 입력
		System.out.print("■ 출발일 입력(\"2023-03-07\"형태로 입력해주세요.) : ");
		String departureDate = scan.nextLine();
		System.out.println();
		
		//4. 출발시 입력
		System.out.print("■ 출발시 입력(\"00:00\"형태로 입력해주세요.) : ");
		String departureTime = scan.nextLine();
		System.out.println();
		
		if (checkValidation(departureDate, departureTime)) {
			//5. 노선 정보 출력
			ReservationUI.routeList(result, departure, arrive, departureDate, departureTime);
		} else {
			search();
		}
		
		
		
		//5. 인원 입력
		System.out.print("■ 인원 입력(1~10) : ");
		String member = scan.nextLine();
		System.out.println();
		
		//6. 좌석 선택
		System.out.print("■ 이용 좌석 등급 입력 (1.이코노미 , 2.비즈니스 , 3.퍼스트)  : ");
		String seatgrade = scan.nextLine();
		String stseatgrade = "";
		double mul = 0;
		
		if(seatgrade.equals("1")) {
			stseatgrade = "이코노미";
			mul = 1;
		}
		else if (seatgrade.equals("2")) {
			stseatgrade = "비즈니스";
			mul = 1.5;
		}
		else if (seatgrade.equals("3")) {
			stseatgrade = "퍼스트";
			mul = 2;
		}
		
		
		System.out.println();
		
		//7. 좌석 번호 입력
		UI.SeatUI(result);
		System.out.print("■ 좌석 번호를 입력해주세요[좌석번호는 ','(콤마)없이 띄어쓰기로 입력 : ");
		seatNum = scan.nextLine();
		stseatgrade = seatNum;
		System.out.println();
		
		
		
		
		//요금 계산
		int price = 0;
		
		if(result.equals("버스")||result.equals("2")) {
			distance = 1000;
		}else if(result.equals("기차")||result.equals("1")) {
			distance = 2000;
		}else if(result.equals("비행기")||result.equals("3")) {
			distance = 5000;
		}
		
		int mg = 0;
		int usermoney = Integer.parseInt(user_data.money_check(user_Service.LOGIN_NOW));
		String answer = "";
		
		//id 같은지 확인하고 공공할인 여부
		if(user_data.sale_check(user_Service.LOGIN_NOW).equals("5")) {  //해당 아이디 회원 파일 안에 "5가 아니면"이 있으면
			price = (int)(Integer.parseInt(member) * distance * mul);
			mg = (int)(price*0.1);
		}
		else {
			price = (int)(Integer.parseInt(member) * distance * mul * 0.9);
			mg = (int)(price *0.1);
		}
		
		//결제 리스트출력
		
		int n = (int)(Math.random()*100000);
		String num = Integer.toString(n);
		String id = "";
		ReservationUI.rvrouteList(num , result, departure, arrive, departureDate, departureTime,Integer.toString(price),stseatgrade,id);
		System.out.printf("%d원을 계산 하시겠습니까?(Y/N)",price);
		
		answer = scan.nextLine();
		
		if((answer.equals("Y") || answer.equals("y") )&& price < usermoney) {
			System.out.println("[결제 완료]");
			System.out.printf("마일리지 %d원이 적립되었습니다.\n",(int)(price*0.1));
			
			Picture_UI.UI_PRINT(result);
			
			String sum = user_milige.plus_Milige(mg);
			String sum2 = user_deposit.deposit_Money(usermoney,-price);
			
			
			user_data.milige_deposit(user_Service.LOGIN_NOW, sum);
			user_data.save();
			user_data.money_deposit(user_Service.LOGIN_NOW, sum2);
			user_data.save();
			
			
			System.out.println("*Enter를 누르시면 기능선택화면으로 이동합니다.*");
			String enter = scan.nextLine();
			//엔터누르면 초기화면
			if(enter.equals("")){
				
			}
	
			System.out.println();	
		}
		else if((answer.equals("Y") || answer.equals("y") )&& price > usermoney) {
			System.out.println("보유 잔액이 부족합니다.");
			System.out.println("기능선택화면으로 이동합니다.");
			UI.loginUI();
		}
		else if (answer.equals("N") || answer.equals("n")) {
			System.out.println("기능선택화면으로 이동합니다");
			UI.loginUI();
		}
		
		
	}
	
	
	
	private static boolean checkValidation(String departureDate, String departureTime) {		
		String regex = ""; //정규식
		Pattern pattern = null; //정규식 객체
		Matcher matcher = null; //결과 객체
		
		//1. 출발일 유효성 검사
		regex = "^[\\d]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
		pattern = Pattern.compile(regex); 
		matcher = pattern.matcher(departureDate); 

		if (!matcher.find()) {
			System.out.println("***\"20XX-XX-XX\" 형태로 입력해주세요.***");
			System.out.println("교통수단부터 다시 입력해주시길 바랍니다.");
			return false; 
		}
		
		//2. 출발시 유효성 검사
		regex = "^([1-9]|[01][0-9]|2[0-3]):([0-5][0-9])$"; 
		
		pattern = Pattern.compile(regex); 
		matcher = pattern.matcher(departureTime); 
		
		if (!matcher.find()) {
			System.out.println("***\"XX:XX\" 형태로 입력해주세요.***");
			System.out.println("교통수단부터 다시 입력해주시길 바랍니다.");
			return false; 
		}
	
		return true;
	}	
	private static boolean checkregister(String member , String seatgrade) {
		String regex = "";
		Pattern pattern = null; //정규식 객체
		Matcher matcher = null; //결과 객체
		
		//1. 인원수 유효성 검사
		regex = "[1-10]";
		pattern = Pattern.compile(regex); 
		matcher = pattern.matcher(member); 
		
		if(!matcher.find()) {
			System.out.println("1~10사이의 숫자를 입력해주세요");
			System.out.println("교통수단부터 다시 입력해주시길 바랍니다.");
			return false;
		}
		
		//2. 좌석등급 유효성 검사
		regex = "[1-3]";
		pattern = Pattern.compile(regex); 
		matcher = pattern.matcher(seatgrade);
		
		if(!matcher.find()) {
			System.out.println("1~3사이의 숫자를 입력해주세요");
			System.out.println("교통수단부터 다시 입력해주시길 바랍니다.");
			return false;
		}
		
		return true;

	}
	
	//유저 대답 유효성 검사
	
	
	public static void Select_Traffic(String result) {
		
		Scanner scan = new Scanner(System.in);
		
		if(result.equals("1")||result.equals("기차")) {
			
			ReservationUI.searchTitle();
			
			System.out.print("■ 선택 기차(종류) : ");
			kind = scan.nextLine();
			System.out.println();
			
			// 교통 수단에 따라 출발지 목록 다르게 보여주기
			ReservationUI.departureList(result);
			
			System.out.print("■ 출발 선택 지역 :");
			departure = scan.nextLine();
			System.out.println();
			
			//2-2. 도착지 입력
			System.out.print("■ 선택 기차(종류) : ");
			arrive = scan.nextLine();
			System.out.println();
			
			ReservationUI.arriveList(result);
			
			System.out.print("■ 도착 선택 지역 : ");
			arrive = scan.nextLine();
			System.out.println();
		}else if(result.equals("2")||result.equals("버스")) {
			
			ReservationUI.searchTitle();
			
			System.out.print("■ 출발(선택 지역) : ");
			departure = scan.nextLine();
			System.out.println();
			
			// 교통 수단에 따라 출발지 목록 다르게 보여주기
			ReservationUI.departureList(result);
			
			System.out.print("■ 출발(상세 지역) :");
			departure = scan.nextLine();
			System.out.println();
			
			//2-2. 도착지 입력
			System.out.print("■ 도착(선택 지역) : ");
			arrive = scan.nextLine();
			System.out.println();
			
			ReservationUI.arriveList(result);
			
			System.out.print("■ 도착(상세 지역) : ");
			arrive = scan.nextLine();
			System.out.println();
		}else if(result.equals("3")||result.equals("비행기")) {
			
			ReservationUI.searchTitle();
			
			// 교통 수단에 따라 출발지 목록 다르게 보여주기
			ReservationUI.departureList(result);
			
			System.out.print("■ 출발(선택 공항) : ");
			departure = scan.nextLine();
			System.out.println();
			
			System.out.print("■ 출발공항 한번 더 입력 :");
			departure = scan.nextLine();
			System.out.println();
			
			//2-2. 도착지 입력
			// 교통 수단에 따라 출발지 목록 다르게 보여주기
			
			ReservationUI.departureList(result);
			System.out.print("■ 도착(선택 공항) : ");
			arrive = scan.nextLine();
			System.out.println();
			
			System.out.print("■ 도착공항 한번 더 입력 : ");
			arrive = scan.nextLine();
			System.out.println();
		}
		
	}
	
}

