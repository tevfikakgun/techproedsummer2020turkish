package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		/*
		 * Queue
		 * Queue'ya eklenen elemenler listlerde oldu�u gibi en sona eklenir.
		 * Queue'da silinen elemanlar en ba�tan silinir
		 * [1, 2, 3] bu queue'dan eleman silmeye ba�lad���n�zda ilk �nce 1 silinir.
		 * buna FIFO (first �n, first Out ilk giren ilk ��kar)
		 * 
		 */

	//	Queue<String> q = new Queue<>(); buradan object olu�turmaz ��nk� Queue interface
		
		Queue<String> qll = new LinkedList<>(); // LinkedList class oldu�u i�in obje olu�tu
		qll.add("B");
		qll.add("A");
		qll.add("C");
		System.out.println(qll);// [B, A, C]
		System.out.println(qll.element()); // ilk eleman� verir. �ok kullan�l�r.
		System.out.println(qll.poll()); // ilk eleman� siler ve ekrana verir B
		System.out.println(qll);// [A, C]
		qll.poll(); // A y� siler
		qll.poll(); // C yi siler
		qll.poll();
		//remove() methodu bo� queuelar i�in hata verir ama 
		//poll() methodu bo� queuelar i�in hata vermez null yazar
		// dolu queuelarda ise ayn� i�i yapar
		System.out.println(qll.poll());// null ��kt�s� verir
		
		
		
		
		// PriorityQueue elemanler� s�ralar 
		
		Queue<String> q = new PriorityQueue<>(); //PriorityQueue bu bir class obj oluturur
		q.add("B");
		q.add("A");
		q.add("C");
		System.out.println(q); // [A, B, C]
		
		System.out.println("Silinen eleman "+q.remove()); // sildi�i eleman� return eder yani silinen A
		System.out.println("Kalan "+q); // [B, C]
		System.out.println(q.remove("C")); // C yi sil dedik oda true ��kt�s� verir
		System.out.println(q);
		
	
		
		
		
	}

}
