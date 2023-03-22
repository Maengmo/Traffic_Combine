package com.test.user;

public class Route2 {

	
	private String num;
	private String traffic;
	private String start;
	private String arrive;
	private String departureDate;
	private String departureTime;
	private	String price;
	private String seat;
	private String id;
	
	
	public Route2(String num, String traffic, String start, String arrive, String departureDate, String departureTime,
			String price, String seat, String id) {
		this.num = num;
		this.traffic = traffic;
		this.start = start;
		this.arrive = arrive;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.price = price;
		this.seat = seat;
		this.id = id;
	}
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getTraffic() {
		return traffic;
	}
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getArrive() {
		return arrive;
	}
	public void setArrive(String arrive) {
		this.arrive = arrive;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Route [num=" + num + ", traffic=" + traffic + ", start=" + start + ", arrive=" + arrive
				+ ", departureDate=" + departureDate + ", departureTime=" + departureTime + ", price=" + price
				+ ", seat=" + seat + ", id=" + id + "]";
	}
	

	
}
