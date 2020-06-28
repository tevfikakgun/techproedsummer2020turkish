package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// Kullanýcýdan bir tam sayý isteyin ve o tamsayýnýn
		// mutlak deðeri ekrana yazdýrýn
		// mutlak deðer bir sayýnýn kendi iþaretiyle çarpýmýdýr
		// örnek : -3 un mutlak deðeri : -3* (-1)=3
		// örnek : +5 in mutlak deðeri : +5* (+1)= +5
		// 0 ýn mutlak degeri de 0 dýr.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz");
		int num = scan.nextInt();
		
		if (num<0) {
			System.out.println("Verdiðiniz sayýnýn mutlak deðeri="+ num*(-1));
		}else {
			System.out.println("Verdiðiniz sayýnýn mutlak deðeri="+ num);
		}
		scan.close();
	}

}
