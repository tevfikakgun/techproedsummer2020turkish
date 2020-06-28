package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview02 {

	public static void main(String[] args) {
		// verilen sayýnýn tersine 2  ilave edip  yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		String num = scan.nextLine();
		String ters = ""; // sum=sum+0 daki  = ýn yaptýðý iþi "" yapýyor
		for (int i = num.length()-1; i>=0;i--) {
			ters = ters + num.charAt(i) + ""; // char'ý String' e çevirmek için sonuna "" ekledik	
		}
		System.out.println(ters);
		
		int tersInt = Integer.valueOf(ters);
		tersInt= tersInt + 2;
		System.out.println(tersInt);
		
		scan.close();
	}

}
