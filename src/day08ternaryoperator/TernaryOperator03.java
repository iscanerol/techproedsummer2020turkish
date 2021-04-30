package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi aliniz
				// Kucuk sayiyi ekrana yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("iki sayi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
	int sonuc=	num1<num2 ? num1 : num2;
	System.out.println(sonuc);
	scan.close();
	}

}
