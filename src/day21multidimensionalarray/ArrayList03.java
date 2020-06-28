package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		list.add("Ay�e");
		list.add("Ali");
		System.out.println(list);
		list.remove("Ali"); // ilk Ali yi sildi  list.remove(object) se�tik
		System.out.println(list);
		list.remove("Ali");
		System.out.println(list); // Ali gitti  ��kt� [Can, Ay�e]
		list.remove("Kemal");  // ��kt� [Can, Ay�e]
		System.out.println(list); // remove methodu listede olmayan elemanlar i�in hata vermez.
		  // ama index kullan�rsak hata verir
		System.out.println(list.remove("Can")); //  Can  siler ve True   yazar
		System.out.println(list.remove("Kemal")); //  silecek Kemal olmad��� i�in false der
		System.out.println(list); // [Ay�e]
//		System.out.println(list.remove(0)); // indek i syso i�inde sil yazd�r dersek sildi�ini yazar
		
		// Ay�e yi "G�zel Ay�e" yapal�m 
		// Eleman� de�i�tirmek i�in  .set(index, element) kullan�l�r
		list.set(0, "Ay�eg�l");
		
		System.out.println(list);// Ay�e   Ay�eg�l  oldu
	
		// List e "Kenan ve Zeynep ekleyin
		
		list.add("Kenan");
		list.add("Zeynep");
		System.out.println(list);//[Ay�eg�l, Kenan, Zeynep]
		// .clear() hepsini siler
		list.clear();
		System.out.println(list); // []
		System.out.println(list.isEmpty());// bo� ise TRUE diyecek
				
		
	}

}
