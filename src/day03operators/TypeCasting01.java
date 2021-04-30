package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {

		byte by = 101;
		int sayi = by;  //kucuk data tipini buyuk data tipine cevirmk icin ekstra
		                //kod yazmaya gerek yok java bunu otomatik yapar.(auto widening)
		                //
		System.out.println(sayi);

		int sayi2 = 53;
		byte by2 = (byte)sayi2;//buyuk data tipini kucuge cevirmek java tarafindan
		                      //yapilmaz.ornekteki gibi sag tarafina donusturmek
		                      //istedigimiz data tipini parantez icinde yazmaliyiz
		System.out.println(by2);
		
		double sayi3 = 23.5;
		int by3 = (int)sayi3;
		System.out.println(sayi3);
		
		float sayi4 = -23.9f;
		short by4 = (short)sayi4;
		System.out.println(by4);
		
		double sayi5= 4.8;
		double sayi6 = 1.4;
		double sonuc = sayi5/sayi6;
		System.out.println(sonuc);
		
		int  sonuc2 =(int)(sayi5/sayi6);
		System.out.println(sonuc2);
		
		int sayi7 = 5;
		int sayi8 = 3 ;
		int sonuc3 = sayi7/sayi8;
		System.out.println(sonuc3);
		
		int sayi9 = 255;
		byte by5 = (byte) sayi9;
		System.out.println(by5);//sonuc -1 cikti.halbuki 255 cikmasi gerekiyordu
		//normalde byte da 256 sayi var .255 yazinca -1 yaziyyor cunku 255 i 256 
		//ya bolunce kalani yaziyor
		
		
		
		
		
		
	}

}
