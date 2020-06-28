package day16overloading;

public class Constructor03 {
	String isim = "Ali Can";
	int yas = 33;
	int kilo = 85;
	String meslek = "Automation Tester";
	boolean emekli = false ;
	
			// Constructer oluþturuyoruz.
	Constructor03(){  // 01. ve 02. sayfalarda Javanýn default constructor kullanmýþtýk
		this.isim=isim;
//this bu classýn içindeki demek	
		this.yas=yas;
		this.kilo=kilo;
		this.meslek=meslek;
		this.emekli=emekli;	
	}
	
	Constructor03(String isim, int yas, boolean emekli) {
		this.isim=isim; // deðiþtireceklerimiz parametreleri yazmak zorundayýz
		this.yas=yas;  // burada isim, yas ve emekliliði deðiþtireceðimizden dolayý bu 3'ü olmalý
		this.emekli=emekli;
	}
	
	
	Constructor03(String isim, String meslek) {
		this.isim=isim; // burada isim ve meslek olmalý 
	    this.meslek=meslek;
	                          // diðer parametreler ayný
	}
	public static void main(String[] args) {
		
		Constructor03 insan01 = new Constructor03(); // Object oluþturduk
		System.out.println(insan01.isim); // Ali Can
		System.out.println(insan01.emekli); // false
		System.out.println(insan01.yas);    // 33
		System.out.println(insan01.meslek); // Automation Tester
		
		
		Constructor03 insan02 = new Constructor03("Ayhan Yýldýz", 56, true); // ismi Ayhan Yýldýz ve yaþý 56
		                                                                     // yeni Object oluþturduk
		System.out.println(insan02.isim);   // Ayhan Yýldýz
		System.out.println(insan02.yas);    // 56
		System.out.println(insan02.emekli); // true
		
		Constructor03 insan03 = new Constructor03("Ayþe Yýldýz", "DEV");
		System.out.println(insan03.isim);   // Ayþe Yýldýz
		System.out.println(insan03.meslek); // DEV
		
		
		
	}

}
