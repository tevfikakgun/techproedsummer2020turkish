package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// Kullan�c�dan bir String al�n
		// bu String'in indexi tek say� olan characterleri ekrana yazd�r
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harften hafla olan kelime giriniz");
		String str = scan.nextLine();
		int length = str.length(); // string deki harf say�s�n� alm�� olduk 
		int i=0; // tek harfleri almas� i�in 0 yazd�k, 1 alsayd�k tek harflerde �al��mazd�
		do {
			if (i%2==1) {   // burada kelimedeki indexi tek say�l� olanlar� bulmak i�in yazd�k
				System.out.print(str.charAt(i)+" ");
			}
			i++;
		} while(i<length); // 0 dan gigilen kelimedeki harflerin toplam say�s�na kadar d�g� �al���r
		   
		//         Almanya
		// index : 0123456
		// ekranda  1 3 5  yazacak
		
		
		scan.close();		

	}

}
