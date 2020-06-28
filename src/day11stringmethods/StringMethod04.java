package day11stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		//valueOf() rakamlarla olu�turulan Stringleri say�ya d�n��t�r�r.
		// b�ylece rakamlarla olu�turulan Stringlerle matematiksel i�lem yapmam�z� sa�lar.
		// valueOf hem Integer wrapper hem de string i�inde var 
		// �nteger wrapper class �n�n i�inde olan valeuOf modeli String� Integer e �evirir.
		// String in i�inde valeuOf methodu Integer � Stringe �evirir.
		
		String paraErkek = "2100";
		String paraKadin = "2000";
		// bu ailenin toplam gelirini bulunuz
		
		System.out.println(Integer.valueOf(paraErkek) + Integer.valueOf(paraKadin));
		
		int maasErkek = 2100;
		int maasKad�n = 2000;
		System.out.println(String.valueOf(maasErkek) + String.valueOf(maasKad�n)); // 21002000

	}

}
