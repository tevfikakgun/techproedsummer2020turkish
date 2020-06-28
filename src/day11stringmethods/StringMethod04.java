package day11stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		//valueOf() rakamlarla oluþturulan Stringleri sayýya dönüþtürür.
		// böylece rakamlarla oluþturulan Stringlerle matematiksel iþlem yapmamýzý saðlar.
		// valueOf hem Integer wrapper hem de string içinde var 
		// Ýnteger wrapper class ýnýn içinde olan valeuOf modeli Stringý Integer e çevirir.
		// String in içinde valeuOf methodu Integer ý Stringe çevirir.
		
		String paraErkek = "2100";
		String paraKadin = "2000";
		// bu ailenin toplam gelirini bulunuz
		
		System.out.println(Integer.valueOf(paraErkek) + Integer.valueOf(paraKadin));
		
		int maasErkek = 2100;
		int maasKadýn = 2000;
		System.out.println(String.valueOf(maasErkek) + String.valueOf(maasKadýn)); // 21002000

	}

}
