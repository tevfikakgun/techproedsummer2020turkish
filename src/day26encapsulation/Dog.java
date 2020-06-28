package day26encapsulation;

public class Dog extends Mammal {
    boolean sadýk = true;
	public static void main(String[] args) {
		Dog dog = new Dog ();
		System.out.println("Animal class'dan geldi "+ dog.age); // 0
		System.out.println("Animal class'dan geldi "+ dog.name); // null
		dog.eat(); // bu metod syso kullanmaya gerek yok zaten "Yemek yer" yazdýrýyordu
		dog.move();// Hareket edebiliyor
		
		System.out.println("Mammal classdan geldi "+dog.dogum); // true
		dog.feed(); // Çocuklarýný besler
		
		System.out.println("dog classdan geldi "+dog.sadýk); // bu class dan geldi
		dog.bark();
		

	}
	public void bark() {
		System.out.println("Köpekler havlar");
	}
}
     	// dog class ýnýn içinde bir variable bir metod varken 
		// çocuk baba iliþkisiyle diðer classdan gelen verileri kullanabildik