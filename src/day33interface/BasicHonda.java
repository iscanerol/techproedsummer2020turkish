package day33interface;

public class  BasicHonda extends Araba implements IcAraba ,DisAraba{

	public static void main(String[] args) {

		BasicHonda basicHonda = new BasicHonda();
		basicHonda.direksiyon();
		basicHonda.kapi();
		basicHonda.klima();
		basicHonda.koltuk();
		basicHonda.move();
		
	}
	public void move() {
		System.out.println("3 saniyede 100km'lik hiza ulasir");
	}
	public void kapi() {
		System.out.println("Normal bildigi  kapi");	
	}
	public void direksiyon() {
		System.out.println("Suni deri direksiyon");
	}
	public void koltuk() {
		System.out.println("isitmasiz deri koltuk");	
	}
	public void klima() {
		System.out.println("Manuel kilma");	
	}


}
