package day17constructors;

public class Constructors04 {
	
	int num1 = 12;
	static int num2 = 22;

	public static void main(String[] args) {
		//num1++;//static methodlarin icinde sadece static elemanlar kullanilabilir.num1 static
		       //olmadigi icin kirmizi ciziyor 
		num2++;//num2 static oldugundan main method icinde kullanmamiz problem olmuyor
		//kural 1: static ise method ve variable lar� class ismiyle cag�rabiliriz
		//kural 2: static medholarda static olmayan variable kullan�lmaz.
		//kural 3: class daki bir variable staticse o variable da yap�lan degisim butun objelerde
		//gecerlidir.(gokdeki ay gibi)
		
	}

}
