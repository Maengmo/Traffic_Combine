package com.test.search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.test.project.UI;
import com.test.user.user_Service;


public class LostItemUI {
	
	public static String transportSelect;
	public static String ridingDate;
	public static String arrivingPlace;
	
	
	public final static String MEMBER = "/Users/kimdaehwan/Desktop/class/code/java/TrafficCombine/data/LostItem.txt";
	
	public static ArrayList<LostItem> list;

	static {
		list = new ArrayList<LostItem>() ;
	}
	
	
	

	
	
	public static void transportMenu() {
		System.out.println();
		System.out.println("■■■■■■■[유실물 조회]■■■■■■■");
		System.out.println();
		System.out.println("\t1. 기차");
		System.out.println("\t2. 버스");
		System.out.println("\t3. 비행기");
		System.out.println("\t4. 이전 화면으로 돌아가기");
		System.out.println();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		
		 
		while(loop) {
			System.out.print("선택 (숫자만 입력가능): ");
			String menuNum = scan.nextLine();
			
			
			if(menuNum.equals("1")) {
				LostItemUI.transportSelect = "기차"; 
				//탑승날짜입력
				LostItemUI.writeDate();
				//도착지 입력
				LostItemUI.writeArrivingPlace();
				//입력값에 따른 특정 유실물 조회
				LostItemUI.checkMyItem();
			} else if (menuNum.equals("2")) {
				LostItemUI.transportSelect = "버스";
				//탑승날짜입력
				LostItemUI.writeDate();
				//도착지 입력
				LostItemUI.writeArrivingPlace();
				//입력값에 따른 특정 유실물 조회
				LostItemUI.checkMyItem();
			} else if (menuNum.equals("3")) {
				LostItemUI.transportSelect = "비행기"; 
				//탑승날짜입력
				LostItemUI.writeDate();
				//도착지 입력
				LostItemUI.writeArrivingPlace();
				//입력값에 따른 특정 유실물 조회
				LostItemUI.checkMyItem();
			} else if (menuNum.equals("4")) {
				System.out.println("이전화면으로 돌아갑니다.");
				if(user_Service.LOGIN_NOW.equals("")) {
					SearchUI.selectMenu();
				}else {
					UI.loginloop();
				}
				
				loop = false;
			}else {
				System.out.println("잘못 입력하셨습니다. 이전화면으로 돌아갑니다.");
				loop=false;
			}
			
			
		}	
		
	
		
		
	}

	public static void writeDate()  {
		System.out.println();
		
		boolean loop = true;
		
		while (loop) {
		System.out.print("탑승날짜(YYYY-MM-DD로 작성하세요): ");
		
			
		Scanner scan = new Scanner(System.in);
		LostItemUI.ridingDate = scan.nextLine();
		
		
		String regex = ""; //정규식
		Pattern pattern = null; //정규식 객체
		Matcher matcher = null; //결과 객체
		
		//1. 출발일 유효성 검사
		regex = "^[\\d]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
		pattern = Pattern.compile(regex); 
		matcher = pattern.matcher(LostItemUI.ridingDate); 
		
		System.out.println();

			if (!matcher.find()) {
				System.out.println("***\"20XX-XX-XX\" 형태로 입력해주세요.***");
				System.out.println("교통수단부터 다시 입력해주시길 바랍니다.");
				
				LostItemUI.pause();
				
			} 
		loop= false;
		}
		
		
		
	}
	
	public static void writeArrivingPlace() {
	
		System.out.print("도착지: ");
		
		Scanner scan = new Scanner(System.in);
		LostItemUI.arrivingPlace = scan.nextLine();
		
		
		
	}
	
	
	public static void pause() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("계속하시려면 [Enter]를 입력하세요.");
		scan.nextLine(); 
	}
	

	
	
	public static void allLostItemList() {
		
		
		System.out.println("[번호]\t[이용 대중교통명]\t[유실물명]\t[습득날짜]\t[습득장소]\t[보관기간]");
		
		for (LostItem item : LostItemData.itemlist) {
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",item.getItemNo()
														,item.getTransport()
														,item.getItemName()
														,item.getGetDate()
														,item.getGetPlace()
														,item.getKeepDate()
														);
		}
		
		
		
	}
	
	
	
	
	public static void checkMyItem() {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<LostItem> myItems = new ArrayList<LostItem>();
		
		System.out.println();
		
	
		System.out.println("[번호]\t[이용 대중교통명]\t[유실물명]\t\t[습득날짜]\t\t[습득장소]\t\t[보관기간]");
		
		
		
		//데이터가 속한 목록들을 myItems란 ArrayList에 추가시키기
			for(LostItem item : LostItemData.itemlist) {

				
				if(LostItemUI.transportSelect.equals(item.getTransport()) 
						&& LostItemUI.ridingDate.equals(item.getGetDate()) 
						&& LostItemUI.arrivingPlace.equals(item.getGetPlace()) ) {
					
					System.out.printf("%3s\t%7s\t%12s\t%17s\t%5s\t%17s", item.getItemNo()
																,item.getTransport()
																,item.getItemName()
																,item.getGetDate()
																,item.getGetPlace()
																,item.getKeepDate());
					
					System.out.println();
					System.out.println();
					
				} 
				
			}
			LostItemData.itemlist.clear();
			
			System.out.println();
			System.out.println("찾으시는 유실물이 없다면 처음부터 다시 입력해주세요.");
			System.out.println("이전 화면으로 돌아가고 싶다면 [Enter]를 눌러주세요.");
			
			scan.nextLine();
			SearchLostItem.search();

			
	}
	
	
	

}
