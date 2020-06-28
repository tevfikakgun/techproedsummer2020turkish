package day14dowhileloop;

public class Odev01 {
	    // SORU 1
	public static void main(String[] args) {
		// 9 dan 190 a kadar 7 nin katý olan sayýlarý yazdýrýn
		int num =9;
		do {
			if (num%7==0) {
				System.out.print(num+" ");
			}
			num++;
		}while(num<=190);

	}

}
