package com.kkc.restaurantDto;

public class RestaurantDto {

	private String resNo;
	private String name;
	private String address;
	private String type;
	private String phone;

	public String getResNo() {
		return resNo;
	}

	public void setResNo(String resNo) {
		this.resNo = resNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "RestaurantDto [resNo=" + resNo + ", name=" + name + ", address=" + address + ", type=" + type
				+ ", phone=" + phone + "]";
	}
	
	

}
