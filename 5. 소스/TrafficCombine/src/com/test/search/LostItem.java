package com.test.search;

public class LostItem {

	private String itemNo;
	private String transport;
	private String itemName;
	private String getDate;
	private String getPlace;
	private String keepDate;
	
	
	public LostItem(String itemNo, String transport, String itemName, String getDate, String getPlace,
			String keepDate) {
		super();
		this.itemNo = itemNo;
		this.transport = transport;
		this.itemName = itemName;
		this.getDate = getDate;
		this.getPlace = getPlace;
		this.keepDate = keepDate;
	}
	



	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getTransport() {
		return transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getGetDate() {
		return getDate;
	}
	public void setGetDate(String getDate) {
		this.getDate = getDate;
	}
	public String getGetPlace() {
		return getPlace;
	}
	public void setGetPlace(String getPlace) {
		this.getPlace = getPlace;
	}
	public String getKeepDate() {
		return keepDate;
	}
	public void setKeepDate(String keepDate) {
		this.keepDate = keepDate;
	}



	@Override
	public String toString() {
		return "LostItem [itemNo=" + itemNo + ", transport=" + transport + ", itemName=" + itemName + ", getDate="
				+ getDate + ", getPlace=" + getPlace + ", keepDate=" + keepDate + "]";
	}

	
	

		
		
		
		
	}
	
	
	
	
	
	

