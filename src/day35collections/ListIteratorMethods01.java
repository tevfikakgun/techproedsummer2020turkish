package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
		// Elemanlar� A, B ve C Stringleri olan bir list olu�turun
		
		List<String> list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		// Listiterator olu�turunuz
		ListIterator<String> listIterator = list.listIterator(); // list. yaparak listiterator() methodunu �a��r�yoruz
		// iterator larda while kullan�l�r
		while(listIterator.hasNext()) { //hasNext() ile bir sonrakinde eleman var m� diye soruyoruz
										// e�er varsa d�ng� devam eder. yoksa d�g� biter
			Object element = listIterator.next();
			// next() eleman�n sa��ndan soluna ge�iriyor ve o eleman�n� yazd�r�r
			System.out.print(element+ " ");
			// ni�in listIterator kullan�yoruz
			// listi de�i�tirmek i�in kullan�yoruz
			// while d�ng�s� kullanmal�y�z
			// hasNext() ve next()
		}
		// A B C ��kt�s�n� alm��t�k ve C point�r C nin sa��nda
		//hasPrevious() bir �nceki eleman var m� diye kontrol eder.
		// next() gibi yapar ama geriye do�ru �al���r
		//hasPrevious() ve previous() kullanabilmek �nce hasNext ve next kullanmal�y�z.
		System.out.println();				  
		while (listIterator.hasPrevious()) {  
			Object element = listIterator.previous();         
			System.out.print(element+" ");
		}
		
	}

}
