package day32abstraction;

public class KralDairesi extends Otel {

	public static void main(String[] args) {
		KralDairesi musteri3 = new KralDairesi();
		musteri3.kahvalti();
		System.out.println("Ýnternational TV Ücreti: "+musteri3.tv("Internatioal", 12));
		System.out.println("Wifi Ücreti: "+musteri3.wifi(11));
		
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltýnýz terasta Kral Restaurant'dadýr");
		
	}
	public int tv(String internatioal, int saat) {
		if (internatioal.equals(internatioal)) {
			return saat*5;
		}else {
			return 0;
		}
			
	}
}
