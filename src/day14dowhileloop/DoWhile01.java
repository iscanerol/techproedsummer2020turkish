package day14dowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {

		int num = 1;
		do {

			System.out.println(num);
			num++;

		} while (num < 4);
		
		//10 ile 20 arasindaki tek tam sayilari ekrana do-while loop ile yazdirin
		
		int i = 11;
		do {
			System.out.print(i+" ");
			i+=2;
		}while(i<20);
	}

}
