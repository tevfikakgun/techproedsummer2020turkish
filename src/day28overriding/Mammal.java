package day28overriding;

public class Mammal extends Animal {
	public boolean birth = true;
	public String name = "Kedi";
	
	public static void main(String[] args) {
		Mammal mammal = new Mammal ();  // obj ile içi parent daki içi boþ olan constructor gidecek
										// ama Animal da default cons olduðu ve bir sey yazmamýzý istemediði  için 
										// bir þey yazmadý
										// buradaki public Mammal() gidecek true yazacak

	}
	public void feed () {
		System.out.println("Yavrularýný besler");
	}
	public Mammal() {
		System.out.println(this.birth);   // true
		this.feed(); // Yavrularýný besler
		System.out.println(this.age);// 4   Animal dakileride görüyor. this ile aslýnda sadece bu class görecekti
									 // ama extends olunca parentdan kullanabiliyor
		
		this.move(); //Hayvanlar hareket eder        Animaldan geldi
		// child ve parentlarda ayný isimli variable kullanýlýrsa this kullandýðýmýzda artýk parentlardaki göremez 
		// sadece içinde bulunduðu classý görür. Bu yüzden parentlardan birþey alýncaksa this kullanýlmaz.
		// PARENTTAN BÝR ÞEY ÝSTERKEN SUPER
		// CHÝLD DEN BÝR ÞEY ÝSTERKEN THÝS
		// U N U T M A
		
		//this.name; burada artýk parentdakileri göremez
		
		
		// Parantessiz super parent/grandparentlardaki variable ve metodlara ulaþmanýzý saðlar.
		// baba ve dedelere ulaþýrsýz
		System.out.println(super.age); // 4
		System.out.println(super.name); // Karabas
		super.move(); // Hayvanlar hareket eder   
		
		// Parentlardakilere super ile ulaþmak daha güvenlidir.
		
		
	}
}