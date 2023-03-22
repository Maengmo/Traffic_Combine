package com.test.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


//역할
//- member.txt의 입력과 출력

public class user_data {

	public final static String MEMBER = "/Users/kimdaehwan/Desktop/class/code/java/TrafficCombine/data/user.txt";
	public final static String USERPATH = "/Users/kimdaehwan/Desktop/class/code/java/TrafficCombine/userFile";
	
	public static ArrayList<user_Join> list;
	
	static {
		list = new ArrayList<user_Join>();
	}
	
	//********
	public static void load() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(user_data.MEMBER));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				//텍스트 1줄 > Member 객체 1개
				user_Join j = new user_Join(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
				list.add(j);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	//입력한 회원정보를 파일에 저장
	public static void save() {
		
		//배열 > (덮어쓰기) > user.txt
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(user_data.MEMBER));
			
			//Member m > 1, 홍길동, 20, 남자
			
			for(user_Join j : list) {
				writer.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\r\n"
										, j.getnum()
										, j.getID()
										, j.getPw()
										, j.getName()
										, j.getBorn()
										, j.getGender()
										, j.getPhone()
										, j.getDiscount()
										, j.getMg()
										, j.getMoney()));
			}
			
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//아이디와 패스워드를 입력받고 해당 정보가 있는지 확인
	public static boolean login_check(String id, String pw) {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(user_data.MEMBER));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				//텍스트 1줄 > Member 객체 1개
				user_Join j = new user_Join(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
				list.add(j);
				
				if (temp[1].equals(id)) {
					if(temp[2].equals(pw)) {
						return true;
					}
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void user_file(String id) {
		
		String path = id;
		File file = new File(USERPATH+"/"+path+".txt");
		
		
		if(file.exists()) {
			System.out.println("로그인 이력을 불러옵니다.");
		}else {
			try {
				file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static String money_check(String id) {
			
			try {
			
			BufferedReader reader = new BufferedReader(new FileReader(user_data.MEMBER));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				//텍스트 1줄 > Member 객체 1개
				user_Join j = new user_Join(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
				
				if (temp[1].equals(id)) {
					return temp[9];
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static void money_deposit(String id, String money) {
		
		try {
		
		list.clear();
		
		BufferedReader reader = new BufferedReader(new FileReader(user_data.MEMBER));
		
		String line = null;
		
		while((line = reader.readLine()) != null) {
			
			String[] temp = line.split(",");
			
			//텍스트 1줄 > Member 객체 1개
			user_Join j = new user_Join(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
			
			
			if (temp[1].equals(id)) {
				temp[9] = money;
				j = new user_Join(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
			}
			list.add(j);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}

	} 
	public static String milige_check(String id) {
		
		try {
		
		BufferedReader reader = new BufferedReader(new FileReader(user_data.MEMBER));
		
		String line = null;
		
		while((line = reader.readLine()) != null) {
			
			String[] temp = line.split(",");
			
			//텍스트 1줄 > Member 객체 1개
			user_Join j = new user_Join(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
			
			if (temp[1].equals(id)) {
				return temp[8];
			}
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return "";
	}
	
	//마일리지 리스트에 적용. (파일에는 저장 안된 상태임으로, save 꼭해야함)
	public static void milige_deposit(String id, String milige) {
		
		try {
		
		list.clear();
		
		BufferedReader reader = new BufferedReader(new FileReader(user_data.MEMBER));
		
		String line = null;
		
		while((line = reader.readLine()) != null) {
			
			String[] temp = line.split(",");
			
			//텍스트 1줄 > Member 객체 1개
			user_Join j = new user_Join(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
			
			
			if (temp[1].equals(id)) {
				temp[8] = milige;
				j = new user_Join(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
			}
			list.add(j);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public static String[] user_check(String id) {
		
		try {
		
		BufferedReader reader = new BufferedReader(new FileReader(user_data.MEMBER));
		
		String line = null;
		
		while((line = reader.readLine()) != null) {
			
			String[] temp = line.split(",");
			
			//텍스트 1줄 > Member 객체 1개
			user_Join j = new user_Join(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
			
			if (temp[1].equals(id)) {
				return temp;
			}
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
	}
	
	public static void userWithdraw(String id) {
		
		try {
		
		list.clear();
		
		BufferedReader reader = new BufferedReader(new FileReader(user_data.MEMBER));
		
		String line = null;
		
		while((line = reader.readLine()) != null) {
			
			String[] temp = line.split(",");
			
			//텍스트 1줄 > Member 객체 1개
			user_Join j = new user_Join(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
			
			
			if (temp[1].equals(id)) {
				
			}else {
				list.add(j);
			}
			
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	public static String sale_check(String id) {
		
		try {
		
		BufferedReader reader = new BufferedReader(new FileReader(user_data.MEMBER));
		
		String line = null;
		
		while((line = reader.readLine()) != null) {
			
			String[] temp = line.split(",");
			
			//텍스트 1줄 > Member 객체 1개
			user_Join j = new user_Join(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
			
			if (temp[1].equals(id)) {
				return temp[7];
			}
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return "";
	}
	
	
	
	
}
