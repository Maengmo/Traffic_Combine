package com.test.reservation;

import java.util.Scanner;
import com.test.project.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.tools.javac.Main;
import com.test.search.Route;
import com.test.search.RouteData;
import com.test.search.SearchLostItem;
import com.test.search.SearchRoute;
import com.test.search.SearchUI;

public class ReservationUI {
	
	//1. 조회 기능 선택
	public static void  selectMenu() {
		System.out.println();
		System.out.println("■■■■■■■■■■■■■■[조회 서비스]■■■■■■■■■■■■■■");
		System.out.println();
		System.out.println("\t1. 노선 조회 서비스");
		System.out.println("\t2. 유실물 조회 서비스");
		System.out.println("\t3. 예약내역 조회 서비스");
		System.out.println("\t4. 회원정보 조회 서비스");
		System.out.println("\t5. 결제 금액 충전 조회 서비스");
		
		
		System.out.println();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		
		Scanner scan = new Scanner(System.in);
		boolean roop = true;
		
		while (roop) {
			System.out.print("선택 (숫자만 입력가능) : ");
			String menuNum = scan.nextLine();
			
			if (menuNum.equals("1")) {
				
				ReservationRoute.search();
				roop = false;	
				
			} 
			else if (menuNum.equals("2")) {
				
				System.out.println("유실물 조회 서비스");
				roop = false;
				
			}
			else if (menuNum.equals("3")) {
			
				CheckReservation.load();
				roop = false;
				
			} 
			else if (menuNum.equals("4")) {
				
				System.out.println("회원정보 조회 서비스");
				roop = false;
				
			}
			else if (menuNum.equals("5")) {
				
				System.out.println("결제 금액 충전 조회 서비스");
				roop = false;
				
			}
			else {
				System.out.println("숫자를 다시 입력해주세요.");
				System.out.println();
			}
		}
		
	}
	
	
	//1-1. 노선 조회 - 교통수단 선택
	public static String selectTransfort() {
		System.out.println();
		System.out.println("■■■■■■[예약하실 서비스를 입력해주세요.]■■■■■■");
		System.out.println();
		System.out.println("\t1. 기차");
		System.out.println("\t2. 버스");
		System.out.println("\t3. 비행기");
		System.out.println();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■");
		
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
				UI.loginloop();
				
			} else {
				System.out.println("숫자를 다시 입력해주세요.");
				System.out.println();
				
			}

		}
		
	}
	
	//1-2. 노선 조회 - 출발지목록 출력
	public static void searchTitle() {
		
		System.out.println();
		System.out.println("■■■■■■[회원 전용 예약서비스]■■■■■■");
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
	
	public static void arriveList(String arrive) {
		System.out.println("■■■■■■[도착지 목록]■■■■■■");
		if (arrive.equals("기차")) {
			
			RouteData.trainarriveData();
			
		} else if (arrive.equals("버스")) {
			
			RouteData.busarriveData();
			
			} else if (arrive.equals("비행기")) {
			
			RouteData.airplanearriveData();
		}
		System.out.println("■■■■■■■■■■■■■■■■■■");
		System.out.println();
    }
	
	public static void routeList(String transfort, String departure, String arrive, String departureDate, String departureTime) {
		
		RouteData.loadList(transfort, departure, arrive, departureDate, departureTime);
		System.out.println("[번호] [교통수단]  [출발지]  [도착지]   \t[출발일]     \t[출발시]");
		System.out.println("--------------------------------------------------------------------------------------");
		for (Route r : RouteData.routeList) {
			System.out.printf("%3d%8s\t%3s\t%3s\t\t%s\t %s\t\t\n", 
								r.getNum(), 
								r.getTransfort(), 
								r.getDeparture(), 
								r.getArrive(), 
								r.getDepartureDate(), 
								r.getDepartureTime());
		}
		
	}
	
	public static void rvrouteList(String num , String transfort, String departure, String arrive, String departureDate, String departureTime , String price, String stseatgrade,String id) {
		
		RouteData.rvrouteList.clear();
		RouteData.rvloadList(num , transfort, departure, arrive, departureDate, departureTime , price , stseatgrade,id);
		System.out.println("[번호]    [교통수단]      [출발지]    [도착지]      [출발일]           [출발시]     [요금]     [좌석]");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		for (rvRoute rv : RouteData.rvrouteList) {
			System.out.printf("%s     %s       %s    %s     %s          %s      %s      %s     %s\n", 
								rv.getNum(), 
								rv.getTransfort(), 
								rv.getDeparture(), 
								rv.getArrive(), 
								rv.getDepartureDate(), 
								rv.getDepartureTime(),
								rv.getPrice(),
								rv.getStseatgrade(),
								"");
		}
		RouteData.save();
	}
	
	
}
