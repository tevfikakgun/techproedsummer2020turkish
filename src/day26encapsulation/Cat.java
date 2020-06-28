package day26encapsulation;

public class Cat extends Mammal {
	public boolean clean= true;
	
	public static void main(String[] args) {
		Cat cat = new Cat ();
		System.out.println("Animal class'dan geldi "+cat.age); // 0
		System.out.println("Animal class'dan geldi "+cat.name); // null
		cat.eat(); // Yemek yer
		cat.move();// Hareket edebiliyor
		
		System.out.println("Mammal class'dan geldi "+cat.dogum); // true
		cat.feed(); // Çocuklarýný besler
		
		System.out.println("Cat class'dan geldi "+cat.clean); // true
		cat.meow();// Kediler miyavlar
		
		
}
	
	 public void meow() {
	    	System.out.println("Kediler miyavlar");
	    }
	 
}