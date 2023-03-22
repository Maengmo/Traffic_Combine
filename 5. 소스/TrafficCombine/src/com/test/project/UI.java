package com.test.project;

import java.util.Scanner;


import com.github.lalyos.jfiglet.FigletFont;
import com.test.user.user_Service;
import com.test.user.user_UI;
import com.test.user.user_data;
import com.test.user.user_deposit;
import com.test.reservation.CheckReservation;
import com.test.reservation.ReservationRoute;
import com.test.search.LostItemData;
import com.test.search.LostItemUI;
import com.test.user.user_MypageService;

public class UI {

	public static void mainMenu() {
		
//		try {
//			
//			String asciiArt1 = FigletFont.convertOneLine("Hello World");
//			System.out.println(asciiArt1);
//			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//			
//		}
		System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■ ");
		System.out.println("O))) O))))))                     O))    O))          \n"
				+ "     O))                       O)     O)    O)       \n"
				+ "     O))    O) O)))   O))    O)O) O)O)O) O)      O)))\n"
				+ "     O))     O))    O))  O))   O))    O))  O)) O))   \n"
				+ "     O))     O))   O))   O))   O))    O))  O))O))    \n"
				+ "     O))     O))   O))   O))   O))    O))  O)) O))   \n"
				+ "     O))    O)))     O)) O)))  O))    O))  O))   O)))");
		System.out.println("\n"
				+ "    O))                          O))                            \n"
				+ " O))   O))                       O))       O)                   \n"
				+ "O))          O))    O))) O)) O)) O))         O)) O))     O))    \n"
				+ "O))        O))  O))  O))  O)  O))O)) O))  O)) O))  O)) O)   O)) \n"
				+ "O))       O))    O)) O))  O)  O))O))   O))O)) O))  O))O))))) O))\n"
				+ " O))   O)) O))  O))  O))  O)  O))O))   O))O)) O))  O))O)        \n"
				+ "   O))))     O))    O)))  O)  O))O)) O))  O))O)))  O))  O))))  ");
		System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■ ");
		System.out.println();
		System.out.println("╔■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■	╗");
		System.out.println("║■■■■■■■■■■■■■■■■■■■■■■■■[통합 예약 시스템]■■■■■■■■■■■■■■■■■■■■■■■■	║");
		System.out.println("║■■■■■■■■■■■■■■■■■■■1. 노선 조회/유실물 조회 서비스 ■■■■■■■■■■■■■■■■■■	║");
		System.out.println("║■■■■■■■■■■■■■■■■■■■■■■■■■■2. 로그인 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■	║");
		System.out.println("║■■■■■■■■■■■■■■■■■■■■■■■■■■3. 회원가입■■■■■■■■■■■■■■■■■■■■■■■■■■■■	║");
		System.out.println("║■■■■■■■■■■■■■■■■■■■■■■■■■■4. 종료하기■■■■■■■■■■■■■■■■■■■■■■■■■■■■	║");
		System.out.println("╚■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■	╝");
		
	}
	
	public static void pause() {
		
		//잠시 멈춤(메인 메뉴로 바로 돌아가지 못하게)
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("계속하시려면 [엔터]를 입력하세요.");
		scan.nextLine();
		
	}
	
	public static void subMenu(String title) {
		
		System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
		System.out.printf("■■■■■■■■■■■■■■■■■■■■■■■■■■ <%s> ■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n", title);
		System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
		
	}
	
	public static void loginUI() {
		System.out.println("╔■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■	╗");
		System.out.println("║■■■■■■■■■■■■■■■■■■■■■[회원 전용 통합 예약 시스템]■■■■■■■■■■■■■■■■■■■■	║");
		System.out.println("║■■■■■■■■■■■■■■■■■■■■■■■■■1. 노선 조회/예약	■■■■■■■■■■■■■■■■■■■■■■■■║");
		System.out.println("║■■■■■■■■■■■■■■■■■■■■■■■■■2. 유실물 조회	■■■■■■■■■■■■■■■■■■■■■■■■║");
		System.out.println("║■■■■■■■■■■■■■■■■■■■■■■■■■3. 예약내역 조회	■■■■■■■■■■■■■■■■■■■■■■■	║");
		System.out.println("║■■■■■■■■■■■■■■■■■■■■■■■■■4. 회원정보 조회	■■■■■■■■■■■■■■■■■■■■■■■	║");
		System.out.println("║■■■■■■■■■■■■■■■■■■■■■■■■■5. 결제금액 충전	■■■■■■■■■■■■■■■■■■■■■■■■║");
		System.out.println("║■■■■■■■■■■■■■■■■■■■■■■■■■6. 뒤로가기     ■■■■■■■■■■■■■■■■■■■■■■■■	║");
		System.out.println("╚■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■	╝");
	}
	
