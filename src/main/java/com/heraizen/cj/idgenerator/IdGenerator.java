package com.heraizen.cj.idgenerator;

public class IdGenerator {

	private static int count=5005;
	private static String suffix="IND";
	private static  String prifix="ASHO";
	public static  String getMemeberId(){
		return IdGenerator.getPrifix()+IdGenerator.getCount()+IdGenerator.getSuffix();
	
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		IdGenerator.count = count;
	}
	public static String getSuffix() {
		return suffix;
	}
	public static void setSuffix(String suffix) {
		IdGenerator.suffix = suffix;
	}
	public static String getPrifix() {
		return prifix;
	}
	public static void setPrifix(String prifix) {
		IdGenerator.prifix = prifix;
	}
	
}
