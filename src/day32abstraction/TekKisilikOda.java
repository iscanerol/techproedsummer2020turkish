package day32abstraction;

public  class TekKisilikOda extends Otel{

	public static void main(String[] args) {
		TekKisilikOda musteri1 = new TekKisilikOda();
		musteri1.kahvalti();
		System.out.println("TV ucreti " + musteri1.tv(5));
		System.out.println("Wifi ucreti " + musteri1.wifi(1));
	}

	@Override
	public void kahvalti() {

		System.out.println("Kahvaltiniz sandivictir");
	}
    public int tv(int saat) {
    	return saat * 2;
    }
}
