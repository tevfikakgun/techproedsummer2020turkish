package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class Odev {

	public static void main(String[] args) {
	
		/* For-each loop Soru 1:
		 * Bir integer array olu�turunuz ve 
		 * bu array�deki tum say�lar�n �arp�m�n� For-each loop kullanarak bulunuz. 
		 * Sonucu ekrana yazd�r�n�z.
		 */
		int arr [] = {2,4,6,8};
		int product = 1;
		for (int w : arr) {
			product=product*w;
		}
			System.out.println("Say�lar�n �arp�m�= "+product);
			
		/* For-each loop Soru 2:
		 * Bir integer list olu�turunuz ve 
		 * bu list�deki tum say�lar�n karesinin toplam�n� For-each loop kullanarak bulunuz. 
		 * Sonucu ekrana yazd�r�n�z. 
		 */
			
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		int sum= 0;
		System.out.println(list); // [2, 3, 5, 7]
		for (int w : list) {
			sum=sum+(w*w);
		}
		System.out.println("Say�lar�n karesinin toplam� ="+ sum);
		
		
		/* Soru 3:
		 * �ki String array olu�turunuz ve 
		 * bu array�lerdeki ortak elemanlar� For-each loop kullanarak bulunuz. 
		 * Sonucu ekrana yazd�r�n�z.  Ortak eleman yoksa ekrana �Ortak eleman yok� yazd�r�n�z
		 */
		
		String arr1 [] = {"Ali","Fatma","Hasan","H�seyin"};
		String arr2 [] = {"Aliye","Ahmet","Hatice"};
		int count=0;
		for (String w: arr1) {
			for (String z: arr2) {
				if (w.equals(z)) {
					System.out.println("Ortak eleman var");
					count++;
				}
			}
		}
		if (count==0) {
			System.out.println("Ortak eleman yok");
		}
		
		/* For-each loop Soru 4:
		 * Bir String olu�turunuz, 
		 * bu String�deki character�leri yukar�dan a�a��ya for-each loop kullanarak yazd�r�n�z.  
		 */
		String str3= "Norve�";
		String ch [] = str3.split("");
		for (String w: ch) {
			System.out.println(w);
		}
		
		
	}

}
