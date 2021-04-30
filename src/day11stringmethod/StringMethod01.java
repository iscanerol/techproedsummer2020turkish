package day11stringmethod;

public class StringMethod01 {

	public static void main(String[] args) {
//startsWith() methodu bir Stringin istenen harflae baslayip baslamadigini kontrol eder
//istenen harfle basliyorsa true return eder baslamiyorsa false return eder
		//starstWith() 1 . versiyon
		String  str1 = "Ali Can";
	System.out.println(str1.startsWith("A"));	//true
	System.out.println(str1.startsWith("B"));//false
	System.out.println(str1.startsWith("Ali"));//true
	
	   //startsWith 2.2versiyon
	System.out.println(str1.startsWith("a", 3));//false
	System.out.println(str1.startsWith("a", 5));//true
	System.out.println(str1.startsWith("Can",4));//true
	
	//endsWith() bir Stringin istenen harfle bitip bitmedigini kontrol eder
	//istenen harfle bitiyorsa true bitmiyorsa false return eder
	String str2 = "Ayse Can";
	System.out.println(str2.endsWith("n"));//true
	System.out.println(str2.endsWith("Can"));//true
	System.out.println(str2.endsWith("CAN"));//BUYUK kucuk harfe duyarlidi java.bu yuzden false
	
	String str3 = "Ali  ";
	System.out.println(str3.endsWith(" "));//true
	System.out.println(str2.endsWith(""));//true
	
	}

}
