package com.test.Bus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Bus_data {
	
		public final static String BUSPATH = "/Users/kimdaehwan/Desktop/class/code/java/TrafficCombine/BusData/";
		public static String BUSFILE = "";
		
		public static ArrayList<Bus_set> list;
		
		static {
			list = new ArrayList<Bus_set>();
		}
		
		//********
		public static void load() {
			
			try {
				
				BufferedReader reader = new BufferedReader(new FileReader(Bus_data.BUSPATH+BUSFILE));
				
				String line = null;
				
				while((line = reader.readLine()) != null) {
					
					String[] temp = line.split(",");
					
					//텍스트 1줄 > Member 객체 1개
					Bus_set b = new Bus_set(temp[0], temp[1], temp[2], temp[3]);
					list.add(b);
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		public static void print() {
			
			for(Bus_set b : list) {
				
				System.out.printf("선택번호 : %2s | 지역 : %s | 상세 지역(터미널) : %1s | 주소 : %1s \n"
									, b.getNum()
									, b.getArea()
									, b.getSpace()
									, b.getAddress());
				
			}
			
		}
		
		public static void select(String num) {
			list.clear();
			
			if(num.equals("1")||num.equals("서울특별시")) {
				System.out.println("\t\t\t□■□■ 버스 노선(서울특별시) ■□■□");
				BUSFILE = "Bus_Seoul.txt";
			}else if(num.equals("2")||num.equals("부산광역시")) {
				System.out.println("\t\t\t□■□■ 버스 노선(부산광역시) ■□■□");
				BUSFILE = "Bus_Busan.txt";
			}else if(num.equals("3")||num.equals("대구광역시")) {
				System.out.println("\t\t\t□■□■ 버스 노선(대구광역시) ■□■□");
				BUSFILE = "Bus_Daegu.txt";
			}else if(num.equals("4")||num.equals("인천광역시")) {
				System.out.println("\t\t\t□■□■ 버스 노선(인천광역시) ■□■□");
				BUSFILE = "Bus_Incheon.txt";
			}else if(num.equals("5")||num.equals("광주광역시")) {
				System.out.println("\t\t\t□■□■ 버스 노선(광주광역시) ■□■□");
				BUSFILE = "Bus_Kwanjoo.txt";
			}else if(num.equals("6")||num.equals("대전광역시")) {
				System.out.println("\t\t\t□■□■ 버스 노선(대전광역시) ■□■□");
				BUSFILE = "Bus_Daejeon.txt";
			}else if(num.equals("7")||num.equals("울산광역시")) {
				System.out.println("\t\t\t□■□■ 버스 노선(울산광역시) ■□■□");
				BUSFILE = "Bus_Ulsan.txt";
			}else if(num.equals("8")||num.equals("세종특별자치시")) {
				System.out.println("\t\t\t□■□■ 버스 노선(세종특별자치시) ■□■□");
				BUSFILE = "Bus_Sejong.txt";
			}else if(num.equals("9")||num.equals("경기도")) {
				System.out.println("\t\t\t□■□■ 버스 노선(경기도) ■□■□");
				BUSFILE = "Bus_Gyungki.txt";
			}else if(num.equals("10")||num.equals("강원도")) {
				System.out.println("\t\t\t□■□■ 버스 노선(강원도) ■□■□");
				BUSFILE = "Bus_Kangwon.txt";
			}else if(num.equals("11")||num.equals("충청북도")) {
				System.out.println("\t\t\t□■□■ 버스 노선(충청북도) ■□■□");
				BUSFILE = "Bus_Choongbook.txt";
			}else if(num.equals("12")||num.equals("충청남도")) {
				System.out.println("\t\t\t□■□■ 버스 노선(충청남도) ■□■□");
				BUSFILE = "Bus_Choongnam.txt";
			}else if(num.equals("13")||num.equals("전라북도")) {
				System.out.println("\t\t\t□■□■ 버스 노선(전라북도) ■□■□");
				BUSFILE = "Bus_Junbook.txt";
			}else if(num.equals("14")||num.equals("전라남도")) {
				System.out.println("\t\t\t□■□■ 버스 노선(전라남도) ■□■□");
				BUSFILE = "Bus_Junnam.txt";
			}else if(num.equals("15")||num.equals("경상북도")) {
				System.out.println("\t\t\t□■□■ 버스 노선(경상북도) ■□■□");
				BUSFILE = "Bus_Gyungbook.txt";
			}else if(num.equals("16")||num.equals("경상남도")) {
				System.out.println("\t\t\t□■□■ 버스 노선(경상남도) ■□■□");
				BUSFILE = "Bus_Gyungnam.txt";
			}
			
		}
}
