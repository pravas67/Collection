package com.heraizen.cj.phone;

public class Phone {
	private String phoneNo;
	private String name;
	Phone(String phoneNo,String name)
	{
		this.phoneNo=phoneNo;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Phone [phoneNo=" + phoneNo + ", name=" + name + "]";
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
