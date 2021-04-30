package day28overriding;

public class Mammal extends Animal {
	
	public boolean birth = true;
	public String name = "kedi";

	public static void main(String[] args) {
		Mammal mammal = new Mammal();
	}
	public void feed() {
		System.out.println("yavrulari besler");
	}
	
	public Mammal() {
		//this, icinde bulundugu class daki variable ve methodlara ulasmamizi saglar
		System.out.println(this.birth);
		this.feed();
		//child- parent iliskisi varsa this kullanarak parent classdaki variable ve methodlara 
		//ulasmamizi saglar
		//Ama parent class daki variable ve methodlara ulasmak icin this kullanmayalim.cunku 
		//child ve parent daki ayni isimli variable ve methodlarda problem yasanabilir
		//Genel kullnaimda this class icindekiler icin super parent class lar icin kullanlir
		//farklilik yapip insanlari sasirtmayin
		System.out.println(this.age);
		System.out.println(this.name);
		this.move();//hayvanlar harekt eder
		System.out.println(this.name);
		//parantezsiz super paretlardaki variable ve methodlara ulasmamizi saglar
		System.out.println(super.age);
		System.out.println(super.name);
		super.move();
		
	}
	
	
	
	
	
	
	
	

}
