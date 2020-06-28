package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Bir int array in elemanlar�n� k���kten b�y��e diziniz 
		// ve ekrana iki durumuda yazd�rn�
		
		int arr [] = {2, 11, 0, 23, 7 };
		System.out.println("S�ralamadan �nce "+Arrays.toString(arr));
		Arrays.sort(arr);  //Arrays.sort() methoduna parametrenin ismi yaz�l�rsa 
							// o array k���kten b�y��e s�ralar(Ascending order,naturel order).
		System.out.println("S�ralamadan sonra "+ Arrays.toString(arr));
		
		// charlardan olu�an bir array olu�turunuz "assending order" olu�turunuz
		char arr1 [] = {'a', 'b', 't', 'd', 'A'};  // charlar s�ralan�rken Java ascii kodlar� kullan�r
		System.out.println("S�ralamadan �nce "+ Arrays.toString(arr1)); // b�y�k harflerin ascii kodlar� daha azd�r
		Arrays.sort(arr1);
		System.out.println("S�ralamadan sonra "+ Arrays.toString(arr1));
		
		
		// Stringlerden olu�an bir array olu�turun ve "asending order
		
		String arrStr [] = {"ali","Tevfik","Beyhan", "123", "Zafer"};
		System.out.println("S�ralamadan �nce "+ Arrays.toString(arrStr));
		Arrays.sort(arrStr);
		System.out.println("S�ralamadan sonra "+ Arrays.toString(arrStr));
		
		// ali k���k harfle ba�l��� i�in onu en sona atar
		// 123 ilk al�r ��nk� 1 ascii de�eri 1
		
		// boolean array olu�turun "assending order" olu�turun
		
		boolean arrBl [] = {true, false, true};
		System.out.println(Arrays.toString(arrBl));
		// booleanlar i�in sort methodu yoktur..........
		
		
		

	}

}
