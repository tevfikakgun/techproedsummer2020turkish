package day31abstraction;

public class Abstraction02 extends Abstractions01 {

	public static void main(String[] args) {
	//	Abstraction01 obj = new Abstractions01(); hata veriri ��nk� abstract class obje �retemez
	
		Abstraction02 obj = new Abstraction02 ();	// obje �retebildik ��nk� Abstractions02 class abstract de�il
		obj.abstractMethod();
		obj.concereteMethod();
	
	}

	@Override
	public void abstractMethod() {
		System.out.println("Abstract methodun ovirride edilmi� hali");
		
	}
}
