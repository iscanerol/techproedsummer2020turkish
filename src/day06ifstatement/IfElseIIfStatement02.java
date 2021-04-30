package day06ifstatement;

import java.util.Scanner;

public class IfElseIIfStatement02 {
	public static void main(String[]args) {
		/* Kullanýcýdan sýnav notunu tamsayý olarak girmesini isteyin
		 * Negatif girerse ekrana "Yanlýþ girdiniz" yazdýrýn
		 * 0 dan büyük eþit ve 50 den küçük girerse ekrana "Kaldýnýz" yazdýrýn
		 * 50 den büyük eþit ve 80 den küçük ise ekrana "Geçtiniz" yazdýrýn
		 * 80 den büyük ve eþit ve 100 den küçük ise ekrana "Tebrikler yazdýrýn"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen sinav notunuzu giriniz");
		
		int not=scan.nextInt();
		
		if(not<0) {
			System.out.println("yanlis deger girdiniz");
		}
		 else if(not<50) {
			System.out.println("kaldiniz");
		}else if (not<80){
			System.out.println("gectiniz");
		}else if (not<100){
			System.out.println("tebrikler");
		}
		
		
		
		scan.close();
		
		
		
		
	}

}
