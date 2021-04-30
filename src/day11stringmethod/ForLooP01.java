package day11stringmethod;

public class ForLooP01 {

	public static void main(String[] args) {
//6,5,4,3,2,1,0,-1, EKRANA YAZDIRAN bir for loop olusturunuz
		
		for(int i = 6; i >-2; i--) {
			System.out.print(i);
		}System.out.println();
	//3,,4,5,6,7, sayilarini ekrana yazdirin	
		for (int u = 3; u<8; u++) {
			System.out.print(u);
			
		}System.out.println();
	//ilk 100 sayma sayisini ekrana yanyana yazdiran ve aralarinda bosluk koyan programi yaziniz
		
		for(int i = 1; i <101; i++) {
			System.out.print(" "+i);
			
		}System.out.println();
		
		//ilk 50 cift sayma sayisini ekrana yazdiran for loop olusturunuz
		//2,4,6....100
		for(int i= 2; i < 101; i = i + 2) {
			System.out.print(i +" ");
			
		}System.out.println();
		//ilk 50 tek sayma sayisini ekrana yazdiran for loop olusturunuz
		for(int i =1; i<100; i+=2) {
			System.out.print(i +" "); 
			
		}
		
		
	}

}
