package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {
//kullanicidan bir sayi aliniz sayi cift ise 10 a bolunup bolunmedigini kontrol edniz
		//10 bolunuyorsa woow 10 yazdiriniz
		//10 bolunmuyorsa yazik 10 yazdiriniz
		//sayi tek ise 5 e bolunup bolunmedigini kontrol ediniz. bolunuyorsa woow 5 bolunmuyorsa 
		//yazik 5 yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int num = scan.nextInt();
	String sonuc=	num%2==0 ? ((num%10==0) ? "woow 10" : "yazik 10") : (num%5==0 ? "woow 5" : "yazik 5");
	System.out.println(sonuc);
	scan.close();
	}

}
