package com.heraizen.cj.enumex;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class EnumTest {
	Day day;

	public EnumTest(Day day) {
		this.day = day;
	}

	public void weekdays() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}
}

public class EnumDemo {
	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.weekdays();
	}
}
