package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
		// Kullan�c�dan bir character al�n e�er character bir harf ise ekrana �Harf� yazd�r�n. 
		// Di�er durumlarda ekrana �Harf de�il� yazd�r�n.

		Scanner scan = new Scanner(System.in);
		System.out.println("bir character girin");
		char harf = scan.next().charAt(0);//kullanicidan char almak icin next().charAt(0) kullanilir
		if((harf<=122 && harf>=97) || (harf<=90 && harf>=65)) {
			System.out.println("bu bir harftir");
			
		}else {
			System.out.println("bu bir harf degildir");
			scan.close();
		}
		
		
		
		
		
		
		
		
	}

}
