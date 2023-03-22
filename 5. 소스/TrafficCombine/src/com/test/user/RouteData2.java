package com.test.user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import com.test.search.Route;



public class RouteData2 {
	
	public static ArrayList<Route2> loadList;
	
	
	static {
		loadList = new ArrayList<Route2>();
	}
	
	public static void loadData() {
		
		loadList.clear();
		try {
			
			
			BufferedReader reader = new BufferedReader(new FileReader("/Users/kimdaehwan/Desktop/class/code/java/TrafficCombine/userFile/reservationList.txt"));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				
				//텍스트 1줄 > member 객체
				Route2 r = new Route2(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
				if(temp[8].equals(user_Service.LOGIN_NOW+"/")){
					loadList.add(r);
				}
				
				

			}
			
			reader.close();
			
			
		}catch(Exception e) {
			
		}
		
	}
	
}

