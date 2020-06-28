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
		System.out.println("�� Araba interface'inden price: "+IcAraba.price);
		System.out.println(old); // sadece icAraba da oldu�u i�in problem olmadan al�r�z
		luxHonda.doseme();
	}

	@Override
	public void move() {
		System.out.println("3 saniyede 100 km'lik h�za ula��r");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Ger�ek deri direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Is�tmal� deri koltuk");
		
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
