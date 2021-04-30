package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
//while loop kullanarak ilk bes sayma sayisinin toplamini ekrana yazdiran programi yazini
		
		int sum = 0;
		int num  =1;
		while(num<6) {
			System.out.print(num);
			sum = sum + num;
			num++;
		
		}
	
		System.out.println(sum);
		
	}

}
