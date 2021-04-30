package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// Kullanicidan alacagi urun miktarini ve birim fiyatini alalim
		// Eger kullanici 1000 den fazla urun alirsa %20 indirim yapin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Eger kullanici 1000 den az veya 1000 urun alirsa indirim yapmayin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("kac tane urun alacaginizi yaziniz");
		double miktar = scan.nextDouble();
		System.out.println("alacaginiz urunun birim fiyatini giriniz");
		double birimFiyat  = scan.nextDouble();
		if(miktar>1000) {
			System.out.println(miktar*(birimFiyat*80)/100);
		}else {
			System.out.println(miktar*birimFiyat);
		}
		scan.close();
	}

}
