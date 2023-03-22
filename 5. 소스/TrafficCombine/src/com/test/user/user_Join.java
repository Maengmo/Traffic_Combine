package com.test.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class user_Join {
	
	private String num;
	private String ID;
	private String Pw;
	private String name;
	private String born;
	private String gender;
	private String phone;
	private String discount;
	private String mg;
	private String money;
	
	public user_Join(String num, String id, String pw, String name, String born, String gender, String phone, String discount, String mg,
			String money) {
		this.num = num;
		this.ID = id;
		this.Pw = pw;
		this.name = name;
		this.born = born;
		this.gender = gender;
		this.phone = phone;
		this.discount = discount;
		this.mg = mg;
		this.money = money;
	}
	public String getnum() {
		return num;
	}
	
	public void setnum(String num) {
		this.num = num;
	}
	
	public String getID() {
		return ID;
	}

	public boolean setID(String id) {
		
		String regex = ""; 		//정규식
		Pattern pattern = null; //정규식 객체
		Matcher matcher = null; //결과 객체
		
		//1. 아이디 : 영어,숫자 8~16자리
		regex = "^[a-zA-Z0-9]{8,16}$";
		pattern = pattern.compile(regex);
		matcher = pattern.matcher(id); //입력값을 대상으로 정규식 검사
		
		if(!matcher.find()) {
			System.out.println("아이디를 필수로 입력, 영어,숫자, 8~16자 이내로 입력하세요.");
			return false;
		}else {
			ID = id;
			return true;
		}
		
	}

	public String getPw() {
		return Pw;
	}

	public boolean setPw(String pw) {
		String regex = ""; 		//정규식
		Pattern pattern = null; //정규식 객체
		Matcher matcher = null; //결과 객체
		
		//2. 패스워드 : 영어,숫자
		regex = "^[a-zA-Z0-9]{10,}$";
		pattern = pattern.compile(regex);
		matcher = pattern.matcher(pw); //입력값을 대상으로 정규식 검사
		
		if(!matcher.find()) {
			System.out.println("패스워드를 필수로 입력, 영어,숫자로 입력하세요.");
			return false;
		}else {
			this.Pw = pw;
			return true;
		}
		
	}

	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		
		String regex = ""; 		//정규식
		Pattern pattern = null; //정규식 객체
		Matcher matcher = null; //결과 객체
		
		//3. 이름 : 한글 2~5자
		regex = "^[가-힣]{2,5}$";
		pattern = pattern.compile(regex);
		matcher = pattern.matcher(name); //입력값을 대상으로 정규식 검사
		
		if(!matcher.find()) {
			System.out.println("이름을 한글 2~5자로 입력하세요.");
			return false;
		}else {
			this.name = name;
			return true;
		}
		
	}

	public String getBorn() {
		return born;
	}

	public boolean setBorn(String born) {
		
		String regex = ""; 		//정규식
		Pattern pattern = null; //정규식 객체
		Matcher matcher = null; //결과 객체
		
		//4. 생년월일 (숫자 8자리)
		regex = "^[0-9]{8,8}$";
		pattern = pattern.compile(regex);
		matcher = pattern.matcher(born); //입력값을 대상으로 정규식 검사
		
		if(!matcher.find()) {
			System.out.println("생년월일을 숫자 8자리로 입력하세요.");
			return false;
		}else {
			this.born = born;
			return true;
		}
		
	}

	public String getGender() {
		return gender;
	}

	public boolean setGender(String gender) {
		
		String regex = ""; 		//정규식
		Pattern pattern = null; //정규식 객체
		Matcher matcher = null; //결과 객체
		
		//5. 성별 입력 (M/F)
		regex = "^[MF]$";
		pattern = pattern.compile(regex);
		matcher = pattern.matcher(gender); //입력값을 대상으로 정규식 검사
		
		if(!matcher.find()) {
			System.out.println("성별을 (M/F)로 입력하세요.");
			return false;
		}else {
			this.gender = gender;
			return true;
		}

	}

	public String getPhone() {
		return phone;
	}

	public boolean setPhone(String phone) {
		
		String regex = ""; 		//정규식
		Pattern pattern = null; //정규식 객체
		Matcher matcher = null; //결과 객체
		
		//6. 연락처
		regex = "^010-[0-9][0-9][0-9][0-9]?-[0-9][0-9][0-9][0-9]$";
		pattern = pattern.compile(regex);
		matcher = pattern.matcher(phone); //입력값을 대상으로 정규식 검사
		
		if(!matcher.find()) {
			System.out.println("전화번호를 양식에 맞게 입력하세요.");
			return false;
		}else {
			this.phone = phone;
			return true;
		}

	}

	public String getDiscount() {
		return discount;
	}

	public boolean setDiscount(String discount) {
		
		String regex = ""; 		//정규식
		Pattern pattern = null; //정규식 객체
		Matcher matcher = null; //결과 객체
		
		//7. 공공할인 여부 입력
		regex = "[1-5]";
		pattern = pattern.compile(regex);
		matcher = pattern.matcher(phone); //입력값을 대상으로 정규식 검사
		
		if(!matcher.find()) {
			System.out.println("공공할인 여부를 양식에 맞게 입력하세요.");
			return false;
		}else {
			this.discount = discount;
			return true;
		}

	}

	public String getMg() {
		return mg;
	}

	public void setMg(String mg) {
		this.mg = mg;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "Join [ID=" + ID + ", Pw=" + Pw + ", name=" + name + ", born=" + born + ", gender=" + gender + ", phone="
				+ phone + ", discount=" + discount + ", mg=" + mg + ", money=" + money + "]";
	}
	
	public boolean check(String id, String pw, String name, String born, String gender, String phone, String discount) {
		
		if(this.setID(id)&&this.setPw(pw)&&this.setName(name)&&this.setBorn(born)&&this.setGender(gender)&&this.setPhone(phone)&&this.setDiscount(discount)) {
			return true;
		}
		return false;
	}
	
}

