package day07nestedif;

import java.util.Scanner;

public class OdevKutsalGunSorusu {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("gun giriniz");
		String gun = scan.next();
		if(gun.equalsIgnoreCase("cuma")) {
			System.out.println("muslumanlar icin kutsal gun");
		}else if(gun.equalsIgnoreCase("cumartesi")) {
			System.out.println("yahudiler icin kutsal gun");
		}else if(gun.equalsIgnoreCase("pazar")) {
			System.out.println("hristiyanlar icin kutsal gun");
		}else {//gun.equalsIgnoreCase("cuma")bu method buyuk kucuk harflerin dikkate alinmamasini saglar
			System.out.println("kutsal gun degildir");
			scan.close();
		}
				}

}
