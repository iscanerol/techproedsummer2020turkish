package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
	//kullanicidan password girmesini isteyi
		//password dogru ise password dogru yazdirin degilse password yanlis tekrar deneyin
		//dogru password Java2020
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen password giriniz");
		
		String password = scan.nextLine();
		if(password.equals("Java2020")) {//Stringlerin esitligini kkontrol ederken aslla == sembolu
			                       //kullanmayiniz.onun yerine equals() methodu kullaniniz
			System.out.println("password dogru");//"=="Stringin degerini ve adresini kontrol eder
		}else {                                 //"equals" ise sadece degerleri kontrol eder
			System.out.println("password yanlis");
		}
		scan.close();
	}

}
