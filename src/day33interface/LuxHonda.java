package day33interface;

public class LuxHonda extends Araba implements IcAraba, DisAraba {

	public static void main(String[] args) {
		LuxHonda luxHonda = new LuxHonda();
		luxHonda.benzin();
		luxHonda.direksiyon();
		luxHonda.kapi();
		luxHonda.klima();
		luxHonda.koltuk();
		luxHonda.move();
		System.out.println("Ýç Araba interface'inden price: "+IcAraba.price);
		System.out.println(old); // sadece icAraba da olduðu için problem olmadan alýrýz
		luxHonda.doseme();
	}

	@Override
	public void move() {
		System.out.println("3 saniyede 100 km'lik hýza ulaþýr");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Gerçek deri direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Isýtmalý deri koltuk");
		
	}

	@Override
	public void klima() {
		System.out.println("Digital klima");
		
	}

	@Override
	public void kapi() {
		System.out.println("Parmak izi ayarli kapi");
		
	}

}
