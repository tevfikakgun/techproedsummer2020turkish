package day19arrays;

public class Array02 {

	public static void main(String[] args) {
		// 4 elemanl� char array olu�turun bu array elemanlar yrle�tirin 
		// t�m elamanlar� for d�ng��syle
		
		char arr2 [] = new char[4];
		arr2[0]='A';
		arr2[1]='D';
		arr2[2]='E';
		arr2[3]='M';
		for (int i=0;i<4;i++) {
			System.out.print(arr2[i]+" ");	
		}
		System.out.println();
		System.out.println(arr2[3]);	
		
		// array in length i bulmak i�in "arr2.length" yap�l�r.
		System.out.println(arr2.length);
		// Stringlerde de length kullan�l�r 
		// ancak String.length() olur.
		// arr2.legth   fark� () buna dikkat edelim
		
		System.out.println(arr2[arr2.length-1]); // arr2.length-1  son eleman� verir.
		
	}

}
