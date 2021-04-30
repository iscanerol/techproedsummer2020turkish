package day04operators;

import java.util.Scanner;

public class Modulus3 {

	public static void main(String[] args) {
		// kullanicidan uc basamakli bir tamsayi alin.bu sayinin rakamlari toplamini bulun

		Scanner scan = new Scanner(System.in);
		
		System.out.println("uc basamakli bir sayi giriniz");
		 int s = scan.nextInt();
		 int birler = s % 10;
		 int v = s/10;
		 int onlar = v%10;
		 int yuzler = s / 100;
		 System.out.println(birler + onlar + yuzler);
		 scan.close();
	}

}
