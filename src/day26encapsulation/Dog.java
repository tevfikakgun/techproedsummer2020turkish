package day26encapsulation;

public class Dog extends Mammal {
    boolean sad�k = true;
	public static void main(String[] args) {
		Dog dog = new Dog ();
		System.out.println("Animal class'dan geldi "+ dog.age); // 0
		System.out.println("Animal class'dan geldi "+ dog.name); // null
		dog.eat(); // bu metod syso kullanmaya gerek yok zaten "Yemek yer" yazd�r�yordu
		dog.move();// Hareket edebiliyor
		
		System.out.println("Mammal classdan geldi "+dog.dogum); // true
		dog.feed(); // �ocuklar�n� besler
		
		System.out.println("dog classdan geldi "+dog.sad�k); // bu class dan geldi
		dog.bark();
		

	}
	public void bark() {
		System.out.println("K�pekler havlar");
	}
}
     	// dog class �n�n i�inde bir variable bir metod varken 
		// �ocuk baba ili�kisiyle di�er classdan gelen verileri kullanabildik