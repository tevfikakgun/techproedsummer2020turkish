package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		/*
		 * TreeSet
		 * 1. HashSet ile hemen hemen ayn�d�r. Duplication'a musaade etmez.
		 * 	  key-value yap�s� kullan�l�r
		 * 2. Elemanlar� natural ordera g�re dizer. s�ralama �nemli olunca kullan�l�r.
		 * 	  HasSetten ise rast gele dizer ikisi aras�ndaki en �nemli fark� budur.
		 * 3. TreeSet s�ralama ile u�ra�t��� i�in hasSete g�re daha yava�t�r. 
		 * 	  s�ralama �ok �nemli ise treeSet kullan�l�r. yoksa tercih edilmez.
		 * 4. e�er h�zl� olmzs� isteniyorsa �nce hashset olu�turulur elemanlar eklenir sonra 
		 * 	  bu hashset treesete d�n��t�r�l�r. ve h�z i�i ��z�l�r.
		 *    Direk treeset olu�turma genellikle kullan�lmaz
		 *    
		 */
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		System.out.println(tSet); // [ABC, Ink, Jack, Pen, String, Test]
		
		HashSet<String> hSet1 = new HashSet<>();
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		System.out.println(hSet1);
		
		TreeSet<String> tSet1 = new TreeSet<>(hSet1); // hashSeti treesete �evirdik 
													  //elemanlar� s�raya koyar�z
		System.out.println(tSet1);
	}

}
