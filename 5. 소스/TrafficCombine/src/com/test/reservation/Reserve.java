package com.test.reservation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;



public class Reserve {
	
	
	Scanner scan = new Scanner(System.in);
	TextRead t = new TextRead();
	private int membernum =0;
	private int seatgrade = 0;
	public String seat = "";
	private String seatname = "";
	private boolean salecheck;
	private double seatgradeprice = 0;
	private String answer = "";
	private int usermoney = 0;
	public double price = 0;
	private String returnanswer = "";
	int distance = 1000; // 임의 설정
	
	
	
	public int getMembernum() {
		return membernum;
	}
	public boolean setMembernum(int membernum) {
		if(membernum >=1 && membernum <=10 ) {
			this.membernum = membernum;
			return true;
		}
		else {
			System.out.println("인원은 10명까지만 예약 가능합니다. 다시 입력해주세요");
			return false;
		}
	}
	
	public int getSeatgrade() {
		return seatgrade;
	}
	
	public boolean setSeatgrade(int seatnum) {
		if(seatnum == 1) {
			this.seatgrade = seatnum;
			seatgradeprice = 1;
			seat = "이코노미";
			return true;
		}
		else if (seatnum == 2) {
			this.seatgrade = seatnum;
			seatgradeprice = 1.5;
			seat= "비즈니스";
			return true;
		}
		else if (seatnum == 3) {
			this.seatgrade = seatnum;
			seatgradeprice = 2;
			seat = "퍼스트";
			return true;
		}
		else {
			System.out.println("1~3 숫자중 다시 입력해주세요");
			return false;
		}
	}
	
	public double getSeatgreadprice() {
		return seatgradeprice;
	}
	
	public String getSeatname() {
		return seatname;
	}
	
	public boolean setSeatname(String seatname) {
		if(true) {
			this.seatname = seatname;
			return true;
		}
		else {
			System.out.println("좌석명을 다시 입력해주세요");
			return false;
		}
	}
	
	public boolean salecheck() {
		
		//if() 공공할인을 포함하고 있으면 true 반환
		if(t.isSale())return true;
		//else 포함하고 있지 않으면 false 반환
		else return false;
		
		
	}
	public String getAnswer() {
		return answer;
	}
	public boolean setAnswer(String answer) {
		if((answer.equals("Y") || answer.equals("y") )&& price < getUsermoney()) {
			this.answer = answer;
			System.out.println("[결제 완료]");
			System.out.printf("마일리지 %.1f원이 적립되었습니다.",price*0.1);
			System.out.println("*Enter를 누르시면 기능선택화면으로 이동합니다.*");
			String enter = scan.nextLine();
			//엔터누르면 초기화면
			if(enter.equals("")){
				ReservationUI.selectMenu();
			}
	
			System.out.println();
			return true;	
			
		}
		else if((answer.equals("Y") || answer.equals("y") )&& price > getUsermoney()) {
			this.answer = answer;
			System.out.println("보유 잔액이 부족합니다.");
			System.out.println();
			return true;	
		}
		else if (answer.equals("N") || answer.equals("n")) {
			this.answer = answer;
			setReturnanswer(scan.next());
			System.out.println();
			return true;
		}
		else {
			System.out.println("Y(y)와N(n) 중에서 입력하세요");
			return false;
		}
		
	}
	public int getUsermoney() {
		return usermoney;
	}
	public void setUsermoney(int usermoney) {
		this.usermoney = usermoney;
	}
	public String getReturnanswer() {
		return returnanswer;
	}
	public void setReturnanswer(String returnanswer) {
		this.returnanswer = returnanswer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}






class TextRead {
	
	private boolean sale;
	private boolean money;

	public boolean isSale() {
		Path path = Paths.get("/Users/yudonghyeon/Documents/home/class/code/java/SemiProject/src/com/test/project/asdf.txt");
		
		try {
			List<String> allLines = Files.readAllLines(path);
			String nthLine = allLines.get(2);
			if(nthLine.contains("가능")) {
				return true;
			}
			return false;
		}catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
