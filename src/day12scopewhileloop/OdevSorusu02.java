package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden 
		 veya sonras�ndan ba�lay�p biti� de�erinde veya �ncesinde biten t�m 3 
		 ile b�l�nebilen tamsay�lar� ekrana yazd�r�n.
		 
		 Ornek: 12 ve 20 ==> 12, 15, 18
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int num1 = scan.nextInt();
		System.out.println("Bitis degerini giriniz");
		int num2 = scan.nextInt();
		
		if(num1>num2){
			System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");
		}else {
			
			for(int i=num1; i<=num2; i=i+1) {
				if(i%3==0) {
					System.out.println(i);
				}
			}	
		}
		scan.close();
	}

}
