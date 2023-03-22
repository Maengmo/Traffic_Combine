package com.test.user;

import java.util.ArrayList;
import java.util.Scanner;

public class user_UI {

	public static void join () {
		
		user_data.list.clear();
		user_data.load();
		
		String num = "0";
		String id = "";
		String pw = "";
		String name = "";
		String born = "";
		String gender = "";
		String phone = "";
		String discount = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1. ID 입력(영어,숫자 8~16자리) : ");
		id = scan.next();
		System.out.print("2. PW 입력(영어,숫자조합 10자 이상) : ");
		pw = scan.next();
		System.out.print("3. 이름 입력(한글 2~5자) : ");
		name = scan.next();
		System.out.print("4. 생년월일 입력(숫자 8자리) : ");
		born = scan.next();
		System.out.print("5. 성별 입력(M/F) : ");
		gender = scan.next();
		System.out.print("6. 연락처 입력(000-0000-0000,000-000-0000) : ");
		phone = scan.next();
		System.out.print("7. 공공할인 여부 입력(1.임산부, 2.장애인, 3.청소년, 4.다자녀, 5.없음) : ");
		discount = scan.next();
		
		System.out.println();
		
		int n = (int)(Math.random()*100000);
		num = Integer.toString(n);
		
		user_Join j = new user_Join(num,id,pw,name,born,gender,phone,discount, "0", "0");
		
		if(j.check(id, pw, name, born, gender, phone, discount)) {
			user_data.list.add(j);
			user_data.save();
			System.out.println("회원가입이 완료 되었습니다.");
		}else {
			System.out.println("잘못 입력 하셨습니다. 다시 입력하세요.");
		};
		
		
	}

}
