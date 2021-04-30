package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {
		//ikitane variablenin degerlerini yer degistiriniz
		// sayi1= 12 , sayi2 = 30 ==>sayi1 =30  sayi = 12 olacak(bu isleme swap denir)
		
		
        Scanner scan = new Scanner(System.in);
        System.out.println("yerlerini degistirmek icin iki sayi giriniz");
        
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        // yol =
        System.out.println("yer degistirmeden once");
        System.out.println(sayi1);
        System.out.println(sayi2);
        
        double gecici = 0.0;
        gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;
        
        System.out.println("yer degistirdikten sonra");
        System.out.println(sayi1);
        System.out.println(sayi2);
         //2 . yol
        System.out.println("yer degistirmek icin iki sayi daha giriniz");
    
        double sayi3 = scan.nextDouble();
        double sayi4 =  scan.nextDouble();
        
        sayi3 = sayi3 + sayi4;
        sayi4 = sayi3 - sayi4;
        sayi3 = sayi3 - sayi4;
        
        System.out.println("yer degistirdikten sonra");
        System.out.println(sayi3);
        System.out.println(sayi4);
        scan.close();
	}

}
