package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Bir int array in elemanlarýný küçükten büyüðe diziniz 
		// ve ekrana iki durumuda yazdýrný
		
		int arr [] = {2, 11, 0, 23, 7 };
		System.out.println("Sýralamadan önce "+Arrays.toString(arr));
		Arrays.sort(arr);  //Arrays.sort() methoduna parametrenin ismi yazýlýrsa 
							// o array küçükten büyüðe sýralar(Ascending order,naturel order).
		System.out.println("Sýralamadan sonra "+ Arrays.toString(arr));
		
		// charlardan oluþan bir array oluþturunuz "assending order" oluþturunuz
		char arr1 [] = {'a', 'b', 't', 'd', 'A'};  // charlar sýralanýrken Java ascii kodlarý kullanýr
		System.out.println("Sýralamadan önce "+ Arrays.toString(arr1)); // büyük harflerin ascii kodlarý daha azdýr
		Arrays.sort(arr1);
		System.out.println("Sýralamadan sonra "+ Arrays.toString(arr1));
		
		
		// Stringlerden oluþan bir array oluþturun ve "asending order
		
		String arrStr [] = {"ali","Tevfik","Beyhan", "123", "Zafer"};
		System.out.println("Sýralamadan önce "+ Arrays.toString(arrStr));
		Arrays.sort(arrStr);
		System.out.println("Sýralamadan sonra "+ Arrays.toString(arrStr));
		
		// ali küçük harfle baþlýðý için onu en sona atar
		// 123 ilk alýr çünkü 1 ascii deðeri 1
		
		// boolean array oluþturun "assending order" oluþturun
		
		boolean arrBl [] = {true, false, true};
		System.out.println(Arrays.toString(arrBl));
		// booleanlar için sort methodu yoktur..........
		
		
		

	}

}
