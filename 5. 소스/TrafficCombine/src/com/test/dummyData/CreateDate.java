package com.test.dummyData;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Calendar;

public class CreateDate {
	
	public static void main(String[] args) {
		
		Calendar start = Calendar.getInstance();
		
		start.add(Calendar.MONTH, -6);
		start.set(Calendar.DATE, 1);
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(".\\dat\\date.txt"));
			
			while (start.get(Calendar.MONTH) != 5) {
				
				writer.write(String.format("%tF\n", start));
				start.add(Calendar.DATE, 1);
				
			}
			
			writer.close();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
