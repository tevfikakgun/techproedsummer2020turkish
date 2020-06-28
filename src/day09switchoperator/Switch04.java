package day09switchoperator;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		// Kullan�c�dan notunu al�n ve a�a��daki kurallara g�re ekrana A, B, C veya D yazd�r�n.
		//1. 0 ile  50 den az - D     
		//2. 50(dahil) ile 60 aras� - C       
		//3. 60(dahil) ile 80 aras� - B.     
		//4. 80(dahil) ustu- A
		
		// switch de long, double ve boolean kullan�lmaz.
		// switch de int, byte,short,char, String kullan�l�r
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Notunuzu giriniz");
		int not = scan.nextInt();
		// switch() de case ifadesinden sonra sadece bir de�er yazabilirsiniz
		// i�lem yapamazs�n�z.
		
		if (not>=0 && not<50) {
			not=0;
		}else if (not>=50 && not<60) {
			not=50;
		}else if (not>=60 && not<80) {
			not=60;
		}else if (not>=80 && not<=100) {
			not=80;
		}
		
		switch(not) {
		    case 0:
		    	System.out.println("D");
		    	break;
		    case 50:
		    	System.out.println("C");
		    	break;
		    case 60:
		    	System.out.println("B");
		    	break;
		    case 80:
		    	System.out.println("A");
		    	break;
		    default:
		    	System.out.println("Ge�erli not girin");
		    	break;
		    	
		}
		scan.close();

	}

}
