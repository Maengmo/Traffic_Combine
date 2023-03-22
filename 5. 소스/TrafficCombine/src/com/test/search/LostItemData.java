package com.test.search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;




public class LostItemData {

	
	public final static String MEMBER = "/Users/kimdaehwan/Desktop/class/code/java/TrafficCombine/data/LostItem.txt";
	
	public static ArrayList<LostItem> itemlist;

	static {
		itemlist = new ArrayList<LostItem>() ;
	}
	

	
	public static void lostItemLoad() { 
		
		try {
			 
			BufferedReader reader = new BufferedReader(new FileReader(LostItemData.MEMBER));
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				//텍스트 1줄 > Member 객체 1개로 변환
				LostItem item = new LostItem(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5]);
				
				itemlist.add(item);
				
			}
			
			reader.close();
			
		} catch( Exception e) {
			e.printStackTrace();
		}
	
		
		
	}
	

	public static void save() {
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(LostItemData.MEMBER));
			
			for(LostItem item : itemlist) {
				
				writer.write(String.format("%s,%s,%s,%s,%s,%s\r\n"
															,item.getItemNo()
															,item.getTransport()
															,item.getItemName()
															,item.getGetDate()
															,item.getGetPlace()
															,item.getKeepDate()
															));	
			}
		
			writer.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	

	
	
}
