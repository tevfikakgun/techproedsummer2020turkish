package day35collections;

import java.util.LinkedList;

public class LinkedList01 {
	
	public static void main(String[] args) {
		
		/*
		 * Linkedlist bir classtýr.
		 * Linkedlist de her elemanýn (elemana data diyorlar) yanýna bir pointer oluþturulur. elemanýn saðtarafýnda oluyor
		 * bu pointer in vazifesi bir elemanla baðlanmasýný saðlamaktýr
		 * her eleman tren vagonlarý gibi bir birine baðlýdýr
		 * data ve pointer içeren her elemanýn diðer adý "Node" dir
		 * linkedlist de index kullanmýyacagýz onun yerine B ye baðlý A diyeceðiz
		 * B için Aile C arasýnda diyeceðiz.
		 * en son elemana Tail (kuyruk) denir onun pointeri null dur
		 * en baþdakine Head(baþ) denir. baþta sadece pointer vardýr. 
		 * 
		 * 
		 * Linkedlist'e ne gerek vardýr?
		 * Java normal list'te bir elemana gidecekken teker teker ilerler.
		 * Linkedlist e ise direk elemana gider. iþlem hýzlanýr.
		 * list oluþturduðumuzda genelde ya eleman sileriz ya da eleman ekleriz. eleman ekleme ve silmede
		 * en hýzlý linkedlist çalýþýr.
		 */
		
		// lenkenlist bir class olduðu için direk object oluþturabiliriz
		
		LinkedList<String> linkList = new LinkedList<>(); // LinkedList oluþturduk
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("John");
		linkList.add("Ann");
		linkList.add("Pamela");
		System.out.println(linkList); // [Mark, Amanda, John, Ann, Pamela]
		
		linkList.remove(2);
		System.out.println(linkList); // [Mark, Amanda, Ann, Pamela] index 2 John'du o yüzden jhon'u sildi. 
		linkList.removeFirst(); // ilk elemaný siler
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
		
		LinkedList<String> linkList2 = new LinkedList<>(); // LinkedList oluþturduk
		
		linkList2.add("X");
		linkList2.add("Y");
		linkList2.addAll(linkList);// linkList2 y e linkList'i ekler
		System.out.println(linkList2); // [X, Y, Kemal, Ajanda, Ali, Ann, Zeynep]
		
		linkList.addAll(3, linkList2);
		System.out.println(linkList); // [Kemal, Ajanda, Ali, X, Y, Kemal, Ajanda, Ali, Ann, Zeynep, Ann, Zeynep]
		 
		System.out.println(linkList.contains("kaan")); // linkList te kaan yok flse verir
		System.out.println(linkList2.contains("Ali")); // ali var true
		
		linkList2.clear();
		System.out.println(linkList2);// clear elemanlarý boþaltýr
		
		
		
		
		
		
		
		
		
}
}
