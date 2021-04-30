package day26encapsulation;

public class Dog extends Mammal {

	public boolean sadik = true;
	
	public static void main(String[] args) {

		Dog dog = new Dog();
		System.out.println(dog.age);//dog classindayiz,animal classindan age variable
		                            //kullandik
		dog.eat();//void oldugu icin drekt yazdirir == > "Yemek yer" yazdirir
		dog.move();//void oldugu icin drekt yazdirir == > "Hareket edebilir" yazdirir
		System.out.println("mammal classindan geldi:" + dog.dogum);
		dog.feed();//cocuklari besler yazdirir
		
		
	}
	public void bark() {
		System.out.println("kopek havlar");
	}

}
