package day07nestedif;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		/*
		Kullan�c�dan bir harf girmesini isteyin.
		Girdi�i k���k harf ise harfin �a� olup olmad���n� kontrol edin. Harf �a� ise ekrana �Ilk k���k harf� yazd�r�n.
		�a� de�il ise ekrana �Ilk k���k harf de�il� yazd�r�n.
		Girdi�i b�y�k harf ise harfin �Z� olup olmad���n� kontrol edin. Harf �Z� ise ekrana �Son b�y�k harf� yazd�r�n.
		�Z� de�il ise ekrana �Son b�y�k harf de�il� yazd�r�n.	
		96 < k���k harf < 123 
		64 < b�y�k harf < 91  
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char harf = scan.next().charAt(0);
		
		if (harf>96 && harf<123) {
			if (harf==97) {
				System.out.println("ilk k���k harf");
			}else {
				System.out.println("ilk k���k harf de�il");
			}
		} if (harf>64 && harf<91) {
			if (harf==90) {
				System.out.println("Son b�y�k harf");
			}else {
				System.out.println("Son b�y�k harf de�il");
			}
		}
		scan.close();
	}

}
