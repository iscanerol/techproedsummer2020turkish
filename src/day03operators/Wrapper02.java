package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		// kullanicidan ilk ismini alin 

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen isminizi  giriniz");
		String isim =scan.nextLine();
		System.out.println("lutfen soyisminizi giriniz");

		String soyisim = scan.next();
		
		System.out.println(isim);
		System.out.println(soyisim);
		scan.close();
	}

}
