package day04operators;

public class Modulus01 {

	public static void main(String[] args) {
		// 12835 sayýsýnýn23 e bolumunden kalaný bulan prog
		
	System.out.println(12835%23); // Hard Coding = kodun içinde doðrudan sayý kullanmak. Ýyi deðildir.
	
	// variable kullanýrsak rakamlarý deðiþtirmek daha hýzlý olacaktýr.
	// o yuzden    int sayi1 = 12835  yazarýz...
	
	int sayi1 = 12835;
	int sayi2 = 23;
	// int sonuc = sayi1&sayi2 gibi bir veriable oluþturulacaksa sonucu çokca kullanmak gerekir. 
	// eðer bir kez kullanýlacaksa   System.out.println(sayi1 % sayi2); yazmak daha iyi.
	System.out.println(sayi1 % sayi2);
	System.out.println(sayi1 + sayi2);
	System.out.println(sayi1 - sayi2);
	System.out.println(sayi1 * sayi2);
	System.out.println(sayi1 / sayi2);
	

		
		

	}

}
