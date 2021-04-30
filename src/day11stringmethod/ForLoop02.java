package day11stringmethod;

public class ForLoop02 {

	public static void main(String[] args) {
//100 den kucuk 3 un kati olan sayma sayilarini ekrana yan yana yazdiran for loop olusturun
		
		for(int i =3; i<100;i+=3) {
			System.out.print(" " +i);
		}System.out.println();
		
		//20 den buyuk ilk 5 sayma sayisinin toplamini veren for loop olusturun
		int sum3 = 0;
		for(int i =21; i<26;i++) {
			sum3=sum3+i;
		}
		System.out.println(sum3);
		
		
		//ilk 50 sayma sayisinin toplamini veren for loop olusturnuz
		
		int sum4 = 0;
		for(int i = 1; i<51; i++) {
			sum4 = sum4+i;
		}
		System.out.println(sum4);
		
		//5 ile bolunebilen 100 den kucuk sayilarin toplamini veren for loop olusturun
		
		int sum5 = 0;
		for(int i = 5; i<100 ;i+=5 ) {
			sum5=sum5+i;
		}
		System.out.println(sum5);
		
		
	}

}
