package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
//kullanicidan bir character girmsenini isteyiniz.character harf ise kucuk harf olup olmadigini 
//kontrol ediniz.kucukse ekrna kucuk harf yazdirinzi,buyukse buyuk yazdiriniz
		//har degilse harf degil yazdiriniz
		Scanner scan = new Scanner(System.in);
		System.out.println("bir character giriniz");
		char harf = scan.next().charAt(0);
		 
       String result = ((harf<=122 && harf>=97)||(harf>=65 && harf<=90)) ? ((harf<=122 && harf>=97) ? "kucuk harf" :  "buyuk harf") : "harf degill";
       System.out.println(result);
       scan.close();
	}

}
