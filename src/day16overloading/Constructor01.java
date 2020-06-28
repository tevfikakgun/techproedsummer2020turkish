package day16overloading;

public class Constructor01 {
	
	int price = 30000;// fiyat
	int year = 2020;
	String make = "Honda"; // markasý
	String type = "Civic";
	
	// bir class oluþturuluyorsa amaç object üretmektir
	// Java class la beraber bir constructor oluþturur.
	//Biz onu herhangi bir kod yazmadan direk kullanbiliriz.
	// bu constructor'  " Default constructor" denir.
	// Default constructor parametre olmaz.
	// Default constructor class oluþunca Java tarafýndan oluþturulur, 
	// Biz constructor oluþturursak Java Default constructor siler. 
	
	public static void main(String[] args) {
		// Constructor(anne) class'tan(kalýp) object(pasta) üretme yarayan þeydir.
		// Constructor method deðildir
		// Constructor variable deðildir
		// Constructor bir Java kodudur.
		     // OBJECT OLUÞTURMA
		// Constructor  class'ýn içindeki main'nin içinde olmalýdýr.
		// Constructor'ýn ismi class'ýn ismi ile ayný olmalýdýr.
		// Constructor'lrda return type olmaz 
		
	//   data type     isim       (Non -Primitive dir istediðimiz kadar üretebiliriz)	
		Constructor01 hondaAraba = new Constructor01(); //bir tane object üretildi
	      //bir satýrda new varsa         burasý constructordýr.
		  //orada object üretiliyordur	
		
		// hondaAraba nýn özelliklerini görebiliriz
		
		System.out.println("Price: "+ hondaAraba.price); // 20000    
		System.out.println("Year: "+hondaAraba.year); // 2020
		System.out.println("Make: "+hondaAraba.make); // Honda
		System.out.println("Type: "+hondaAraba.type); // Civic
	}

}
