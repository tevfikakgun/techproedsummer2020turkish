package day14dowhileloop;
		
import java.util.Scanner;
		// SORU 6
public class Odev06 {

	public static void main(String[] args) {
		// Kullanýcýdan bir String alýn ve bu 
		// String’in icinde “a” harfi varsa ekrana “a harfi var” yazdýrýn.  
		// “a” harfi yoksa tekrar bir String girmesini isteyin.
		
		Scanner scan = new Scanner(System.in);
		
		String str="";
		
		do {
				System.out.println("Bir kelime giriniz");
				str = scan.nextLine();
				
		}while (!(str.contains("a")));
		
			System.out.println("a harfi var");
		scan.close();
	}

}
