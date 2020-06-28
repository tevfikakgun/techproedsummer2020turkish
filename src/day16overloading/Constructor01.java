package day16overloading;

public class Constructor01 {
	
	int price = 30000;// fiyat
	int year = 2020;
	String make = "Honda"; // markas�
	String type = "Civic";
	
	// bir class olu�turuluyorsa ama� object �retmektir
	// Java class la beraber bir constructor olu�turur.
	//Biz onu herhangi bir kod yazmadan direk kullanbiliriz.
	// bu constructor'  " Default constructor" denir.
	// Default constructor parametre olmaz.
	// Default constructor class olu�unca Java taraf�ndan olu�turulur, 
	// Biz constructor olu�turursak Java Default constructor siler. 
	
	public static void main(String[] args) {
		// Constructor(anne) class'tan(kal�p) object(pasta) �retme yarayan �eydir.
		// Constructor method de�ildir
		// Constructor variable de�ildir
		// Constructor bir Java kodudur.
		     // OBJECT OLU�TURMA
		// Constructor  class'�n i�indeki main'nin i�inde olmal�d�r.
		// Constructor'�n ismi class'�n ismi ile ayn� olmal�d�r.
		// Constructor'lrda return type olmaz 
		
	//   data type     isim       (Non -Primitive dir istedi�imiz kadar �retebiliriz)	
		Constructor01 hondaAraba = new Constructor01(); //bir tane object �retildi
	      //bir sat�rda new varsa         buras� constructord�r.
		  //orada object �retiliyordur	
		
		// hondaAraba n�n �zelliklerini g�rebiliriz
		
		System.out.println("Price: "+ hondaAraba.price); // 20000    
		System.out.println("Year: "+hondaAraba.year); // 2020
		System.out.println("Make: "+hondaAraba.make); // Honda
		System.out.println("Type: "+hondaAraba.type); // Civic
	}

}
