package com.test.user;

import java.util.Scanner;

public class user_deposit {

	public static void deposit_UI(String id) {
		
		int money = Integer.parseInt(user_data.money_check(id)); 
		System.out.println("■■■■■■■■■■■고객님의 입금 정보를 불러옵니다...■■■■■■■■■■");
		System.out.printf("현재 고객님이 보유하신 금액은 : %,d원 입니다.\n", money);
		
		System.out.print("입금을 진행하시겠습니까?(y|n) : ");
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		if(input.equals("y")) {
			System.out.print("충전하실 금액을 입력하여주세요. : ");
			int input_Money = scan.nextInt();
			String sum = deposit_Money(money,input_Money);
			
			System.out.printf("입금 하실 금액은 %,d원, 합산 금액은 %,d원입니다.\n",input_Money,Integer.parseInt(sum));
			System.out.print("입금을 진행하시겠습니까?(y|n)");
			String input2= scan.next();
			
			if(input2.equals("y")) {
				user_data.money_deposit(id, sum);
				System.out.println("성공적으로 입금이 완료되었습니다.");
			}
			
		}else {
			System.out.println("이전 화면으로 돌아갑니다..");
		}
		
	}
	
	public static String deposit_Money(int money, int input_Money) {
		
		String result = money+input_Money+"";
		return result;
		
	}
	
}
