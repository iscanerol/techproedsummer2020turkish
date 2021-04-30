package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview {

	public static void main(String[] args) {
//kullanicidan bir string alin ve bu stringi ekrana tersten yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir cumle veya kelime girinizi");
		
		String str = scan.nextLine();
		for(int i = str.length()-1;i>=0 ; i--) {
			System.out.print(str.charAt(i));
		}
		
		scan.close();
		
		
	}

}
