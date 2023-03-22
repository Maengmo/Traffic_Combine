package com.test.user;


import java.util.Scanner;

public class MypageUI {
   
   public static String mainUI(){
      
      System.out.println();
      System.out.println("■■■■■■■■[회원 정보 조회]■■■■■■■■");
      System.out.println();
      
      String temp[] = user_data.user_check(user_Service.LOGIN_NOW);
      
      System.out.print("\t1) 회원번호 \t: "+ temp[0] + "\n");
      System.out.print("\t2) ID \t\t: "+ temp[1] + "\n");
      System.out.print("\t3) PW \t\t: "+ temp[2] +"\n");
      System.out.print("\t4) 이름 \t\t: "+ temp[3] +"\n");
      System.out.print("\t5) 생년월일 \t: "+ temp[4] +"\n");
      System.out.print("\t6) 성별 \t\t: "+ temp[5] +"\n");
      System.out.print("\t7) 전화번호 \t: "+ temp[6] +"\n");
      System.out.print("\t8) 공공할인(num) \t: "+ temp[7] +"\n");
      System.out.print("\t9) 마일리지\t: "+ temp[8] +"\n");
      System.out.print("\t10) 보유금액\t: "+ temp[9] +"\n");
      

      System.out.println();
      System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■");
      System.out.println();
   
      System.out.println("------------------------------------------------");
      System.out.println();
      System.out.println("\t\t1. 회원 탈퇴");
      System.out.println();
      System.out.println("------------------------------------------------");
      
      Scanner scan = new Scanner(System.in);
      System.out.println("*이전 화면으로 돌아가고싶으시면 Enter를 누르세요*");
      System.out.println();
      System.out.print("선택(숫자만 입력가능) : ");
	     String sel = scan.nextLine();
	      
	     return sel;
	      
	   }

	   
	
}
