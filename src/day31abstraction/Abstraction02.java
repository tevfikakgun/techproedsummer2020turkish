package day31abstraction;

public class Abstraction02 extends Abstractions01 {

	public static void main(String[] args) {
	//	Abstraction01 obj = new Abstractions01(); hata veriri çünkü abstract class obje üretemez
	
		Abstraction02 obj = new Abstraction02 ();	// obje üretebildik çünkü Abstractions02 class abstract deðil
		obj.abstractMethod();
		obj.concereteMethod();
	
	}

	@Override
	public void abstractMethod() {
		System.out.println("Abstract methodun ovirride edilmiþ hali");
		
	}
}
