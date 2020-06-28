package day27constructorcagýrma;

public class Mammal extends Animal {
	
	public boolean dogum = true;
	
	public static void main(String[] args) {

	//Mammal mammal = new Mammal();
	Mammal mammal01 = new Mammal(15); 

	}
	public void feed () {
		System.out.println("Çocuklarýný besler");
	}
	
	Mammal() {   // constructor oluþturduk
		this(11);   	// Parent'daki parametresiz constructor ý çaðýrýr.
					// super() kullanýlmasada olur. karþýmýza çýkarsa þaþýrmayýn
					// super() kullanýlacaksa mutlaka ilk satýrda kullanmalýyýz
					// super() ve this() ayný anda olmaz çünkü ikisininde ilk satýrda olma zorunluluðu var
		System.out.println("Mammal parametresiz constructor");
	}
	
	public Mammal (int age) {
		super();
		System.out.println("Mammal parametreli constructor");
	}
	/* Mammal mammal01 = new Mammal(15); aktifken 
	 * önce Animal da parametreli constructor arar
	 * bulamayýnca public Mammal (int age) gelir
	 * orada ilk super e gider super() onu Animala parametresize gönderirir sonra 
	 * public Mammal (int age) tekrar gelir 
	 * System.out.println("Mammal parametreli constructor"); çýktýsýný alýr.
	 play e basýlýrsa 
	
	Animal parametresiz constructor
	Mammal parametreli constructor

     çýktýsý olur

	 */
}