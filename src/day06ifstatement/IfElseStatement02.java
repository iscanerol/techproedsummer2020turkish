package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		//kullanicidan bir tam sayi isteyin ve o tam sayinin mutlak degerini ekrana yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		 int s =scan.nextInt();
		  if (s>0) {
			  System.out.println(s*(+1));
		  }else
		  {
			  System.out.println(s*(-1));
		  }
		  scan.close();
	}

}
