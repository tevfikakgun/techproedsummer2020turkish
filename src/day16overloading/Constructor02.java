package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
		// 1) Ba�ka bir class'dan �retti�imiz object �retti�imiz class'da kullanabiliriz.
		
		// 2) Object'in �zelliklerini de�i�tirebiliriz, fakat bu de�i�imi sadece o object ile 
		//    s�n�rl� kal�r. Yeni �retilecek olan objectler bu de�i�imlerden etkilenmez.
		
		// 3) Eger �retilecek her object'in de�i�ime u�ram�� olmas�n� istiyorsan�z
		//    ilk constructora gitmelisiniz.BU �NEML� B�R �ZELL�K
		//    Constructor01 de araban�n fiyat�n� 30000 yaparsak burada 31000 g�z�k�r
		
		Constructor01 hondaAraba01 = new Constructor01();
		System.out.println("Zaml� fiyat: "+(hondaAraba01.price + 1000)); // 21000 
		// Constructor01 class�ndan fiyat� ald� ve 1000 ekledi
		System.out.println("Year: "+(hondaAraba01.year-1));
		System.out.println("Make: "+hondaAraba01.make.replace("Honda", "Toyata"));
		System.out.println("Type: "+hondaAraba01.type.replace("Civic", "Corona"));
		
		
		
	}

}
