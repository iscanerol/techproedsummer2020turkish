package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
//kullanicidan bir sayi aliniz sayi pozif ise ekrana pozitif yazdirin.
//negative ise ekrana negative yaziniz
Scanner scan = new Scanner(System.in);
System.out.println("bir sayi giriniz");

int num = scan.nextInt();
if(num>=0) {
	System.out.println("pozitiftir veya 0");
}else  {
	System.out.println("negative");
	scan.close();
}
                                          // Condition            //Iki nokta    Condition
//               Condition Soru Isareti     Dogru Ise              ust uste    Yanlis ise
String sonuc =    num>=0       ?         "Pozitif veya 0"             :       "Negatif";
System.out.println(sonuc);

	}

}
