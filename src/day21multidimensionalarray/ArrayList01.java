package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// Array List = esnek array demektir.
		// Array olu�turulurken eleman say�s�n� �nceden belirtmek zorundayd�k
		// ArrayList de ise eleman say�s�nda esneklik vard�r. Siz eleman ekledik�e List geni�ler
		// siz eleman azalt�rsan�z list kendini daralt�r.
		
		// M�lakatlarda fark� sorarlar
		
		
//		Constructors01 obj1= new Constructors01(); 
//       bu isimle             bu isim ayn�yd�
		
		List<String> list01 = new ArrayList<>(); // hem List hem de ArrayList import edilir
//      bu isimle                 bu isim farkl�
//      List                      ArrayList in alt�ndad�r.
		
//      ArrayList<String> list01 = new ArrayList<>(); --> de yaz�labilir.
//      ArrayList<String> list01 = new ArrayList<String>();  -->  de yaz�labilir.	
		
//		List<String> list01 = new List<>();  --> OLMAZ
//		ArrayList<String> list01 = new List<>(); -->  OLMAZ
		
		System.out.println(list01);
		
		// list e eleman eklemek i�in add() methodu kullan�l�r
		
		list01.add("Ali");
		System.out.println(list01);
		list01.add("Can");
		System.out.println(list01);
		
		// Veli yi Ali ile Can aras�na eklemek istersek
		
		list01.add(1, "Veli"); // indexi 1 olan yere Veli ekle demek
		System.out.println(list01);
		
		// [Han,Ali,Kemal,Veli,Can,Ay�e]
		// teker teker ekleyipekranda g�rmek laz�m
		list01.add(0, "Han"); // Han ilk oldu
		System.out.println(list01);
		list01.add(2, "Kemal"); // Kemal Ali ile Can aras�na konacak index 2 olacak
		System.out.println(list01);
		list01.add("Ay�e");  // en sona Ay�e yazacak
		System.out.println(list01); // [Han, Ali, Kemal, Veli, Can, Ay�e]
		
		// list01 in eleman say�s�n� eleman say�s�
		System.out.println("Eleman say�s�: "+list01.size()); // eleman say�s� i�in .size() kullan�l�r.
	
		

	}

}
