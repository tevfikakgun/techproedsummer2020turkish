package day06ifstatement;

public class Isstatement03 {

	public static void main(String[] args) {
		// bir char variable oluþturun buyuk harf deðer atayýn
		// eðer atanan deðer haftanýn günlerinden herhangi birinin ilk harfi ise o günler yazýlmalý
		// eðer atatnan deðer haftanýn günlerinden deðilse böyle bir gün yok yazacak
		
		char gun = 'C';
		if (gun=='P') {
			System.out.println("Pazar, Pazartesi, Persembe");	
		}
		if (gun=='S') {
			System.out.println("Salý");
		}
		if (gun=='C') {
			System.out.println("Carsamaba, Cuma, Cumartesi");
		}
		// P olmamak VEYA S olmamak VEYA C Olmamak   ==> VEYA = || ( alt gr <> iþaretine baýyoruz)
		// P olmamak VE S olmamak VE C Olmamak  ==> VE = && ( shift 6 ya bas)
		if (gun!= 'P' && gun!= 'C' && gun!= 'S') {
			System.out.println("Böyle bir gün yok");
		}
		// && iþlemindeki bütün condentaionlarýn hepsi true ise sonuc true
		// True && True = True
		// True && False && True = False
		// False && False = False
		
		// VEYA = || iþlemeninde sonucu true almak için birinin true olmasý yeterlidir.
		// True || True = True
		// True || False = True
		// False || False = False
		
		
	}

}
