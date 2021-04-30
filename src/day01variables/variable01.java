package day01variables;

public class variable01 {

	public static void main(String[] args) {

		int maas = 3000;
		char harf = 's';    //char'lara deger atamasi yaparken mutlaka tek tirnak kullan
        
		System.out.println(maas);
		System.out.println(harf);
		
		boolean isOld = true; // booleanlar icin sadece true veya false degerleriniz kullanabilirsinzi
		System.out.println(isOld);
		boolean isNew = false;
		System.out.println(isNew);
		
		byte derinlik = -123;
		System.out.println(derinlik);
		
		short pasinlerNufus = 30000;
		System.out.println(pasinlerNufus);
		
		long hucreSayisi = 465441221212121l;// integer sinirini asan long variablelerde en sona
		                                     //l harfi koymaliyiz;
		System.out.println(hucreSayisi);
		
		double piSayisi = 3.142145151354545435;// java butun ondalik kesirleri otomatik
		                                         //olarak double kabul eder
		System.out.println(piSayisi);
		
		float para = 5.25f;
		System.out.println(para);// eger bir ondalik kesri float yapmak isterseniz sonuna
		                         //kucuk f veya buyuk f koyunuz,cunku ne demistik otomatik
		                        //olarak duble kabul ediyor java
	     
		String ogrenciIsmi = "ali can";
		System.out.println(ogrenciIsmi);
	
	}

}
