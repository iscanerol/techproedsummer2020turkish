package day06ifstatement;

import java.util.Scanner;

public class IfElseIIfStatement02 {
	public static void main(String[]args) {
		/* Kullan�c�dan s�nav notunu tamsay� olarak girmesini isteyin
		 * Negatif girerse ekrana "Yanl�� girdiniz" yazd�r�n
		 * 0 dan b�y�k e�it ve 50 den k���k girerse ekrana "Kald�n�z" yazd�r�n
		 * 50 den b�y�k e�it ve 80 den k���k ise ekrana "Ge�tiniz" yazd�r�n
		 * 80 den b�y�k ve e�it ve 100 den k���k ise ekrana "Tebrikler yazd�r�n"
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
