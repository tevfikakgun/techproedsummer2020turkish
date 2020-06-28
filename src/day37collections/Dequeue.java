package day37collections;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		/*
		 * Deque: 
		 * Double Anded Queue (iki uclu Queue)
		 * Queue'lerde ekleme sona yapýlýr, silme baþtan yapabilir
		 * Deque kullanýrsanýz eklemeyi hem baþa hem de sona yapabilirsiniz
		 * ayný þekilde silmeyi de hem baþtan hem de sondan yapabilirisiniz
		 * Deque da FIFO var ayný zamanda LIFO (Last In First Out son giren ilk çýkar)
		 * 
		 *  Queue'lara normal olarak null eleman olarak eklenebilir ancak Deque'lara 
		 *  eleman olarak null eklenemez
		 */
		
		Deque<String> dq = new LinkedList<String>();
		dq.add("Son1");
		dq.addFirst("Bas1");
		dq.addLast("Son2");
		System.out.println(dq);// [Bas1, Son1, Son2]
		dq.push("Bas2"); // en baþa ekler
		System.out.println(dq);// [Bas2, Bas1, Son1, Son2]
		dq.offer("Son3"); // en sona ekler
		System.out.println(dq); // [Bas2, Bas1, Son1, Son2, Son3]
		dq.offerFirst("Bas3"); // en baþa ekledi
		System.out.println(dq); // [Bas3, Bas2, Bas1, Son1, Son2, Son3]
		// pop() methodu deque da baþtaki elemaný siler ve baþtaki elemaný return eder
		System.out.println(dq.pop()); // Bas3 sildiði elemaný yazdýrdý
		System.out.println(dq); // [Bas2, Bas1, Son1, Son2, Son3]  Bas3 gitti
		System.out.println(dq.removeLast()); // en son elemaný siler Son3 çýktý verir
		System.out.println(dq); // [Bas2, Bas1, Son1, Son2] Son3 gitti
		System.out.println(dq.removeFirst()); // ilk elemaný siler ve çýktý verir  Bas2
		System.out.println(dq); // [Bas1, Son1, Son2]
		
		
		
	}
}
