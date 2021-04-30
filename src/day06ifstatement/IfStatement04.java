package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		// bir tane String variable olusturun ve bir gun ismini kucuk harlerle  deger atayin
		//eger atadiginiz deger hafta ici gunlerinden birinin ise ekrana hafta ici yazdirin
		//eger atadiginiz deger hafta sonu gunlerinden biri ise ekrana hafta sonu yazdirin

		String day = "cuma";
		if(day.equals("pazartesi") || day.equals("sali") || day.equals("carsamba") || day.equals("persembe") || day.equals("cuma")
				) {
			System.out.println("hafta ici");
			
					
				}
		if(day.equals("cumartesi") || day.equals("pazar")) {
			System.out.println("hafta sonu");
			
		}
	}

}
