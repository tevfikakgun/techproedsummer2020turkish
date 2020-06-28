package day27constructorcagýrma;

public class Dog extends Mammal {

	public boolean sadýk = true;
	
	public static void main(String[] args) {

		Dog dog = new Dog(); // Dog() parametresiz constructorlara gitmesini istiyoruz
//                  parametresiz constructor
	}
	
	public void bark () {
		System.out.println("Kopekler havlar");
	}
	
	Dog(){
		super ();		// kullanmasakta olur
						// this() ayný class içindeki parametresiz constructor i çaðýrmak için kullanýlýr
		System.out.println("Dog paramtresiz constructor");
	}
	/*
	 * Animal ve Mammal da constructor oluþturmuþtuk 
	 * odada 
	 * System.out.println("Mammal parametresiz constructor");
	 * System.out.println("Animal parametresiz constructor");
	 * hazýrlamýþtýk
	 * Dog(default constructor var) ---> Mammal(constructor oluþturduk) ---> Animal (constructor oluþturduk)
	 * Ýnheritance varsa ilk önce en üst katmandaki (grand parents) constructor kullanýlýr
	 * daha sonra bir alt kademedeki (parents) constructor kullanýlýr
	 * en sonda dog class ýndaki default constructor gelir.
	 * default ta bir þey olmadýðý için bir þey yazmaz
	 * 
	 * object 3 class'a uygun bir þekilde üretilmiþ oldu.
	 */
	
	
	
}
