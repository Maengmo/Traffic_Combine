package com.test.search;

import java.util.Scanner;

import com.test.project.Main;
import com.test.reservation.ReservationRoute;

public class SearchUI {
	
	//1. 조회 기능 선택
	public static void  selectMenu() {
		System.out.println();
		System.out.println("■■■■■■■[조회 서비스]■■■■■■■");
		System.out.println();
		System.out.println("1. 노선 조회 서비스");
		System.out.println("2. 유실물 조회 서비스");
		System.out.println("3. 종료");
		System.out.println();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■");
		
		Scanner scan = new Scanner(System.in);
		boolean roop = true;
		
		while (roop) {
			System.out.print("선택 (숫자만 입력가능) : ");
			String menuNum = scan.nextLine();
			
			if (menuNum.equals("1")) {
				
				SearchRoute.RoutePrint();
				
			} else if (menuNum.equals("2")) {
				SearchRoute.selectRoute2();
				//유실물 리스트 파일 불러오기
				LostItemData.lostItemLoad();
				//유실물 교통수단 선택 메뉴
				LostItemUI.transportMenu();
				
			} else if(menuNum.equals("3")) {
				Main.Start();
				roop = false;
				
			}else {
				System.out.println("숫자를 다시 입력해주세요.");
				System.out.println();
			}
		}
		
	}
	
	
	//1-1. 노선 조회 - 교통수단 선택
	public static String selectTransfort() {
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
			System.out.println("*Enter를 누르시면 이전 화면으로 이동합니다.*");
			System.out.print("선택 (숫자만 입력가능) : ");	
			String menuNum = scan.nextLine();
			
			if (menuNum.equals("1")) {
				
				return "기차";			
				
			} else if (menuNum.equals("2")) {
				
				return "버스";

			} else if (menuNum.equals("3")) {
				
				return "비행기";
				
			} else if (menuNum.equals("")) {
				
				System.out.println();
				System.out.println("***이전 화면으로 돌아갑니다.***");
				selectMenu();
				
				
			} else {
				System.out.println("숫자를 다시 입력해주세요.");
				System.out.println();
			}
			
		}
		
	}
	
	//1-2. 노선 조회 - 출발지목록 출력
	public static void searchTitle() {
		
		System.out.println();
		System.out.println("■■■■■■[통합 노선 조회]■■■■■■");
		System.out.println();
		
	}
	
	public static void departureList(String departure) {
		System.out.println("■■■■■■[출발지 목록]■■■■■■");
		if (departure.equals("기차")) {
			
			RouteData.trainDepartureData();
			
		} else if (departure.equals("버스")) {
			
			RouteData.busDepartureData();
			
		} else if (departure.equals("비행기")) {
			
			RouteData.airplaneDepartureData();
		}
		System.out.println("■■■■■■■■■■■■■■■■■■");
		System.out.println();
    }
	
	public static void routeList(String transfort, String departure, String arrive, String departureDate, String departureTime) {
		
		RouteData.loadList(transfort, departure, arrive, departureDate, departureTime);
		System.out.println("[번호][교통수단][출발지][도착지]\t[출발일]\t[출발시]\t[요금]\t[좌석]");
		System.out.println("--------------------------------------------------------------------------------------");
		for (Route r : RouteData.routeList) {
			System.out.printf("%3d\t%3s\t%4s\t%4s\t\t%s\t %5s\t\t%4f\t%4s\n", 
								r.getNum(), 
								r.getTransfort(), 
								r.getDeparture(), 
								r.getArrive(), 
								r.getDepartureDate(), 
								r.getDepartureTime(), 
								r.getPrice(), 
								r.getSeat());
		}
		
		
	}
	
	
}
