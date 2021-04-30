package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
	//kullanicidan bir dikdortgenin en ve boyunu alin.en ve boy esit ise ekrana 
		//bu bir karedir yazdirin,farkli ise bu bir dikdortgendir yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen diktorgenin en ve boyunu giriniz");
		 
		int en = scan.nextInt();
		int boy = scan.nextInt();
		
		if(en == boy) {
			System.out.println("bu bir karedir");
		}

		if(en!=boy) {
			System.out.println("bu bir dikdoertgendir");
		}
	//Kisa Yol
    //else ==> diger ihtimallerin tamami
    //en ile boy ya esittir ya da degildir
    if(en==boy) {
        System.out.println("Bu bir karedir");
    }else {
        System.out.println("Bu bir dikdortgendir");
    }
    scan.close();
}

}
