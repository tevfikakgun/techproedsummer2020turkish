package day33interface;

public abstract class Araba {

	/*
	 * interfce hakkýnda
	 * bir child classýnýn bir den fazla parent classý olamaz
	 * ama interface kullanarak birden fazla parent olabilir
	 * interfce in içindeki her þey abstract olduðu için child bunlarý almak zorundadýr
	 */
	public abstract void move();
	
	public void diesel() {
		System.out.println("Diesel 2.0 Turbo");
	}
	
	public void benzin () {
		System.out.println("Benzin 3.5 Turbo");
	}
}
