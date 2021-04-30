package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04IfElseIf {

	public static void main(String[] args) {
//ternary operator (if else if)
		//kullanicidan bir sayi aliniz 
		//sayi 0 dan buyuk esit ise10 dan kucuk olup olmadigini kontrol ediniz
		//10 dan kucuk ise ekrana rakam yazdiriniz degilse pozitif sayi yazdiriniz
		//0 dan kucuk ise negatif sayi yazdiriniz
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		 
        System.out.println("Bir sayi giriniz");
        double num = scan.nextDouble();
        
        String result = num>=0 ?( num<10 ? "Rakam" : "Pozitif Sayi") : "Negatif Sayi";
        
        System.out.println(num + " " + result + "dir");
        
        scan.close();

	
	}

}
