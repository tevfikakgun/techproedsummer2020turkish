package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
//		Kullan�c�dan ka� elemanl� bir array girmesini  isteyin.
//		Bu array�in tum elemanlar�n� ekrana yazd�r�n.
//		Bu array�n ilk eleman�n� son eleman yap�n ve tum elemanlar�n� ekrana yazd�r�n.
//		Mesela; array {1, 2, 3} ise ekrana {2, 3, 1} seklinde yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ka� elemanl� bir integer array olu�turmak istersiniz");
		int length = scan.nextInt();
		int arr[] = new int [length]; // kullan�c�n verdi�i say�
		System.out.println("Array elemanlar�n� giriniz");
		for (int i=0; i<length;i++) {
			arr[i] = scan.nextInt();
			
		}
		    System.out.println(Arrays.toString(arr)); 
		    
		    // Arrays.toString() methodu
		    
		    // Arrays.toString() methodunda parametre olarak 
		    // Array in ismini yazarsan�z o arrayin t�m elemanlar�n� yazd�rmak i�in kullan�l�r
		    // burada arr adresinden head e gidip yaz�lan object gidiyor ve yazd�r�yor
		    
		 int arrSon [] = new int [length];
		 for (int i=1; i<length;i++) {
			 arrSon [i-1] = arr [i];
		 }
		 arrSon [length-1] = arr [0];
		 System.out.println(Arrays.toString(arrSon));
		 scan.close();
	}

}
