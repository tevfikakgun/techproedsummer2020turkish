package day37collections;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		/*
		 * Deque: 
		 * Double Anded Queue (iki uclu Queue)
		 * Queue'lerde ekleme sona yap�l�r, silme ba�tan yapabilir
		 * Deque kullan�rsan�z eklemeyi hem ba�a hem de sona yapabilirsiniz
		 * ayn� �ekilde silmeyi de hem ba�tan hem de sondan yapabilirisiniz
		 * Deque da FIFO var ayn� zamanda LIFO (Last In First Out son giren ilk ��kar)
		 * 
		 *  Queue'lara normal olarak null eleman olarak eklenebilir ancak Deque'lara 
		 *  eleman olarak null eklenemez
		 */
		
		Deque<String> dq = new LinkedList<String>();
		dq.add("Son1");
		dq.addFirst("Bas1");
		dq.addLast("Son2");
		System.out.println(dq);// [Bas1, Son1, Son2]
		dq.push("Bas2"); // en ba�a ekler
		System.out.println(dq);// [Bas2, Bas1, Son1, Son2]
		dq.offer("Son3"); // en sona ekler
		System.out.println(dq); // [Bas2, Bas1, Son1, Son2, Son3]
		dq.offerFirst("Bas3"); // en ba�a ekledi
		System.out.println(dq); // [Bas3, Bas2, Bas1, Son1, Son2, Son3]
		// pop() methodu deque da ba�taki eleman� siler ve ba�taki eleman� return eder
		System.out.println(dq.pop()); // Bas3 sildi�i eleman� yazd�rd�
		System.out.println(dq); // [Bas2, Bas1, Son1, Son2, Son3]  Bas3 gitti
		System.out.println(dq.removeLast()); // en son eleman� siler Son3 ��kt� verir
		System.out.println(dq); // [Bas2, Bas1, Son1, Son2] Son3 gitti
		System.out.println(dq.removeFirst()); // ilk eleman� siler ve ��kt� verir  Bas2
		System.out.println(dq); // [Bas1, Son1, Son2]
		
		
		
	}
}
