package day36collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		/*
		 * LinkedHashSet
		 * 1. Tekrara izin vermez
		 * 2. Key-value yap�s� var
		 * 3. elemanlar� programc�n�n girdi�i s�raya g�re dizer.
		 */

		LinkedHashSet<String> lhSet = new LinkedHashSet<>();
		lhSet.add("Z");
		lhSet.add("A");
		lhSet.add("D");
		lhSet.add("B");
		System.out.println(lhSet);
		
		TreeSet<String> tSet = new TreeSet<>(lhSet);
		System.out.println(tSet);
	}

}
