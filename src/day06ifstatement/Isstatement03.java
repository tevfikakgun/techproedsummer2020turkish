package day06ifstatement;

public class Isstatement03 {

	public static void main(String[] args) {
		// bir char variable olu�turun buyuk harf de�er atay�n
		// e�er atanan de�er haftan�n g�nlerinden herhangi birinin ilk harfi ise o g�nler yaz�lmal�
		// e�er atatnan de�er haftan�n g�nlerinden de�ilse b�yle bir g�n yok yazacak
		
		char gun = 'C';
		if (gun=='P') {
			System.out.println("Pazar, Pazartesi, Persembe");	
		}
		if (gun=='S') {
			System.out.println("Sal�");
		}
		if (gun=='C') {
			System.out.println("Carsamaba, Cuma, Cumartesi");
		}
		// P olmamak VEYA S olmamak VEYA C Olmamak   ==> VEYA = || ( alt gr <> i�aretine ba�yoruz)
		// P olmamak VE S olmamak VE C Olmamak  ==> VE = && ( shift 6 ya bas)
		if (gun!= 'P' && gun!= 'C' && gun!= 'S') {
			System.out.println("B�yle bir g�n yok");
		}
		// && i�lemindeki b�t�n condentaionlar�n hepsi true ise sonuc true
		// True && True = True
		// True && False && True = False
		// False && False = False
		
		// VEYA = || i�lemeninde sonucu true almak i�in birinin true olmas� yeterlidir.
		// True || True = True
		// True || False = True
		// False || False = False
		
		
	}

}
