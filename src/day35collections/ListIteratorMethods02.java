package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	
	public static void main(String[] args) {
		
		List<String> list= new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		ListIterator<String> listIterator = list.listIterator();
		// elemanlar� AW BW CW yap
		while (listIterator.hasNext()) {
			Object element = listIterator.next();
			listIterator.set(element+"W"); // set elemanlar� de�i�tirmek i�in kulland�k W ekledik
		}
		// while deki de�i�im listi de�i�tirdi
		System.out.println(list);
		listIterator.add("Kemal");
		listIterator.add("Can");
		System.out.println(list);
	    
		
		
	}
}
