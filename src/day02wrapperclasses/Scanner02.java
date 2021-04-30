package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		//kullanici karenin bir kenar uzunlugunu girsin
		//karenin alani ve cevresini yazdiralim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen karenin bir kenar uzunlugunu giriniz");
		
		int kenarUzunlugu = scan.nextInt();
		System.out.println(4*kenarUzunlugu);
        System.out.println(kenarUzunlugu*kenarUzunlugu);
        scan.close();
	}

}
