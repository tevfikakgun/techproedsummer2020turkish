package day14dowhileloop;

import java.util.Scanner;
		//SORU 5
public class Odev05 {

	public static void main(String[] args) {
		// Kullanýcýya bir String girmesini söyleyin ve 
		// bu String’in ilk harfi ile son harfi ayný ise ekrana  “Simetrik” yazdýrýn. 
		// Ayný deðilse tekrar bir String girmesini isteyin
		
		Scanner scan = new Scanner(System.in);
		
		String str="";
		
		do {
				System.out.println("Bir kelime giriniz");
				str = scan.nextLine();
		}while (str.charAt(0) != str.charAt(str.length()-1));
			System.out.println("Simetrik");
		
			scan.close();
	}

}
