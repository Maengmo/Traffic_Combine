package com.test.reservation;


public class rvRoute {
		
		private String num;
		private String transfort;
		private String departure;
		private String arrive;
		private String departureDate; //Calendar?
		private String departureTime; //Calendar?
		private	String price;
		private String stseatgrade;
		private String id;
		
		public rvRoute(String num , String transfort, String departure, String arrive, String departureDate, String departureTime, String price , String stseatgrade , String id) {
			this.num = num;
			this.transfort = transfort;
			this.departure = departure;
			this.arrive = arrive;
			this.departureDate = departureDate;
			this.departureTime = departureTime;
			this.price = price;
			this.stseatgrade = stseatgrade;
			this.id = id;
			
		
			
			
			
		}

		public String getNum() {
			return num;
		}

		public void setNum(String num) {
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

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getStseatgrade() {
			return stseatgrade;
		}

		public void setStseatgrade(String stseatgrade) {
			this.stseatgrade = stseatgrade;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
		
}

