package com.test.Airplane;

public class AirPlane_RouteSet {

	private String area;
	private String airport;
	private String Calendar;
	private String time;
	
	public AirPlane_RouteSet(String area, String airport, String calendar, String time) {
		this.area = area;
		this.airport = airport;
		Calendar = calendar;
		this.time = time;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getCalendar() {
		return Calendar;
	}

	public void setCalendar(String calendar) {
		Calendar = calendar;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
	

	
	
}
