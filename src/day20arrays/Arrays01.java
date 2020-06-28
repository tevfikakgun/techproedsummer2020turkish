package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
//		Kullanýcýdan kaç elemanlý bir array girmesini  isteyin.
//		Bu array’in tum elemanlarýný ekrana yazdýrýn.
//		Bu arrayýn ilk elemanýný son eleman yapýn ve tum elemanlarýný ekrana yazdýrýn.
//		Mesela; array {1, 2, 3} ise ekrana {2, 3, 1} seklinde yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç elemanlý bir integer array oluþturmak istersiniz");
		int length = scan.nextInt();
		int arr[] = new int [length]; // kullanýcýn verdiði sayý
		System.out.println("Array elemanlarýný giriniz");
		for (int i=0; i<length;i++) {
			arr[i] = scan.nextInt();
			
		}
		    System.out.println(Arrays.toString(arr)); 
		    
		    // Arrays.toString() methodu
		    
		    // Arrays.toString() methodunda parametre olarak 
		    // Array in ismini yazarsanýz o arrayin tüm elemanlarýný yazdýrmak için kullanýlýr
		    // burada arr adresinden head e gidip yazýlan object gidiyor ve yazdýrýyor
		    
		 int arrSon [] = new int [length];
		 for (int i=1; i<length;i++) {
			 arrSon [i-1] = arr [i];
		 }
		 arrSon [length-1] = arr [0];
		 System.out.println(Arrays.toString(arrSon));
		 scan.close();
	}

}
