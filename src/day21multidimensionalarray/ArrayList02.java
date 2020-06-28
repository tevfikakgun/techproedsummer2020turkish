package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Listler data type olarak primitivleri kabul etmez
		// data type ni non-primitiv yapmak için wrapper claa kullanýlýr
		// int için Integer
		List<Integer> list01 = new ArrayList<>();
		// bu list içinde eleman olup olmadýðýný kontrol edin ****
		// isEmpty() boþ mumetodu kullanýlýr. 
		// isEmpty() boþ ise true, dolu ise false
		System.out.println(list01.isEmpty()); // boþ mu sorusunun cevabý boþ olunca cevap True oluyor.
		
		list01.add(123);
		System.out.println(list01.isEmpty()); // artýk içinde 1 eleman olarak var artýk dolu 


		// List den eleman silmek
				// .remove()metodu kullanýlýr.
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01); // [123, 124, 125, 124]
		
		list01.remove(1); // indexi 1 olan 124'ü siler
		System.out.println(list01); //[123, 125, 124]
		// 123 sil
		list01.remove(0);
		System.out.println(list01); // [125, 124]
		
		list01.remove(list01.size()-1); // list01.size()-1 son elemanýn indexi
		System.out.println(list01);
		
		
	}

}
