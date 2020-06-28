package day28overriding;

public class Mammal extends Animal {
	public boolean birth = true;
	public String name = "Kedi";
	
	public static void main(String[] args) {
		Mammal mammal = new Mammal ();  // obj ile i�i parent daki i�i bo� olan constructor gidecek
										// ama Animal da default cons oldu�u ve bir sey yazmam�z� istemedi�i  i�in 
										// bir �ey yazmad�
										// buradaki public Mammal() gidecek true yazacak

	}
	public void feed () {
		System.out.println("Yavrular�n� besler");
	}
	public Mammal() {
		System.out.println(this.birth);   // true
		this.feed(); // Yavrular�n� besler
		System.out.println(this.age);// 4   Animal dakileride g�r�yor. this ile asl�nda sadece bu class g�recekti
									 // ama extends olunca parentdan kullanabiliyor
		
		this.move(); //Hayvanlar hareket eder        Animaldan geldi
		// child ve parentlarda ayn� isimli variable kullan�l�rsa this kulland���m�zda art�k parentlardaki g�remez 
		// sadece i�inde bulundu�u class� g�r�r. Bu y�zden parentlardan bir�ey al�ncaksa this kullan�lmaz.
		// PARENTTAN B�R �EY �STERKEN SUPER
		// CH�LD DEN B�R �EY �STERKEN TH�S
		// U N U T M A
		
		//this.name; burada art�k parentdakileri g�remez
		
		
		// Parantessiz super parent/grandparentlardaki variable ve metodlara ula�man�z� sa�lar.
		// baba ve dedelere ula��rs�z
		System.out.println(super.age); // 4
		System.out.println(super.name); // Karabas
		super.move(); // Hayvanlar hareket eder   
		
		// Parentlardakilere super ile ula�mak daha g�venlidir.
		
		
	}
}