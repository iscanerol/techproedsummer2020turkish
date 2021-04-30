package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {
	//int data bir variable olusturun bu variable degerini carpma ve bolme kullanarak 
    //artirin v azaltin
		int num1 = 12;
		//uzun yol ile carpma yaparak increment
		num1 = num1*3;
		System.out.println(num1);
		//kisa yol
		num1*=3;
		System.out.println(num1);
		
		//uzun yol ile bolme yapark decrement
		 
		num1= num1 / 9;
		System.out.println(num1);
		
		//kisa yol
		
		num1/=3;
		System.out.println(num1);
	}

}
