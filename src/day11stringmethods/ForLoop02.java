package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		for (int i=3; i<100; i+=3 ) {
			System.out.print(i+" "); // 3 6 9 12........99
		}
		 System.out.println();
		 
		//ilk 5 sayma say�s�n�n toplam�n� veren prog for loop ile  yaz�n�z 
		// problemi tam anlamal�y�z
		// 1+2=3--> 3+3=6--> 6+4=10-->  10+5=15
		// int sum=0 0+1=1 �nce bu yaz�lmal�    sum topla demek 
		int sum = 0;
		for (int i=1; i<6; i++) { 
			sum = sum + i;	  // i=1 iken sum=1, i=2 iken sum=3, i=3 iken sum=6, i=4 iken sum=10	
		}					  // i=5 ise sum=15 olur
		System.out.println("Toplam="+sum);
		
		// 1,100 e kadar sayma say�lar�n�n toplam�n� veren for loop prog
		
		int sum6= 0;
		for (int i=1; i<101;i++ ) {
			sum6=sum6+i;
		}
		System.out.println("Toplam="+sum6);
		
		
		// 10 dan b�y�k ilk 3 sayma says�
		
		int sum2 = 0;
		for (int i=11; i<14; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("Toplam="+sum2);
		
		// 0 dan 101 e kadar 5 e b�l�nen say�lar�n tamam�n�n toplam�
		
		int sum3 = 0;
		for (int i=0 ; i<100; i=i+5) {
			sum3 = sum3 + i;
		}
			System.out.println("Toplam="+sum3);
			
			
		int sum4 = 0;
		for (int i=21;i<26;i++) {
			sum4=sum4+i;
		}
		System.out.println("Toplam="+sum4);
		
		int num5=1;
		for (int i=1; i<6; i++) {
			num5=num5*i;
		}
		System.out.println("�arpma="+num5);
		
		// ilk 50 sayma
		
		
		
	}
	

}
