package com.heraizen.cj.phone;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PhoneBookTest {
	static PhoneBook phone;
	@BeforeAll
	public static void objCre()
	{
		phone=new PhoneBook();
		phone.addDetails(new Phone("465564456","pravas"));
		phone.addDetails(new Phone("564+54684","abc"));
		phone.addDetails(new Phone("645465123","xyz"));
		phone.addDetails(new Phone("768378637","mno"));
		phone.addDetails(new Phone("21142151","wxy"));
		phone.addDetails(new Phone("014988424","def"));
		phone.addDetails(new Phone("628424855","pqr"));
		phone.addDetails(new Phone("6544565415","ijk"));
	}
	@Test
	void getPhoneTest() {
		assertEquals("pravas", phone.getName("465564456"));
		
	}
	@Test
	public void addTest()
	{
		assertEquals("ggg", phone.addDetails(new Phone("65445654","ggg")));
	}
	

}
