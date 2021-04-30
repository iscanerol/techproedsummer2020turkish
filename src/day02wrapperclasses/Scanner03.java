package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		//kullanicidan alinan bir sayinin kupunu hesaplayan bir program yapiniz
       
		Scanner scan = new Scanner(System.in);
		
	System.out.println("lutfen bir sayi giriniz");
	 int kup= scan.nextInt();
	  System.out.println(kup*kup*kup);
	  scan.close();
	}

}
