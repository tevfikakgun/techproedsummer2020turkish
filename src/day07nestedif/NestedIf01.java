package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
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
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir tam say� giriniz");
		int num = scan.nextInt();
		if (num>=0) { // out if
			if (num>9) { // inn if
				System.out.println("Sayi");
			}else if (num<=9 && num>=0) {
				System.out.println("Rakam");
			}
		}else if (num<0) {
			System.out.println("Sayi");
		}
		
		scan.close(); 
		// Scannerclass'� kulland�ktan sonra en altta main metodun i�inde Scanner claas�n� kapat�n�z
		// scanner class kapatmak i�in    scan.close();  yazmak yeterlidir.
		// amazon verd service  bak
	}

}