	public static void loginloop() {
		
		boolean loop = true;
		Scanner scan = new Scanner(System.in);
		
		while (loop) {
			
			subMenu("회원 전용 시스템");
			loginUI();
			System.out.print("원하시는 서비스를 입력하세요 : ");
			String sel = scan.nextLine();
			
			if(sel.equals("1")) {
				//노선 조회/예약
				ReservationRoute.search();
			} else if(sel.equals("2")) {
				//유실물 리스트 파일 불러오기
				LostItemData.lostItemLoad();
				//유실물 교통수단 선택 메뉴
				LostItemUI.transportMenu();
			} else if(sel.equals("3")) {
				//예약내역 조회
				CheckReservation.load();
			} else if(sel.equals("4")) {
				subMenu("회원정보 조회");
				user_MypageService.myPage();
			} else if(sel.equals("5")) {
				subMenu("입금 창구");
				user_deposit.deposit_UI(user_Service.LOGIN_NOW);
				user_data.save();
			} else if(sel.equals("6")) {
				Main.Start();
				loop = false;
			}else {
				loop = false;
			}
			UI.pause();
		}//while(menu)
	}
	
	public static void SeatUI(String kind) {
		
		
		String banner = String.format(
					"╔\t\t\t╗\n"
				+ "       ▣ %s ▣\n"
				+ "       ☻좌석 배치도☻\n"
				+ "╚\t\t\t╝\n",kind);
		
		String seat = String.format(
				  "     ☜ 좌측 우측 ☞ \n"
				+ "♠ ⓕⓘⓡⓢⓣ ⓒⓛⓐⓢⓢ ♠\n"
				+ "   【1 】【2 】  【3 】【4 】\n"
				+ "◆ ⓑⓤⓢⓘⓝⓔⓢ ⓒⓛⓐⓢⓢ ◆\n"
				+ "   【5 】【6 】  【7 】【8 】\n"
				+ "   【9 】【10】  【11】【12】\n"
				+ "♣ ⓔⓒⓞⓝⓞⓜⓨ ⓒⓛⓐⓢⓢ ♣\n"
				+ "   【13】【14】  【15】【16】\n"
				+ "   【17】【18】  【19】【20】\n"
				+ "   【21】【22】  【23】【24】\n"
				+ "   【25】【26】  【27】【28】\n"
				+ "   【29】【30】  【31】【32】\n"
				+ "   【33】【34】  【35】【36】\n"
				+ "   【37】【38】  【39】【40】\n");
	
		char alpha = 'A';
		
		//입력값이 버스 일 경우
		if(kind.equals("버스")||kind.equals("2")) {
			
			
			System.out.println(banner);
			
			System.out.println(seat);
			
		// 입력 값이 기차 일 경우
		}else if(kind.equals("기차")||kind.equals("1")) {
			
			System.out.println(banner);
			
			for(int i=0; i<10; i++) {
				
				String Number = String.format(
						"       ▣ %s 칸 ▣", alpha);
				alpha++;
				System.out.println(Number);
				System.out.println(seat);
				
			}
		// 입력 값이 비행기 일 경우
		}else if(kind.equals("비행기")||kind.equals("3")) {
			
			System.out.println(banner);
			
			for(int i=0; i<3; i++) {
				
				String Number = String.format(
						"       ▣ %s 칸 ▣", alpha);
				alpha++;
				System.out.println(Number);
				System.out.println(seat);
				
			}
		}
		
		
		
	}
	
	
}