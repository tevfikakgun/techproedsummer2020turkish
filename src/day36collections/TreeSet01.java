package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		/*
		 * TreeSet
		 * 1. HashSet ile hemen hemen aynýdýr. Duplication'a musaade etmez.
		 * 	  key-value yapýsý kullanýlýr
		 * 2. Elemanlarý natural ordera göre dizer. sýralama önemli olunca kullanýlýr.
		 * 	  HasSetten ise rast gele dizer ikisi arasýndaki en önemli farký budur.
		 * 3. TreeSet sýralama ile uðraþtýðý için hasSete göre daha yavaþtýr. 
		 * 	  sýralama çok önemli ise treeSet kullanýlýr. yoksa tercih edilmez.
		 * 4. eðer hýzlý olmzsý isteniyorsa önce hashset oluþturulur elemanlar eklenir sonra 
		 * 	  bu hashset treesete dönüþtürülür. ve hýz iþi çözülür.
		 *    Direk treeset oluþturma genellikle kullanýlmaz
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
		
		TreeSet<String> tSet1 = new TreeSet<>(hSet1); // hashSeti treesete çevirdik 
													  //elemanlarý sýraya koyarýz
		System.out.println(tSet1);
	}

}
