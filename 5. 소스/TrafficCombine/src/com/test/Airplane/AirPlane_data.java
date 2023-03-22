package com.test.Airplane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

//해당 항공에 대한 정보를 읽어오는 클래스
public class AirPlane_data {

	public final static String AIRPATH = "/Users/kimdaehwan/Desktop/class/code/java/TrafficCombine/AirplaneData/air.txt";
	
	public static ArrayList<AirPlane_set> list;
	
	static {
		list = new ArrayList<AirPlane_set>();
	}
	
	//******** 파일 경로에 위치하는 데이터를 읽어온다.
	public static void load() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(AirPlane_data.AIRPATH));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				//텍스트 1줄 > Member 객체 1개
				AirPlane_set a = new AirPlane_set(temp[0], temp[1]);
				list.add(a);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	//읽어온 파일을 출력하여준다.
	public static void print() {
		
		for(AirPlane_set a : list) {
			
			System.out.printf("선택번호 : %2s | 지역(공항) : %s\n"
								, a.getNum()
								, a.getArea());
			
		}
		
	}
}

