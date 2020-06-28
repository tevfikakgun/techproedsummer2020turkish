package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		list.add("Ayþe");
		list.add("Ali");
		System.out.println(list);
		list.remove("Ali"); // ilk Ali yi sildi  list.remove(object) seçtik
		System.out.println(list);
		list.remove("Ali");
		System.out.println(list); // Ali gitti  çýktý [Can, Ayþe]
		list.remove("Kemal");  // çýktý [Can, Ayþe]
		System.out.println(list); // remove methodu listede olmayan elemanlar için hata vermez.
		  // ama index kullanýrsak hata verir
		System.out.println(list.remove("Can")); //  Can  siler ve True   yazar
		System.out.println(list.remove("Kemal")); //  silecek Kemal olmadýðý için false der
		System.out.println(list); // [Ayþe]
//		System.out.println(list.remove(0)); // indek i syso içinde sil yazdýr dersek sildiðini yazar
		
		// Ayþe yi "Güzel Ayþe" yapalým 
		// Elemaný deðiþtirmek için  .set(index, element) kullanýlýr
		list.set(0, "Ayþegül");
		
		System.out.println(list);// Ayþe   Ayþegül  oldu
	
		// List e "Kenan ve Zeynep ekleyin
		
		list.add("Kenan");
		list.add("Zeynep");
		System.out.println(list);//[Ayþegül, Kenan, Zeynep]
		// .clear() hepsini siler
		list.clear();
		System.out.println(list); // []
		System.out.println(list.isEmpty());// boþ ise TRUE diyecek
				
		
	}

}
