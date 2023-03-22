package com.test.dummyData;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreateTime {

	public static void main(String[] args) {
		
		//00:00 - 23:50 까지 30분간격으로 만들기
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(".\\dat\\time.txt"));
			
			for (int i=0; i<3; i++) {
				
				if (i==0 || i==1) {
					for (int j=0; j<10; j++) {
						
						for (int k=0; k<4; k+=3) {
//							System.out.printf("%d%d", i, j);
//							System.out.printf(":%d0\n", k);
							writer.write(String.format("%d%d:%d0\n", i,j,k));

						}
					}
				
				}
				
				if (i==2) {
					
					for (int j=0; j<4; j++) {
						for (int k=0; k<4; k+=3) {
//							System.out.printf("%d%d", i, j);
//							System.out.printf(":%d0\n", k);
							writer.write(String.format("%d%d:%d0\n", i,j,k));

						}
						
					}
				}
			}
			
			
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
