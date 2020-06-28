package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// Array List = esnek array demektir.
		// Array oluþturulurken eleman sayýsýný önceden belirtmek zorundaydýk
		// ArrayList de ise eleman sayýsýnda esneklik vardýr. Siz eleman ekledikçe List geniþler
		// siz eleman azaltýrsanýz list kendini daraltýr.
		
		// Mülakatlarda farký sorarlar
		
		
//		Constructors01 obj1= new Constructors01(); 
//       bu isimle             bu isim aynýydý
		
		List<String> list01 = new ArrayList<>(); // hem List hem de ArrayList import edilir
//      bu isimle                 bu isim farklý
//      List                      ArrayList in altýndadýr.
		
//      ArrayList<String> list01 = new ArrayList<>(); --> de yazýlabilir.
//      ArrayList<String> list01 = new ArrayList<String>();  -->  de yazýlabilir.	
		
//		List<String> list01 = new List<>();  --> OLMAZ
//		ArrayList<String> list01 = new List<>(); -->  OLMAZ
		
		System.out.println(list01);
		
		// list e eleman eklemek için add() methodu kullanýlýr
		
		list01.add("Ali");
		System.out.println(list01);
		list01.add("Can");
		System.out.println(list01);
		
		// Veli yi Ali ile Can arasýna eklemek istersek
		
		list01.add(1, "Veli"); // indexi 1 olan yere Veli ekle demek
		System.out.println(list01);
		
		// [Han,Ali,Kemal,Veli,Can,Ayþe]
		// teker teker ekleyipekranda görmek lazým
		list01.add(0, "Han"); // Han ilk oldu
		System.out.println(list01);
		list01.add(2, "Kemal"); // Kemal Ali ile Can arasýna konacak index 2 olacak
		System.out.println(list01);
		list01.add("Ayþe");  // en sona Ayþe yazacak
		System.out.println(list01); // [Han, Ali, Kemal, Veli, Can, Ayþe]
		
		// list01 in eleman sayýsýný eleman sayýsý
		System.out.println("Eleman sayýsý: "+list01.size()); // eleman sayýsý için .size() kullanýlýr.
	
		

	}

}
