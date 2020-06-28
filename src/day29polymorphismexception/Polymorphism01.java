package day29polymorphismexception;

public class Polymorphism01 {

	public static void main(String[] args) {
		// Polymorohism �oklu yap� demektir.
		// Bir methodun birden fazla fonksiyon yapmas�
		// Overloading ve Overriding ile bir metod polymorphism haline getirilir.
		
		// Polymorohism'i  Overloading yaparsan�z buna "Compile Time Polymorohism" denir. 
		// ��nk� Overloading compile time hata verir. Ayr�ca buna static polymorphism denir.
		
		// Polymorohism'i  Overriding yaparsan�z buna "Run Time Polymorohism" denir. ya da 
		// dinamic polymorphism denir.
		
		
		

	}
	public void eat() {
		System.out.println("Ye!");
	}
	// Overloading ile polymorphism yapt�k
	public void eat(String name) { // paremetreyi de�i�tirerek
		System.out.println(name+"Ye!");
	}
}
class Yeni extends Polymorphism01 { // ba�ka bir class a�mak zorunda kald�k.
	// Overriding ile polymorphism yapt�k
		public void eat() { // bady de�i�tirerek yapt�k
			System.out.println("L�tfen Ye!");
		}
}
