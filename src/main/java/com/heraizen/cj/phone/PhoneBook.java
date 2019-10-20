package com.heraizen.cj.phone;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

	Map<String, String> map = new HashMap<>();

	public String addDetails(Phone p) {
		if (map.get(p.getPhoneNo()) == null) {
			map.put(p.getPhoneNo(), p.getName());
			return map.get(p.getPhoneNo());
		}
		return null;
	}
	public String getName(String phno) {
		return map.get(phno);
	}
	public void Quit() {
		System.exit(0);
	}

}
