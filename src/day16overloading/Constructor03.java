package day16overloading;

public class Constructor03 {
	String isim = "Ali Can";
	int yas = 33;
	int kilo = 85;
	String meslek = "Automation Tester";
	boolean emekli = false ;
	
			// Constructer olu�turuyoruz.
	Constructor03(){  // 01. ve 02. sayfalarda Javan�n default constructor kullanm��t�k
		this.isim=isim;
//this bu class�n i�indeki demek	
		this.yas=yas;
		this.kilo=kilo;
		this.meslek=meslek;
		this.emekli=emekli;	
	}
	
	Constructor03(String isim, int yas, boolean emekli) {
		this.isim=isim; // de�i�tireceklerimiz parametreleri yazmak zorunday�z
		this.yas=yas;  // burada isim, yas ve emeklili�i de�i�tirece�imizden dolay� bu 3'� olmal�
		this.emekli=emekli;
	}
	
	
	Constructor03(String isim, String meslek) {
		this.isim=isim; // burada isim ve meslek olmal� 
	    this.meslek=meslek;
	                          // di�er parametreler ayn�
	}
	public static void main(String[] args) {
		
		Constructor03 insan01 = new Constructor03(); // Object olu�turduk
		System.out.println(insan01.isim); // Ali Can
		System.out.println(insan01.emekli); // false
		System.out.println(insan01.yas);    // 33
		System.out.println(insan01.meslek); // Automation Tester
		
		
		Constructor03 insan02 = new Constructor03("Ayhan Y�ld�z", 56, true); // ismi Ayhan Y�ld�z ve ya�� 56
		                                                                     // yeni Object olu�turduk
		System.out.println(insan02.isim);   // Ayhan Y�ld�z
		System.out.println(insan02.yas);    // 56
		System.out.println(insan02.emekli); // true
		
		Constructor03 insan03 = new Constructor03("Ay�e Y�ld�z", "DEV");
		System.out.println(insan03.isim);   // Ay�e Y�ld�z
		System.out.println(insan03.meslek); // DEV
		
		
		
	}

}
