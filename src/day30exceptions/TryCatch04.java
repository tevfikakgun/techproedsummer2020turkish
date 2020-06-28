package day30exceptions;

public class TryCatch04 {

	public static void main(String[] args) {
		try {
			hop ();
				
		}catch (Exception e) {
			System.out.println(e); // java.lang.RuntimeException: cannot hop olarak çýktý verir.
			System.out.println(e.getMessage()); // cannot hop yazar "e.getMessage()"  sadece mesajý yazar
		}
	}
		private static void hop () {
			throw new RuntimeException("cannot hop");
		}
}
