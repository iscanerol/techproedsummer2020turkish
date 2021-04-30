package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
//kullanicidan bir string alin bu stringin indexi tek sayi olan characterlerini ekrana yazdirin
		Scanner scan = new Scanner (System.in);
		System.out.println("bir kelime veya cumle giriniz");
		String str = scan.nextLine();
		int length = str.length();
		int i=0;
		
		do {
			if(i%2==1) {
				System.out.print(str.charAt(i) + " ");
			}
			i++;
		}while(i<length);
		scan.close();
	}

}
