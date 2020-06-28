package day04operators;

import java.util.Scanner;

public class Modulus04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dört basamaklý bir tam sayý giriniz");
		int s = scan.nextInt();
		int s1 = s % 10;
		int v1 = s / 10 ;
		int s2 = v1 % 10;
		int v2 = s /100;
		int s3 = v2 % 10;
		int s4 = s / 1000;
		System.out.println("Birler basamaðýndaki rakam="+s1);
		System.out.println("Onlar basamaðýndaki rakam="+s2);
		System.out.println("Yüzler basamaðýndaki rakam="+s3);
		System.out.println("Binler basamaðýndaki rakam="+s4);
		System.out.print("RakamlarToplamý=");
		System.out.println(s1+s2+s3+s4);
		
		scan.close();
	}

}
