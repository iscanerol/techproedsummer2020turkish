package day06ifstatement;

public class IfStatement02 {

	public static void main(String[] args) {
		
		//bir integer variable olusturun deger atayin
		//deger cift ise ekran cift tek ise tek yazdirin
		
		int num = -5;
		
		if (num%2==0) {
			
			System.out.println("cift");
			
		}

		if(num%2!=0) {
			System.out.println("tektir");
			
		}
	}

}
