package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// Kullanici haftanin gun numarasini girsin
				// Programiniz gunun ismini yazsin
				// switch() kullanarak yapiniz.
		//yanlis gun girerse "gecerli gun sayisi giriniz" yazsin
		Scanner scan = new Scanner(System.in);
		int gunNum = scan.nextInt();
		switch(gunNum) { 
		case 1:
            System.out.println("pazartesi");
            break;
		case 2:
            System.out.println("sali");
            break;
		case 3:
            System.out.println("carsamba");
            break;
		case 4:
            System.out.println("persembei");
            break;
		case 5:
            System.out.println("cuma");
            break;
		case 6:
            System.out.println("cumatesi");
            break;
		case 7:
            System.out.println("pazar");
            break;
		default :
			System.out.println("gecerli gun numarasi giriniz");
	}
		scan.close();
}}
