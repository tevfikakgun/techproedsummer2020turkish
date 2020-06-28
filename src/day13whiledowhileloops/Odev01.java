package day13whiledowhileloops;

public class Odev01 {

	public static void main(String[] args) {
		// 8 den 180 e kadar 5 in kati olan tum tamsayýlarý ekrana yazdýrýnýz.
		
		for (int i=8; i<181; i++) {
			if (i%5==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		int num =8;
		while (num<181) {
			if (num%5==0) {
				System.out.print(num+" ");
			}
			num++;
		}
	}

}
