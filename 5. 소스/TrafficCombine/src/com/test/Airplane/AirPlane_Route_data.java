package com.test.Airplane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.test.Train.Train_RouteSet;
import com.test.user.user_Join;
import com.test.user.user_data;

public class AirPlane_Route_data {


		public final static String AIRPATH = "/Users/kimdaehwan/Desktop/class/code/java/TrafficCombine/AirplaneData/airRoute.txt";
		
		public static ArrayList<AirPlane_RouteSet> list;
		
		static {
			list = new ArrayList<AirPlane_RouteSet>();
		}
		
		
		public static void load() {
			
			try {
				
				BufferedReader reader = new BufferedReader(new FileReader(AirPlane_Route_data.AIRPATH));
				
				String line = null;
				
				while((line = reader.readLine()) != null) {
					
					String[] temp = line.split(",");
					
					//텍스트 1줄 > Member 객체 1개
					AirPlane_RouteSet a = new AirPlane_RouteSet(temp[0], temp[1], temp[2], temp[3]);
					list.add(a);
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		public static void findFile(String start, String arrive) {
				
				try {
				
				BufferedReader reader = new BufferedReader(new FileReader(AirPlane_Route_data.AIRPATH));
				
				String line = null;
				
				while((line = reader.readLine()) != null) {
					
					String[] temp = line.split(",");
					
					//텍스트 1줄 > Member 객체 1개
					AirPlane_RouteSet a = new AirPlane_RouteSet(temp[0], temp[1], temp[2], temp[3]);
					
					if (temp[0].equals(start)&&temp[1].equals(arrive)) {
						list.add(a);
					}
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
	}
		public static void print() {
			
			for(AirPlane_RouteSet t : list) {
				
				System.out.printf("출발지(역) : %s | 도착지(역) : %s | 날짜 : %s | 시간 : %s\n"
									, t.getArea()
									, t.getAirport()
									, t.getCalendar()
									, t.getTime());
				
			}
			
		}
	
}
