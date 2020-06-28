package day23date;


import java.util.ArrayList;
import java.util.List;

public class ListaAllMethod {

	public static void main(String[] args) {
		// addAll() Methodu iki listi birleþtirmek için kullanýlýr
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
		System.out.println(list1); // [11, 12]
		List<Integer> list2 = new ArrayList<>();
		list2.add(13);
		list2.add(14);
		list2.add(15);
		System.out.println(list2); // [13, 14, 15]
		
		list1.addAll(list2);
		System.out.println(list1);  // [11, 12, 13, 14, 15]  önce yazýlan önce 
		list2.addAll(list1);
		System.out.println(list2);  // [13, 14, 15, 11, 12, 13, 14, 15] önce list2 yazdý
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);
		System.out.println(list3);
		List<Integer> list4 = new ArrayList <>();
		list4.add(2);
		list4.add(3);
		System.out.println(list4);  // [2, 3]
		
		
		list4.addAll(1, list3); // indexi1 olan yere list3 yazar
		
		System.out.println(list4); // [2, 1, 3] böylelikle istediðimiz yere eklemiþ oluruz
		
		
		
		
		
		
		
		
		
		
	}

}
