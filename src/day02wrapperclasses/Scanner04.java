package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dikdortgenin en ve boyunu giriniz");
		
		 
		int buyukKenar = scan.nextInt();
		int kucukKenar = scan.nextInt();
		
		System.out.println( buyukKenar*kucukKenar);
		System.out.println(2*(buyukKenar + kucukKenar));
		scan.close();
	}

}
