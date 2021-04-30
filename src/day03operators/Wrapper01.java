package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		//kullanicidan ad ve soyadini yazdiran bir program yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen adinizi ve soyadinizi giriniz");
		
		String isim = scan.nextLine();// stringleri kullaicidan alamak icin ya next
		                              //kullanacagiz yada nextLine kullanacagiz
		System.out.println(isim);  //next methodu spaceyi gorunce Stringi almayi birakir
		scan.close();
				

	}

}
