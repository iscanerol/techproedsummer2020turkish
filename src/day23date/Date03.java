package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		// time manipulation (zamani degistiregiz)
		LocalTime time = LocalTime.now();
		System.out.println(time.plusHours(5));
		System.out.println(time.plusMinutes(59));
		System.out.println(time.plusNanos(38));
		System.out.println(time.minusHours(5));
		System.out.println(time.minusMinutes(55));
		System.out.println(time.minusNanos(50));
	}

}
