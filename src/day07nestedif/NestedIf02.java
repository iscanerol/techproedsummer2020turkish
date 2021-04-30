package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		//kullanicidan password girmesini isteyin
		//password dort basmakli bir sayi ise cift olup olmadigini kotrol edin
		//cift ise "password tamam" yazdirin tek ise "tekrar deneyin "yazdirin
		//password dort basmakli degil isetekrar deneyin yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("password giriniz");
		int pass = scan.nextInt();
		 if(pass>999 && pass<10000) {
			 if(pass%2==0) {
				 System.out.println("password tamam");
			 }else if(pass%2!=0) {
				 System.out.println("tekrar deneyin");
			 
			 }		 
		 }else {
			 System.out.println("yanlis tekrar deneyin");
		 }
		 

		 scan.close();
	}

}
