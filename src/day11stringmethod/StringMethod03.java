package day11stringmethod;

public class StringMethod03 {

	public static void main(String[] args) {
           
//concat() method concatenation yapmanin yani iki stringi birlestirmenin diger yontemidir
String str1 = "Ali";
String str2 = "veli";
System.out.println(str1 + str2);//Aliveli
System.out.println(str1.concat(str2));//Aliveli goruldugu gibi ikiside aynidir
System.out.println(str1.concat(str2).concat(str1).concat(str2));//concati istedigimiz kadar kullanabliriz
		
//replace() methodu bir characterin butun gorunumlerinin yerine baska charater yazmaya yarar
//ornek  ata===>ana
String str3 = "ata";
System.out.println(str3.replace("t", "n"));//ana "t" gordugun yere "n" koy
System.out.println(str3.replace("a", "u"));	//utu	
System.out.println(str3.replace("x", "y"));	//ata  "x" olmadigi icin herhangi bir degisim yapmaz	
System.out.println(str3.replace("", "/"));//   /a/t/a	
System.out.println(str3.replace("t", ""));// aa  olur yani "t" yi siler.bu yontemi bir characteri stringten
                                          //silmek icin kullaniriz
System.out.println(str3.replace("at", "mustaf"));//mustafa
		
     //replaceFirst() methodu degistirmek istedigimiz characterin sadece ilk gorunumunu degitrir
String str4 = "karakartal";
System.out.println(str4.replaceFirst("k", "K"));//Karakartal
System.out.println(str4.replaceFirst("a", "e"));//kerakartal  benzer ilk harfi siler "e" yi yazar	
System.out.println(str4.replaceFirst("ka", "A"));//Arakartal
System.out.println(str4.replaceFirst("kar", ""));//akartal
System.out.println(str4.replaceFirst("karakartal", "cimbombom"));//cimbombom

//Soru
String text = "Ali okula gitti. Ali otobuse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu.";
System.out.println(text.replace("Ali", "Veli"));

//replaceAll() ve replace() methodlari tamamiyla ayni seyi yapar.replace() methodunda isterseniz 
//tek harfli karakterler icin tek tirnak kullanabilirsiniz. Fakat replaceAll() da tek tirnak kullanilamaz.






	}

}
