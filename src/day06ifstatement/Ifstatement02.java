package day06ifstatement;

public class Ifstatement02 {

	public static void main(String[] args) {
		// bir int variable olu�turun ve de�er atay�n
		// e�er �ift say� ise ekrana �ift yazd�r�n
		// �er tek say� ise tek yazd�r�n.
		
		int num = 73849572; // 12,14,0,17,-23, -23456, 73849572  vererek test etmi� olduk
		if (num%2== 0) {
			System.out.println("�ift"); // �ift olmas� i�in modulus kullan�p kalan s�f�r m� diye bakar�z
		}
		if (num%2!=0) {
			System.out.println("Tek"); // num%2!=0 modulus (kalan) 0 a e�it de�ildir.
		}
		
	}

}
