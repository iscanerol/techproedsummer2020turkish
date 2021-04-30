package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
//Date Manipulation (date uzerinde degisiklikler yapmak)
		LocalDate date = LocalDate.now();
		System.out.println(date.plusDays(3));//gun eklemek icin kullanilir  plusDays.//
		                                 // ay eklemek icin date.plusMonths kullanilir
	    System.out.println(date.plusYears(2));//yil eklemek icin date.plusYears kullanili
	
	   System.out.println( date.minusDays(2));//gun cikarmak icin minusDays kullanilir
       System.out.println( date.minusMonths(2));//ay cikarmak icin kullanilir
}
}