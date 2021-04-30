package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
	//kullanicidan bir sayi alin.bu sayi pozitif ise9 dan buyukmu diye kontrol edin
    //9 dan buyukse ekrana "sayi" yazdirin.9 dan kucuk esit 0 dan buyuk esitse "rakam" yazdirin
 
		Scanner scan= new Scanner(System.in);
		System.out.println("bir tam sayi giriniz");
		int num = scan.nextInt();
		if(num>=0) {
			 if(num>9) {
				 System.out.println("sayi");
			 }else if(num<=9 && num>=0) {
				 System.out.println("rakam");
			 }
		}else if(num<0) {
			System.out.println("negatif sayi");
		}
		scan.close();
	}
  
}
