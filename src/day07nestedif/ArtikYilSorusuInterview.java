package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		// Kullanýcýndan yýl girmesini isteyin
		// girilen artýk yýl ise ekrana artýk yýl yazdýrýn
		// girilen yýl artýk yýl deðil yazdýrýn
		// artýk yýl 
		// 1) Yýl 100 e bonurse 400 e de bölünmeli. --> 1300 artýk yýl deðil cunku 100 e bolunur ama 400 e bölünmez
		//											--> 1200 artýk yýldýr. cunku 100 e bölünür ve 400e bölünür
		// 2) yýl 100 e bolunmezse 4 e bolunmeli
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yýl giriniz");
		int yil = scan.nextInt();
		if (yil%100 == 0 && yil%400 == 0) {
			System.out.println(yil + " Artýk Yýldýr");
		}else if (yil%100 !=0 && yil%4 == 0 ) {
			System.out.println(yil + " Artýk Yýldýr"); // 2020 Artýk Yýldýr
		}else {
			System.out.println(yil + " Artýk yýl deðildir");
		}
		
		scan.close();

	}

}
