package day33interface;

public interface IcAraba {

	int price =2000;
	boolean old = true;
	 
	public abstract void direksiyon();
	void koltuk();
	abstract void klima();
	
	public default void doseme() {
		System.out.println("Interfacede default keyword ile doseme yaptim");
	}
	public static void isitma() {
		System.out.println("Interfacede static keyword ile isitma yaptim ");
	}
}
