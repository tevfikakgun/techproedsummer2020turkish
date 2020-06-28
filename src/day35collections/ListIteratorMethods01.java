package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
		// Elemanlarý A, B ve C Stringleri olan bir list oluþturun
		
		List<String> list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		// Listiterator oluþturunuz
		ListIterator<String> listIterator = list.listIterator(); // list. yaparak listiterator() methodunu çaðýrýyoruz
		// iterator larda while kullanýlýr
		while(listIterator.hasNext()) { //hasNext() ile bir sonrakinde eleman var mý diye soruyoruz
										// eðer varsa döngü devam eder. yoksa dögü biter
			Object element = listIterator.next();
			// next() elemanýn saðýndan soluna geçiriyor ve o elemanýný yazdýrýr
			System.out.print(element+ " ");
			// niçin listIterator kullanýyoruz
			// listi deðiþtirmek için kullanýyoruz
			// while döngüsü kullanmalýyýz
			// hasNext() ve next()
		}
		// A B C çýktýsýný almýþtýk ve C pointýr C nin saðýnda
		//hasPrevious() bir önceki eleman var mý diye kontrol eder.
		// next() gibi yapar ama geriye doðru çalýþýr
		//hasPrevious() ve previous() kullanabilmek önce hasNext ve next kullanmalýyýz.
		System.out.println();				  
		while (listIterator.hasPrevious()) {  
			Object element = listIterator.previous();         
			System.out.print(element+" ");
		}
		
	}

}
