package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {

		//KULLANICIDAN YIL GIRMSini isteyin girilen yil artik yil ise ekrana artik yil yazdirin degilse
		//artik degil yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println( "bir yil giriniz");
		int year = scan.nextInt();
		if(year%100==0 && year%400==0) {
			System.out.println(year + " artik yildir");
		}else if(year %100!=0 && year%4==0) {
			System.out.println(year + " artik yildir");
		}else {
			System.out.println( year + " artik yil degildir");
		}scan.close();
	}

}
