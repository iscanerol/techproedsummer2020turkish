package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		//kullanicidan integer aldiktan sonra String alamiyoruz
		Scanner scan = new Scanner(System.in);
		// javada nextint kullandiktan sonra nextline kullanirsak kod calimiyor
		//cozum = nextint yerine nextline kullan .sonra elde ettimiz Stringi 
		//Integer.parseInt() kullanarak integere cevir
		System.out.println("yasinizi giriniz");
		//int yas = scan.nextInt();
		String yas = scan.nextLine();//Stringi tam sayiya cevirme methodu Integer.parseInt()
		                              //sadece rakam iceren Stringlerde icin kullanilir
		int yeniYas = Integer.parseInt(yas);
		System.out.println(yas);
		
		System.out.println("adinizi ve soyadinizi giriniz");
		String isim = scan.nextLine();
		System.out.println(isim);
		
		scan.close();


	}

}
