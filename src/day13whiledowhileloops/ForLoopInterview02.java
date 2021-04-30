package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview02 {

	public static void main(String[] args) {
		//kullanicidan bir string alin ve bu stringi ekrana tersten yazdirin
		//while loop kullanarak cozumu
		
				Scanner scan = new Scanner(System.in);
				System.out.println("bir cumle veya kelime girinizi");
				
				String str = scan.nextLine();
		        int length = str.length()-1;
				
				while(length>=0) {
					System.out.print(str.charAt(length));
					length--;
				}
scan.close();
	}

}
