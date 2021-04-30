package day30excaption;

public class TryCatchSoru2 {

	public static void main(String[] args) {

		try {
			hop();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}
