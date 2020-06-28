package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterviewWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime veya cumle giriniz"); // Ali Can
		String str = scan.nextLine();
	
		int length = str.length()-1; // Ali Can 
		while(length>=0) {
			System.out.print(str.charAt(length));
			length--;
		}
		scan.close();
	}

}
