package java_review;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = in.nextInt();
        
        
          // Write your code here
        if (input>0) {
          System.out.println("Say� Pozitif");
        }else if (input==0) {
          System.out.println("Say� N�tr");
        }else {
          System.out.println("Say� Negatif");
        }
	    }

	}


