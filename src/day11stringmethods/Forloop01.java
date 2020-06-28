package day11stringmethods;

public class Forloop01 {

	public static void main(String[] args) {
		// for loop 
		// for () { }
		// for( 1. bölüm ; 2. bölüm ; 3. bölüm)
		// for( baþlangýç ; bitiþ ; artýrma ya da azaltma) {
		//    System.out.println();
		
		// 4,3,2,1,0,-1
		for (int i=4;i>-2;i--) { // forlarýn içindeki variableler for a ait
			System.out.println(i);
		}
		// 3,4,5,,6,7
		for (int a = 3; a<=7 ; a++) {
			System.out.println(a);
		}
		
		// ilk yüz sayma sayýsýný ekran ayn yana yazdýran ve ralarýna boþluk koyan
		
		for (int i=0 ; i<101; i++) {
			System.out.print(i+" ");
		}
		System.out.println(); // alt satýra almak için koyduk yoksa üst satýrýn yanýna yazacak.
		
		for (int s=100 ; s>0; s--) {
			System.out.print(s+" ");
		}
		
		// ilk 50 çift sayma sayýsýný ekrana yazdýran for loopoluþtur
		
		// 2,4,6,8,..... 100
		System.out.println();
		
		for (int i=2; i<101; i=i+2 ) {
			System.out.print(i+" ");
		}
		System.out.println();
		// // ilk 50 çift sayma sayýsýný ekrana yazdýran for loop oluþtur
		for (int i=1; i<100; i+=2 ) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i=0; i<101; i+=5 ) {
			System.out.print(i+" ");
		}
		
	}

}
