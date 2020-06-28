package day35collections;

import java.util.LinkedList;

public class LinkedList01 {
	
	public static void main(String[] args) {
		
		/*
		 * Linkedlist bir classt�r.
		 * Linkedlist de her eleman�n (elemana data diyorlar) yan�na bir pointer olu�turulur. eleman�n sa�taraf�nda oluyor
		 * bu pointer in vazifesi bir elemanla ba�lanmas�n� sa�lamakt�r
		 * her eleman tren vagonlar� gibi bir birine ba�l�d�r
		 * data ve pointer i�eren her eleman�n di�er ad� "Node" dir
		 * linkedlist de index kullanm�yacag�z onun yerine B ye ba�l� A diyece�iz
		 * B i�in Aile C aras�nda diyece�iz.
		 * en son elemana Tail (kuyruk) denir onun pointeri null dur
		 * en ba�dakine Head(ba�) denir. ba�ta sadece pointer vard�r. 
		 * 
		 * 
		 * Linkedlist'e ne gerek vard�r?
		 * Java normal list'te bir elemana gidecekken teker teker ilerler.
		 * Linkedlist e ise direk elemana gider. i�lem h�zlan�r.
		 * list olu�turdu�umuzda genelde ya eleman sileriz ya da eleman ekleriz. eleman ekleme ve silmede
		 * en h�zl� linkedlist �al���r.
		 */
		
		// lenkenlist bir class oldu�u i�in direk object olu�turabiliriz
		
		LinkedList<String> linkList = new LinkedList<>(); // LinkedList olu�turduk
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("John");
		linkList.add("Ann");
		linkList.add("Pamela");
		System.out.println(linkList); // [Mark, Amanda, John, Ann, Pamela]
		
		linkList.remove(2);
		System.out.println(linkList); // [Mark, Amanda, Ann, Pamela] index 2 John'du o y�zden jhon'u sildi. 
		linkList.removeFirst(); // ilk eleman� siler
		System.out.println(linkList);// [Amanda, Ann, Pamela]
		linkList.removeLast();// en sondakini siler
		System.out.println(linkList);// [Amanda, Ann]
		
		linkList.add(1, "Ali");
		System.out.println(linkList); // [Amanda, Ali, Ann]
		linkList.addFirst("Kemal");
		System.out.println(linkList); // [Kemal, Amanda, Ali, Ann]
		linkList.addLast("Zeynep");
		System.out.println(linkList);// [Kemal, Amanda, Ali, Ann, Zeynep]
		linkList.set(1, "Ajanda");
		System.out.println(linkList);//[Kemal, Ajanda, Ali, Ann, Zeynep]
		
		LinkedList<String> linkList2 = new LinkedList<>(); // LinkedList olu�turduk
		
		linkList2.add("X");
		linkList2.add("Y");
		linkList2.addAll(linkList);// linkList2 y e linkList'i ekler
		System.out.println(linkList2); // [X, Y, Kemal, Ajanda, Ali, Ann, Zeynep]
		
		linkList.addAll(3, linkList2);
		System.out.println(linkList); // [Kemal, Ajanda, Ali, X, Y, Kemal, Ajanda, Ali, Ann, Zeynep, Ann, Zeynep]
		 
		System.out.println(linkList.contains("kaan")); // linkList te kaan yok flse verir
		System.out.println(linkList2.contains("Ali")); // ali var true
		
		linkList2.clear();
		System.out.println(linkList2);// clear elemanlar� bo�alt�r
		
		
		
		
		
		
		
		
		
}
}
