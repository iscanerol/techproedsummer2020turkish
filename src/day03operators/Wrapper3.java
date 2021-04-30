package day03operators;

import java.util.Scanner;

public class Wrapper3 {

	public static void main(String[] args) {
	//kullanicidan ad ve soyadini alalimekrana yazdiralim
		//kullanicidan adresini alalim ekrana yazdiralim
		//kullanicidan yasini alalim ekrana yazdiralim
		//kullaniciya turkiyede yasiyorum dogru yanlis diye soralimalalimekrana yazdiralim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ad ve soyadinizi giriniz");
		String tamIsim = scan.nextLine();
		System.out.println(tamIsim);
		
		System.out.println("adresinizi diriniz");
		String adres = scan.nextLine();
		System.out.println(adres);
		
		System.out.println("yasinizi giriniz");
		int yas =scan.nextInt();
		System.out.println(yas);

		System.out.println("turkiyede yasiyorum true or false");
		scan.close();
	}

}
