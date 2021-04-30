package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		System.out.println(toplama(3,5));
		System.out.println(carpma(13,5));
	}
	
	//Bir methodu main methodun icinden cagirmak icin mutlaka static kelimesini kullanmalisiniz.
	//method parantezinin icinde olusturulan variable lara "parametre"denir
	//Methodu cagirirken method parantezinin icine yazilan yerlere "Argument "denir
	//Parametrenin data type iile Argumentin data type i 1'e 1 eslesmeli
	public static int toplama(int num1,int num2) {
		return num1 + num2;
	}
	
	public static int carpma(int num1, int num2){
		return num1*num2;

	}

}
