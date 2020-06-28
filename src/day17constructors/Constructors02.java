package day17constructors;

public class Constructors02 {

	public static void main(String[] args) {
		// Constructor01 class'�nda olan buyume metodu bu class'ta �al��maz. Java hata verir.
    //		buyume (33);  b�yle olmaz
		
		// Ba�ka bir classs taki metodu kulnmak istiyorsan�z o class tan bir tane object olu�tururuz
		// o object sayesinde istedi�imiz methodu kullanabiliriz.
		
		Constructors01 obj1 = new Constructors01();  // Constructors01 den object olu�turduk
		obj1.buyume(33);               // metod ve variable'lar object yap���r.
		                               // object olu�turarak metodlar� yeni class a ta��m�� oluruz
		// alt�n�n sar� olmas�n�n sebebi buyume metodu static oldu�u object olu�turmadan �a�r�labilir 
		// �al���r�m ama do�rusunu yap demektir.
		Constructors01.buyume(45);     // buyume methodu static oldu�undan class ismiyle �a��rmak daha do�ru
		obj1.isimDegistir("KemalCan"); 
		Constructors01.isimDegistir("Merhaba Naci");

		// binlerce classta yazm�� oldu�unuz bir methodu  object haz�rlayarak kullanabiliriz
		System.out.println(obj1.isim);// burada sadece Constructors01 deki variadle de�erini verir "Ali Can"
		System.out.println(obj1.yas); // burada sadece Constructors01 deki variadle de�erini verir "33"
		
		// Bir variable veya method static olarak olu�mu�sa o variable veya methods
		// object olu�turmadan sadece class isminin yan�na "." koyarak kullanabiliriz
		
		System.out.println(Constructors03.ad);
		System.out.println(Constructors03.kilo);
		
		// static olanlarda her�ey class'a monte edilmi�tir. o y�zden object olu�turmadan 
		// class ismini kullanarak �a��rabiliriz.
		
		// staticse --->Class git ----> oradan isteneni al.
		// static de�ilse --> Class �n i�inde main method da  ---> object olu�tur---> di�er classta o objecte git
		
		// her variable olu�turunca memoryda yer kaplar. m�mk�n oldu�unca az veriable olu�turmak laz�m.
		// static variable'lar her obje taraf�ndan g�r�lece�i i�in avantaj sa�lar.
		// hem yer kaplama da tasarruf hem de her object taraf�nda kullan�lmas� iyidir.
	}

}
