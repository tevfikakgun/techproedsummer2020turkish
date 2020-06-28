package day19arrays;

public class Array02 {

	public static void main(String[] args) {
		// 4 elemanlý char array oluþturun bu array elemanlar yrleþtirin 
		// tüm elamanlarý for döngüüsyle
		
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
		
		// array in length i bulmak için "arr2.length" yapýlýr.
		System.out.println(arr2.length);
		// Stringlerde de length kullanýlýr 
		// ancak String.length() olur.
		// arr2.legth   farký () buna dikkat edelim
		
		System.out.println(arr2[arr2.length-1]); // arr2.length-1  son elemaný verir.
		
	}

}
