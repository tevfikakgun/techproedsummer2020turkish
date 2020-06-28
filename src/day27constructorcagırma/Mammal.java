package day27constructorcag�rma;

public class Mammal extends Animal {
	
	public boolean dogum = true;
	
	public static void main(String[] args) {

	//Mammal mammal = new Mammal();
	Mammal mammal01 = new Mammal(15); 

	}
	public void feed () {
		System.out.println("�ocuklar�n� besler");
	}
	
	Mammal() {   // constructor olu�turduk
		this(11);   	// Parent'daki parametresiz constructor � �a��r�r.
					// super() kullan�lmasada olur. kar��m�za ��karsa �a��rmay�n
					// super() kullan�lacaksa mutlaka ilk sat�rda kullanmal�y�z
					// super() ve this() ayn� anda olmaz ��nk� ikisininde ilk sat�rda olma zorunlulu�u var
		System.out.println("Mammal parametresiz constructor");
	}
	
	public Mammal (int age) {
		super();
		System.out.println("Mammal parametreli constructor");
	}
	/* Mammal mammal01 = new Mammal(15); aktifken 
	 * �nce Animal da parametreli constructor arar
	 * bulamay�nca public Mammal (int age) gelir
	 * orada ilk super e gider super() onu Animala parametresize g�nderirir sonra 
	 * public Mammal (int age) tekrar gelir 
	 * System.out.println("Mammal parametreli constructor"); ��kt�s�n� al�r.
	 play e bas�l�rsa 
	
	Animal parametresiz constructor
	Mammal parametreli constructor

     ��kt�s� olur

	 */
}