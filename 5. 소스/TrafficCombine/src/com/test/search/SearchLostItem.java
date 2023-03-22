package com.test.search;

import java.util.Scanner;

public class SearchLostItem {//유실물조회

	public static void search() {
		
		//유실물 리스트 파일 불러오기
		LostItemData.lostItemLoad();
		
		
		//파일 내 유실물 리스트
		//LostItemUI.ItemList();
		
		//유실물 교통수단 선택 메뉴
		LostItemUI.transportMenu();
		
		//탑승날짜입력
		//LostItemUI.writeDate();
		
		
		//도착지 입력
		//LostItemUI.writeArrivingPlace();
		
		
		//입력값에 따른 특정 유실물 조회
		//LostItemUI.checkMyItem();
	 
	}
}
