package day07nestedif;

import java.util.Scanner;

public class Tekrar {
	
	public static void main(String [] args) {
		//Kullan�c�dan bir say� al�n
		//     1.�art                      2.�art
		//Bu say� pozitif ve s�f�r ise 9 dan b�y�k m� diye kontrol edin, 9 dan b�y�k ise ekrana "say�" yazd�r�n.
		// 9 dan k���k e�it ve 0 dan b�y�k e�it ise ekrana "rakam" yazd�r�n
		// say� negatif ise ekrana "say�" yazd�r�n
				
				
		// if in i�ine bir if daha konursa buna nestedif denir. i� i�e girmi� demek yani
		// Ana if() { 
		// i�teki if() {
		// i�teki if bitti } 
		// ana if bitti}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		int num = scan.nextInt();
		if (num>=0) {
			if (num>9) {
				System.out.println(num+" Say�d�r");
			}else if (num<=9 && num>=0) {
				System.out.println(num+" Rakamd�r");
			}
		}else if (num<0 ){
			System.out.println(num+ " Say�d�r");
		}
		
		scan.close();
	}

}
