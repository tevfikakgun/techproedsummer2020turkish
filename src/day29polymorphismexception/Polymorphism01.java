package day29polymorphismexception;

public class Polymorphism01 {

	public static void main(String[] args) {
		// Polymorohism çoklu yapý demektir.
		// Bir methodun birden fazla fonksiyon yapmasý
		// Overloading ve Overriding ile bir metod polymorphism haline getirilir.
		
		// Polymorohism'i  Overloading yaparsanýz buna "Compile Time Polymorohism" denir. 
		// çünkü Overloading compile time hata verir. Ayrýca buna static polymorphism denir.
		
		// Polymorohism'i  Overriding yaparsanýz buna "Run Time Polymorohism" denir. ya da 
		// dinamic polymorphism denir.
		
		
		

	}
	public void eat() {
		System.out.println("Ye!");
	}
	// Overloading ile polymorphism yaptýk
	public void eat(String name) { // paremetreyi deðiþtirerek
		System.out.println(name+"Ye!");
	}
}
class Yeni extends Polymorphism01 { // baþka bir class açmak zorunda kaldýk.
	// Overriding ile polymorphism yaptýk
		public void eat() { // bady deðiþtirerek yaptýk
			System.out.println("Lütfen Ye!");
		}
}
