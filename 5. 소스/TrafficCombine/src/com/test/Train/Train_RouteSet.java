package com.test.Train;

public class Train_RouteSet {
	
	private String StartStation;
	private String ArriveStation;
	private String Calendar;
	private String time;
	
	public Train_RouteSet(String startStation, String arriveStation, String calendar, String time) {
		StartStation = startStation;
		ArriveStation = arriveStation;
		Calendar = calendar;
		this.time = time;
	}

	public String getStartStation() {
		return StartStation;
	}

	public void setStartStation(String startStation) {
		StartStation = startStation;
	}

	public String getArriveStation() {
		return ArriveStation;
	}

	public void setArriveStation(String arriveStation) {
		ArriveStation = arriveStation;
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
