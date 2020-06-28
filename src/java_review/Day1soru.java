package java_review;

import java.util.Scanner;

public class Day1soru {

	public static void main(String[] args) {
		// 
        double en= 5.6;
        double boy= 8.5;
        double cevre= 2*(en + boy);
        double alan = en*boy;
       
        System.out.println("Dikdörtgenin alaný="+alan);
        System.out.println("Dikdörtgenin Çevresi="+cevre);
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Dikgörtgenin en ölçüsünü giriniz");
        double en1 = scan.nextDouble();
        System.out.println("Lütfen Dikgörtgenin en ölçüsünü giriniz");
        double boy1 = scan.nextDouble();
        double alan1= en1*boy1;
        double cevre1= 2*(en1+boy1);
        System.out.println("Dikdörtgenin Cevresi= " + cevre1 );
        System.out.println("Dikdörtgenin alaný= " + alan1);
        
      //Scanner ile kullanýcýdan 3 sayý girmesini isteyin ve bu sayýlarýn toplamýný yazdýrýnýz.
        
      scan.close();
        
        
      
        

	}

}
