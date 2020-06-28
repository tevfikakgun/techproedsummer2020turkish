package day33interface;

public abstract class Araba {

	/*
	 * interfce hakk�nda
	 * bir child class�n�n bir den fazla parent class� olamaz
	 * ama interface kullanarak birden fazla parent olabilir
	 * interfce in i�indeki her �ey abstract oldu�u i�in child bunlar� almak zorundad�r
	 */
	public abstract void move();
	
	public void diesel() {
		System.out.println("Diesel 2.0 Turbo");
	}
	
	public void benzin () {
		System.out.println("Benzin 3.5 Turbo");
	}
}
