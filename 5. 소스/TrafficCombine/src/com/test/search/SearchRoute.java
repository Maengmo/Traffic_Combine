package com.test.search;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.test.Airplane.AirPlane_data;
import com.test.Bus.Bus_UI;
import com.test.Bus.Bus_data;
import com.test.Train.Train_UI;
import com.test.Train.Train_data;
import com.test.project.UI;

//1. 노선 조회
public class SearchRoute {
	
	public static void search() {
		
		//1. 교통수단 선택
		String result = SearchUI.selectTransfort();
		
		//2. 노선조회
		//2-1. 출발지 입력
		SearchUI.searchTitle();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("■ 출발 지역 : ");
		String departure = scan.nextLine();
		System.out.println();
		
		// 교통 수단에 따라 출발지 목록 다르게 보여주기
		SearchUI.departureList(result);
		
		System.out.print("■ 출발 상세 지역 :");
		departure = scan.nextLine();
		System.out.println();
		
		//2-2. 도착지 입력
		System.out.print("■ 도착 지역 : ");
		String arrive = scan.nextLine();
		System.out.println();
		
		SearchUI.departureList(result);
		
		System.out.print("■ 도착 상세 지역 : ");
		arrive = scan.nextLine();
		System.out.println();
		
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
			SearchUI.routeList(result, departure, arrive, departureDate, departureTime);
		} else {
			search();
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
	
	public static void RoutePrint() {
		
		//1. 교통수단 선택
		selectRoute();
				
	}
	
	public static void selectRoute() {
		System.out.println();
		System.out.println("■■■■■■[노선 조회 서비스]■■■■■■");
		System.out.println();
		System.out.println("1. 기차");
		System.out.println("2. 버스");
		System.out.println("3. 비행기");
		System.out.println("4. 종료");
		System.out.println();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■");
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("선택 (숫자만 입력가능) : ");	
			String menuNum = scan.next();
			
			if (menuNum.equals("1")) {
				
				Train_UI.list();
				System.out.print("선택 (숫자, 이름 입력가능) : ");
				String input = scan.next();
				Train_data.Select(input);
				Train_data.load();
				Train_data.print();
				UI.pause();
				selectRoute();
				
				
			} else if (menuNum.equals("2")) {
				
				Bus_UI.list();
				System.out.print("선택 (숫자, 이름 입력가능) : ");
				String input = scan.next();
				Bus_data.select(input);
				Bus_data.load();
				Bus_data.print();
				UI.pause();
				selectRoute();

			} else if (menuNum.equals("3")) {
				
				System.out.println("     □■□■[비행기 노선]■□■□");
				AirPlane_data.list.clear();
				AirPlane_data.load();
				AirPlane_data.print();
				UI.pause();
				selectRoute();
				
			} else if (menuNum.equals("4")) {
				
				System.out.println();
				System.out.println("***이전 화면으로 돌아갑니다.***");
				SearchUI.selectMenu();
				
			} else {
				System.out.println("숫자를 다시 입력해주세요.");
				System.out.println();
			}
			
		}
		
	}
	
	public static void selectRoute2() {
		System.out.println();
		System.out.println("■■■■■■[유실물 노선 조회]■■■■■■");
		System.out.println();
		System.out.println("1. 기차");
		System.out.println("2. 버스");
		System.out.println("3. 비행기");
		System.out.println("4. 종료");
		System.out.println();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■");
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("선택 (숫자만 입력가능) : ");	
			String menuNum = scan.next();
			
			if (menuNum.equals("1")) {
				
				Train_UI.list();
				System.out.print("선택 (숫자, 이름 입력가능) : ");
				String input = scan.next();
				Train_data.Select(input);
				Train_data.load();
				Train_data.print();
				UI.pause();
				break;
				
				
			} else if (menuNum.equals("2")) {
				
				Bus_UI.list();
				System.out.print("선택 (숫자, 이름 입력가능) : ");
				String input = scan.next();
				Bus_data.select(input);
				Bus_data.load();
				Bus_data.print();
				UI.pause();
				break;

			} else if (menuNum.equals("3")) {
				
				System.out.println("     □■□■[비행기 노선]■□■□");
				AirPlane_data.list.clear();
				AirPlane_data.load();
				AirPlane_data.print();
				UI.pause();
				break;
				
			} else if (menuNum.equals("4")) {
				
				System.out.println();
				System.out.println("***이전 화면으로 돌아갑니다.***");
				break;
				
			} else {
				System.out.println("숫자를 다시 입력해주세요.");
				System.out.println();
			}
			
		}
		
	}

	public static void selectRoute3(String s) {
		System.out.println();
		System.out.printf("■■■■■■[%s 노선 조회]■■■■■■\n",s);
		System.out.println();
		System.out.println("1. 기차");
		System.out.println("2. 버스");
		System.out.println("3. 비행기");
		System.out.println("4. 종료");
		System.out.println();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■");
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("선택 (숫자만 입력가능) : ");	
			String menuNum = scan.next();
			
			if (menuNum.equals("1")) {
				
				Train_UI.list();
				System.out.print("선택 (숫자, 이름 입력가능) : ");
				String input = scan.next();
				Train_data.Select(input);
				Train_data.load();
				Train_data.print();
				UI.pause();
				break;
				
				
			} else if (menuNum.equals("2")) {
				
				Bus_UI.list();
				System.out.print("선택 (숫자, 이름 입력가능) : ");
				String input = scan.next();
				Bus_data.select(input);
				Bus_data.load();
				Bus_data.print();
				UI.pause();
				break;

			} else if (menuNum.equals("3")) {
				
				System.out.println("     □■□■[비행기 노선]■□■□");
				AirPlane_data.list.clear();
				AirPlane_data.load();
				AirPlane_data.print();
				UI.pause();
				break;
				
			} else if (menuNum.equals("4")) {
				
				System.out.println();
				System.out.println("***이전 화면으로 돌아갑니다.***");
				break;
				
			} else {
				System.out.println("숫자를 다시 입력해주세요.");
				System.out.println();
			}
			
		}
		
	}

}
