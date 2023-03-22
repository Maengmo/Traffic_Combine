package com.test.Train;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.test.Airplane.AirPlane_RouteSet;
import com.test.Airplane.AirPlane_Route_data;

public class Train_Route_data {

	public final static String TRAINPATH = "/Users/kimdaehwan/Desktop/class/code/java/TrafficCombine/TrainData/";
	public final static String MKH = "mkh/route/";
	public final static String KTX = "ktx/route/";
	public final static String ITX = "itx/route/";
	public static String TRAINDIR = "";
	public static String TRAINFILE = "";
	
	public static ArrayList<Train_RouteSet> list;
	
	static {
		list = new ArrayList<Train_RouteSet>();
	}
	
	//********
	public static void load() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(Train_Route_data.TRAINPATH+TRAINDIR+TRAINFILE));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				//텍스트 1줄 > Member 객체 1개
				Train_RouteSet a = new Train_RouteSet(temp[0], temp[1], temp[2], temp[3]);
				list.add(a);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void findFile(String start, String arrive) {
		
			try {
			
			BufferedReader reader = new BufferedReader(new FileReader(Train_Route_data.TRAINPATH+TRAINDIR+TRAINFILE));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				//텍스트 1줄 > Member 객체 1개
				Train_RouteSet a = new Train_RouteSet(temp[0], temp[1], temp[2], temp[3]);
				
				if (temp[0].equals(start)&&temp[1].equals(arrive)) {
					list.add(a);
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void Select(String num, String num2) {
		Scanner scan = new Scanner(System.in);
		list.clear();
		
		if(num.equals("1")||num.equals("ITX")) {
			System.out.println("     \t\t\t□■□■ITX 노선■□■□");
			TRAINDIR = ITX;
			TRAINFILE = "itxRoute.txt";
		}else if(num.equals("2")||num.equals("KTX")) {
			System.out.println("    \t\t\t□■□■KTX 노선■□■□");
			TRAINDIR = KTX;
			String input = num2;
			if(input.equals("1")||input.equals("강릉선")) {
				System.out.println("    \t\t\t□■□■KTX 노선(강릉선)■□■□");
				TRAINFILE = "ktx_강릉선.txt";
			}else if(input.equals("2")||input.equals("경부고속선")) {
				System.out.println("     \t\t\t□■□■KTX 노선(경부고속선)■□■□");
				TRAINFILE = "ktx_경부고속선.txt";
			}else if(input.equals("3")||input.equals("경전선")) {
				System.out.println("     \t\t\t□■□■KTX 노선(경전선)■□■□");
				TRAINFILE = "ktx_경전선.txt";
			}else if(input.equals("4")||input.equals("전라선")) {
				System.out.println("     \t\t\t□■□■KTX 노선(전라선)■□■□");
				TRAINFILE = "ktx_전라선.txt";
			}else if(input.equals("5")||input.equals("중부내륙선")) {
				System.out.println("     \t\t\t□■□■KTX 노선(중부내륙선)■□■□");
				TRAINFILE = "ktx_중부내륙선.txt";
			}else if(input.equals("6")||input.equals("중앙선")) {
				System.out.println("     \t\t\t□■□■KTX 노선(중앙선)■□■□");
				TRAINFILE = "ktx_중앙선.txt";
			}else if(input.equals("7")||input.equals("호남선")) {
				System.out.println("     \t\t\t□■□■KTX 노선(호남선)■□■□");
				TRAINFILE = "ktx_호남선.txt";
			}
		}else if(num.equals("3")||num.equals("무궁화호")) {
			System.out.println("     \t\t\t□■□■무궁화호 노선■□■□");
			TRAINDIR = MKH;
			String input = num2;
			if(input.equals("1")||input.equals("무궁화호_경부선")) {
				System.out.println("     \t\t\t□■□■무궁화호 노선(경부선)■□■□");
				TRAINFILE = "무궁화호_경부선_노선.txt";
			}else if(input.equals("2")||input.equals("무궁화호_경북선")) {
				System.out.println("     \t\t\t□■□■무궁화호 노선(경북선)■□■□");
				TRAINFILE = "무궁화호_경북선_노선.txt";
			}else if(input.equals("3")||input.equals("무궁화호_경전선")) {
				System.out.println("     \t\t\t□■□■무궁화호 노선(경전선)■□■□");
				TRAINFILE = "무궁화호_경전선_노선.txt";
			}else if(input.equals("4")||input.equals("무궁화호_대구선")) {
				System.out.println("     \t\t\t□■□■무궁화호 노선(대구선)■□■□");
				TRAINFILE = "무궁화호_대구선_노선.txt";
			}else if(input.equals("5")||input.equals("무궁화호_동해남부선")) {
				System.out.println("     \t\t\t□■□■무궁화호 노선(동해남부선)■□■□");
				TRAINFILE = "무궁화호_동해남부선_노선.txt";
			}else if(input.equals("6")||input.equals("무궁화호_동해선")) {
				System.out.println("     \t\t\t□■□■무궁화호 노선(동해선)■□■□");
				TRAINFILE = "무궁화호_동해선_노선.txt";
			}else if(input.equals("7")||input.equals("무궁화호_영동선")) {
				System.out.println("     \t\t\t□■□■무궁화호 노선(영동선)■□■□");
				TRAINFILE = "무궁화호_영동선_노선.txt";
			}else if(input.equals("8")||input.equals("무궁화호_장항선")) {
				System.out.println("     \t\t\t□■□■무궁화호 노선(장항선)■□■□");
				TRAINFILE = "무궁화호_장항선_노선.txt";
			}else if(input.equals("9")||input.equals("무궁화호_전라선")) {
				System.out.println("     \t\t\t□■□■무궁화호 노선(전라선)■□■□");
				TRAINFILE = "무궁화호_전라선_노선.txt";
			}else if(input.equals("10")||input.equals("무궁화호_중앙선")) {
				System.out.println("     \t\t\t□■□■무궁화호 노선(중앙선)■□■□");
				TRAINFILE = "무궁화호_중앙선_노선.txt";
			}else if(input.equals("11")||input.equals("무궁화호_충북선")) {
				System.out.println("     \t\t\t□■□■무궁화호 노선(충북선)■□■□");
				TRAINFILE = "무궁화호_충북선_노선.txt";
			}else if(input.equals("12")||input.equals("무궁화호_태백선")) {
				System.out.println("     \t\t\t□■□■무궁화호 노선(태백선)■□■□");
				TRAINFILE = "무궁화호_태백선_노선.txt";
			}else if(input.equals("13")||input.equals("무궁화호_호남선")) {
				System.out.println("     \t\t\t□■□■무궁화호 노선(호남선)■□■□");
				TRAINFILE = "무궁화호_호남선_노선.txt";
			}
		}
		
	}
	
	public static void print() {
		
		for(Train_RouteSet t : list) {
			
			System.out.printf("출발지(역) : %s | 도착지(역) : %s | 날짜 : %s | 시간 : %s\n"
								, t.getStartStation()
								, t.getArriveStation()
								, t.getCalendar()
								, t.getTime());
			
		}
		
	}
	
	
	
}
