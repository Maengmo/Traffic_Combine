package com.test.Airplane;

public class AirPlane_set {
	private String num;
	private String area;
	
	public AirPlane_set(String num, String area) {
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
		return "AirPlane_set [num=" + num + ", area=" + area + "]";
	}
	
	
}
