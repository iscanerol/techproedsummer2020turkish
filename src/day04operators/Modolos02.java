package day04operators;

import java.util.Scanner;

public class Modolos02 {

	public static void main(String[] args) {
		//kullanicinin giridigi 4 basamakli sayinin ilk ve son rakaminin toplaminiveren prg yapiniz
	Scanner scan = new Scanner(System.in);
	System.out.println("dort basamakli bir tam sayi giriniz");
	int s = scan.nextInt();//bir tam sayinin birler basamagini sayiyi 10 bolerek buluruz
	int ilkRakam   = s % 10;
	int sonRakam = s / 1000;
	
	System.out.println(ilkRakam + sonRakam );
	scan.close();

	}

}
