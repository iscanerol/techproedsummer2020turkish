package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {
//Kullanicidan iki sayi girniz eger sayilar birbirine esitse toplamini degilse carpimini 
	//ekrana yazdiriniz
	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Birinci sayiyi giriniz");
	        double num1 = scan.nextDouble();
	        
	        System.out.println("Ikinci sayiyi giriniz");
	        double num2 = scan.nextDouble();
	        
	        double sonuc = num1==num2 ? num1+num2 : num1*num2;
	        System.out.println(sonuc);
	        scan.close();
	}

}
