package day11stringmethods;

public class Forloop01 {

	public static void main(String[] args) {
		// for loop 
		// for () { }
		// for( 1. b�l�m ; 2. b�l�m ; 3. b�l�m)
		// for( ba�lang�� ; biti� ; art�rma ya da azaltma) {
		//    System.out.println();
		
		// 4,3,2,1,0,-1
		for (int i=4;i>-2;i--) { // forlar�n i�indeki variableler for a ait
			System.out.println(i);
		}
		// 3,4,5,,6,7
		for (int a = 3; a<=7 ; a++) {
			System.out.println(a);
		}
		
		// ilk y�z sayma say�s�n� ekran ayn yana yazd�ran ve ralar�na bo�luk koyan
		
		for (int i=0 ; i<101; i++) {
			System.out.print(i+" ");
		}
		System.out.println(); // alt sat�ra almak i�in koyduk yoksa �st sat�r�n yan�na yazacak.
		
		for (int s=100 ; s>0; s--) {
			System.out.print(s+" ");
		}
		
		// ilk 50 �ift sayma say�s�n� ekrana yazd�ran for loopolu�tur
		
		// 2,4,6,8,..... 100
		System.out.println();
		
		for (int i=2; i<101; i=i+2 ) {
			System.out.print(i+" ");
		}
		System.out.println();
		// // ilk 50 �ift sayma say�s�n� ekrana yazd�ran for loop olu�tur
		for (int i=1; i<100; i+=2 ) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i=0; i<101; i+=5 ) {
			System.out.print(i+" ");
		}
		
	}

}
