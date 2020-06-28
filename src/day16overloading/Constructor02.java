package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
		// 1) Baþka bir class'dan ürettiðimiz object ürettiðimiz class'da kullanabiliriz.
		
		// 2) Object'in özelliklerini deðiþtirebiliriz, fakat bu deðiþimi sadece o object ile 
		//    sýnýrlý kalýr. Yeni üretilecek olan objectler bu deðiþimlerden etkilenmez.
		
		// 3) Eger üretilecek her object'in deðiþime uðramýþ olmasýný istiyorsanýz
		//    ilk constructora gitmelisiniz.BU ÖNEMLÝ BÝR ÖZELLÝK
		//    Constructor01 de arabanýn fiyatýný 30000 yaparsak burada 31000 gözükür
		
		Constructor01 hondaAraba01 = new Constructor01();
		System.out.println("Zamlý fiyat: "+(hondaAraba01.price + 1000)); // 21000 
		// Constructor01 classýndan fiyatý aldý ve 1000 ekledi
		System.out.println("Year: "+(hondaAraba01.year-1));
		System.out.println("Make: "+hondaAraba01.make.replace("Honda", "Toyata"));
		System.out.println("Type: "+hondaAraba01.type.replace("Civic", "Corona"));
		
		
		
	}

}
