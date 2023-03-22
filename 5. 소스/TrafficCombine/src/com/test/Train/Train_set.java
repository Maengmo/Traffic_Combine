package com.test.Train;

public class Train_set {

	private String num;
	private String area;
	
	public Train_set(String num, String area) {
		this.num = num;
		this.area = area;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Train_set [num=" + num + ", area=" + area + "]";
	}
	
	
	
	
}
