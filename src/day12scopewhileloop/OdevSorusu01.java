package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		//Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin 
		// bastan ikinci harfi ile sondan ikinci harfini
    //b�y�k harf olarak ekrana yazd�r�n.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasadiginiz ulkenin isimini giriniz");
		String ulke = scan.nextLine();
		
		//Almanya ==> length 7, y nin indexi 5 
		System.out.println(ulke.toUpperCase().charAt(1));//2. harfin indexi 1 dir
		System.out.println(ulke.toUpperCase().charAt(ulke.length()-2));
         
		scan.close();
	}

}
