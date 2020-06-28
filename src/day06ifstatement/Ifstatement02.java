package day06ifstatement;

public class Ifstatement02 {

	public static void main(String[] args) {
		// bir int variable oluşturun ve değer atayın
		// eğer çift sayı ise ekrana çift yazdırın
		// ğer tek sayı ise tek yazdırın.
		
		int num = 73849572; // 12,14,0,17,-23, -23456, 73849572  vererek test etmiş olduk
		if (num%2== 0) {
			System.out.println("Çift"); // çift olması için modulus kullanıp kalan sıfır mı diye bakarız
		}
		if (num%2!=0) {
			System.out.println("Tek"); // num%2!=0 modulus (kalan) 0 a eşit değildir.
		}
		
	}

}
