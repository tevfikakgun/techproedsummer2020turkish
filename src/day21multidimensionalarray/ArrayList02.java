package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Listler data type olarak primitivleri kabul etmez
		// data type ni non-primitiv yapmak i�in wrapper claa kullan�l�r
		// int i�in Integer
		List<Integer> list01 = new ArrayList<>();
		// bu list i�inde eleman olup olmad���n� kontrol edin ****
		// isEmpty() bo� mumetodu kullan�l�r. 
		// isEmpty() bo� ise true, dolu ise false
		System.out.println(list01.isEmpty()); // bo� mu sorusunun cevab� bo� olunca cevap True oluyor.
		
		list01.add(123);
		System.out.println(list01.isEmpty()); // art�k i�inde 1 eleman olarak var art�k dolu 


		// List den eleman silmek
				// .remove()metodu kullan�l�r.
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01); // [123, 124, 125, 124]
		
		list01.remove(1); // indexi 1 olan 124'� siler
		System.out.println(list01); //[123, 125, 124]
		// 123 sil
		list01.remove(0);
		System.out.println(list01); // [125, 124]
		
		list01.remove(list01.size()-1); // list01.size()-1 son eleman�n indexi
		System.out.println(list01);
		
		
	}

}
