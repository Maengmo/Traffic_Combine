package com.test.user;

import com.test.search.RouteData;

public class user_reservationUI {
	
	public static void reservationUI() { 
		
		
		//입력한 내용에 맞게 출력하는 노선 UI
		System.out.println();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■[예약 내역 조회]■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("  [번호]    [교통수단]    [출발지]    [도착지]    [출발일]          [출발시]       [요금]       [좌석]");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		RouteData2.loadData();
		
		
		for (Route2 r : RouteData2.loadList) {
			
			if (r.getTraffic().equals("비행기")) {
				
				System.out.printf("   %s    %s    %s    %s    %s          %s       %s       %s\n", r.getNum(), r.getTraffic(), r.getStart(), r.getArrive(), r.getDepartureDate(), r.getDepartureTime(), r.getPrice(), r.getSeat());
			} else {
				
				System.out.printf("   %s    %s         %s       %s     %s          %s       %s       %s\n", r.getNum(), r.getTraffic(), r.getStart(), r.getArrive(), r.getDepartureDate(), r.getDepartureTime(), r.getPrice(), r.getSeat());
				
			}
			
	
		}
		
		
		System.out.println();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		
		
	}

}
