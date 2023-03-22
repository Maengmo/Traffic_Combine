package com.test.Bus;

public class Bus_set {

	private String num;
	private String area;
	private String space;
	private String address;
	
	
	public Bus_set(String num, String area, String space, String address) {
		this.num = num;
		this.area = area;
		this.space = space;
		this.address = address;
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
	public String getSpace() {
		return space;
	}
	public void setSpace(String space) {
		this.space = space;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Bus_set [num=" + num + ", area=" + area + ", space=" + space + ", address=" + address + "]";
	}
	
	
	
}
