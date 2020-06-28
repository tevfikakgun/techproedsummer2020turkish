package day27constructorcag�rma;

public class Dog extends Mammal {

	public boolean sad�k = true;
	
	public static void main(String[] args) {

		Dog dog = new Dog(); // Dog() parametresiz constructorlara gitmesini istiyoruz
//                  parametresiz constructor
	}
	
	public void bark () {
		System.out.println("Kopekler havlar");
	}
	
	Dog(){
		super ();		// kullanmasakta olur
						// this() ayn� class i�indeki parametresiz constructor i �a��rmak i�in kullan�l�r
		System.out.println("Dog paramtresiz constructor");
	}
	/*
	 * Animal ve Mammal da constructor olu�turmu�tuk 
	 * odada 
	 * System.out.println("Mammal parametresiz constructor");
	 * System.out.println("Animal parametresiz constructor");
	 * haz�rlam��t�k
	 * Dog(default constructor var) ---> Mammal(constructor olu�turduk) ---> Animal (constructor olu�turduk)
	 * �nheritance varsa ilk �nce en �st katmandaki (grand parents) constructor kullan�l�r
	 * daha sonra bir alt kademedeki (parents) constructor kullan�l�r
	 * en sonda dog class �ndaki default constructor gelir.
	 * default ta bir �ey olmad��� i�in bir �ey yazmaz
	 * 
	 * object 3 class'a uygun bir �ekilde �retilmi� oldu.
	 */
	
	
	
}
