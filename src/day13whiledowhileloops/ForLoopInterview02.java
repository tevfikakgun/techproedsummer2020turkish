package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview02 {

	public static void main(String[] args) {
		// verilen say�n�n tersine 2  ilave edip  yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir say� giriniz");
		String num = scan.nextLine();
		String ters = ""; // sum=sum+0 daki  = �n yapt��� i�i "" yap�yor
		for (int i = num.length()-1; i>=0;i--) {
			ters = ters + num.charAt(i) + ""; // char'� String' e �evirmek i�in sonuna "" ekledik	
		}
		System.out.println(ters);
		
		int tersInt = Integer.valueOf(ters);
		tersInt= tersInt + 2;
		System.out.println(tersInt);
		
		scan.close();
	}

}
