package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class Odev {

	public static void main(String[] args) {
	
		/* For-each loop Soru 1:
		 * Bir integer array oluþturunuz ve 
		 * bu array’deki tum sayýlarýn çarpýmýný For-each loop kullanarak bulunuz. 
		 * Sonucu ekrana yazdýrýnýz.
		 */
		int arr [] = {2,4,6,8};
		int product = 1;
		for (int w : arr) {
			product=product*w;
		}
			System.out.println("Sayýlarýn çarpýmý= "+product);
			
		/* For-each loop Soru 2:
		 * Bir integer list oluþturunuz ve 
		 * bu list’deki tum sayýlarýn karesinin toplamýný For-each loop kullanarak bulunuz. 
		 * Sonucu ekrana yazdýrýnýz. 
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
		System.out.println("Sayýlarýn karesinin toplamý ="+ sum);
		
		
		/* Soru 3:
		 * Ýki String array oluþturunuz ve 
		 * bu array’lerdeki ortak elemanlarý For-each loop kullanarak bulunuz. 
		 * Sonucu ekrana yazdýrýnýz.  Ortak eleman yoksa ekrana “Ortak eleman yok” yazdýrýnýz
		 */
		
		String arr1 [] = {"Ali","Fatma","Hasan","Hüseyin"};
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
		 * Bir String oluþturunuz, 
		 * bu String’deki character’leri yukarýdan aþaðýya for-each loop kullanarak yazdýrýnýz.  
		 */
		String str3= "Norveç";
		String ch [] = str3.split("");
		for (String w: ch) {
			System.out.println(w);
		}
		
		
	}

}
