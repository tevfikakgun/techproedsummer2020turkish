package day17constructors;

public class Constructors02 {

	public static void main(String[] args) {
		// Constructor01 class'ýnda olan buyume metodu bu class'ta çalýþmaz. Java hata verir.
    //		buyume (33);  böyle olmaz
		
		// Baþka bir classs taki metodu kulnmak istiyorsanýz o class tan bir tane object oluþtururuz
		// o object sayesinde istediðimiz methodu kullanabiliriz.
		
		Constructors01 obj1 = new Constructors01();  // Constructors01 den object oluþturduk
		obj1.buyume(33);               // metod ve variable'lar object yapýþýr.
		                               // object oluþturarak metodlarý yeni class a taþýmýþ oluruz
		// altýnýn sarý olmasýnýn sebebi buyume metodu static olduðu object oluþturmadan çaðrýlabilir 
		// çalýþýrým ama doðrusunu yap demektir.
		Constructors01.buyume(45);     // buyume methodu static olduðundan class ismiyle çaðýrmak daha doðru
		obj1.isimDegistir("KemalCan"); 
		Constructors01.isimDegistir("Merhaba Naci");

		// binlerce classta yazmýþ olduðunuz bir methodu  object hazýrlayarak kullanabiliriz
		System.out.println(obj1.isim);// burada sadece Constructors01 deki variadle deðerini verir "Ali Can"
		System.out.println(obj1.yas); // burada sadece Constructors01 deki variadle deðerini verir "33"
		
		// Bir variable veya method static olarak oluþmuþsa o variable veya methods
		// object oluþturmadan sadece class isminin yanýna "." koyarak kullanabiliriz
		
		System.out.println(Constructors03.ad);
		System.out.println(Constructors03.kilo);
		
		// static olanlarda herþey class'a monte edilmiþtir. o yüzden object oluþturmadan 
		// class ismini kullanarak çaðýrabiliriz.
		
		// staticse --->Class git ----> oradan isteneni al.
		// static deðilse --> Class ýn içinde main method da  ---> object oluþtur---> diðer classta o objecte git
		
		// her variable oluþturunca memoryda yer kaplar. mümkün olduðunca az veriable oluþturmak lazým.
		// static variable'lar her obje tarafýndan görüleceði için avantaj saðlar.
		// hem yer kaplama da tasarruf hem de her object tarafýnda kullanýlmasý iyidir.
	}

}
