package day11stringmethod;

public class ForLoop03 {

	public static void main(String[] args) {
//ilk dort sayma sayisinin carpimini veren for loop olusturunuz
//1*2*3*4
		int product = 1;
		for(int i =1; i<5;i++) {
			product = product*i;
		}
		System.out.println(product);
	//ilk 6 cift sayma sayisinini carpimini veren for loop olustrunuz	
		int product1 = 1;
		for(int i =2; i<13; i+=2) {
			product1 = product1*i;
		}
			System.out.println(product1);
		
		//9! (faktoryel)hesaplayan for loop kullanarak yaziniz
			
			int product2 = 1;
			for(int i=9; i>0;i--) {
				product2  = product2*i;
			}
		System.out.println(product2);
	}

}
