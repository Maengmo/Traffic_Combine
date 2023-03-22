package com.test.search;

import com.test.reservation.Reserve;

//import java.util.Calendar;

public class Route {
	
	private int num;
	private String transfort;
	private String departure;
	private String arrive;
	private String departureDate; //Calendar?
	private String departureTime; //Calendar?
	private double price;
	private String seat;
	Reserve rv = new Reserve();
	
	public Route(String transfort, String departure, String arrive, String departureDate, String departureTime) {
		this.num = 1;
		this.transfort = transfort;
		this.departure = departure;
		this.arrive = arrive;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.price = rv.price;
		this.seat = rv.seat;
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTransfort() {
		return transfort;
	}

	public void setTransfort(String transfort) {
		this.transfort = transfort;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "Route [num=" + num + ", transfort=" + transfort + ", departure=" + departure + ", arrive=" + arrive
				+ ", departureDate=" + departureDate + ", departureTime=" + departureTime + ", price=" + price
				+ ", seat=" + seat + "]";
	}

}
