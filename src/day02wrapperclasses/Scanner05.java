package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yari capi giriniz");
		
		
		double yaricap = scan.nextDouble();
		
		System.out.println(3.14159*yaricap*yaricap);
		scan.close();
	}

}
