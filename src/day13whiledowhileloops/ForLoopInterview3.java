package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview3 {

	public static void main(String[] args) {
//kullanicidan bir sayi alin.bu sayinin tersini ekrana yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi girinizi");

		String num = scan.nextLine();

		String ters = "";

		for (int i = num.length() - 1; i >= 0; i--) {
			ters = ters + num.charAt(i) + "";// char'i String'e cevirmek icin sonuna + "" ekleyebilirsiniz
		}

		System.out.println(ters);

		int tersInt = Integer.valueOf(ters);
		tersInt = tersInt + 2;

		System.out.println(tersInt);
		scan.close();
	}

}
