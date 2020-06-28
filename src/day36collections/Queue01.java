package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		/*
		 * Queue
		 * Queue'ya eklenen elemenler listlerde olduðu gibi en sona eklenir.
		 * Queue'da silinen elemanlar en baþtan silinir
		 * [1, 2, 3] bu queue'dan eleman silmeye baþladýðýnýzda ilk önce 1 silinir.
		 * buna FIFO (first Ýn, first Out ilk giren ilk çýkar)
		 * 
		 */

	//	Queue<String> q = new Queue<>(); buradan object oluþturmaz çünkü Queue interface
		
		Queue<String> qll = new LinkedList<>(); // LinkedList class olduðu için obje oluþtu
		qll.add("B");
		qll.add("A");
		qll.add("C");
		System.out.println(qll);// [B, A, C]
		System.out.println(qll.element()); // ilk elemaný verir. çok kullanýlýr.
		System.out.println(qll.poll()); // ilk elemaný siler ve ekrana verir B
		System.out.println(qll);// [A, C]
		qll.poll(); // A yý siler
		qll.poll(); // C yi siler
		qll.poll();
		//remove() methodu boþ queuelar için hata verir ama 
		//poll() methodu boþ queuelar için hata vermez null yazar
		// dolu queuelarda ise ayný iþi yapar
		System.out.println(qll.poll());// null çýktýsý verir
		
		
		
		
		// PriorityQueue elemanlerý sýralar 
		
		Queue<String> q = new PriorityQueue<>(); //PriorityQueue bu bir class obj oluturur
		q.add("B");
		q.add("A");
		q.add("C");
		System.out.println(q); // [A, B, C]
		
		System.out.println("Silinen eleman "+q.remove()); // sildiði elemaný return eder yani silinen A
		System.out.println("Kalan "+q); // [B, C]
		System.out.println(q.remove("C")); // C yi sil dedik oda true çýktýsý verir
		System.out.println(q);
		
	
		
		
		
	}

}
