package day16overloading;

public class OverLoading02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// carpma(3,5);
	}
	// Not1: Return type deðiþtirmek overloading için yeterli deðildir.
	// Java methodlarýn farklý olup olmadýklarýný anlamak için iki þeye bakar
	// A) Metod ismine    B) parametrelere bakar
	// Method ismi ve parametreler Java için Methodlarýn imzasý gibiidir.
	// Java da method imzasý yerine "method signature" kullanýlýr.
	// Not 2: Access modifier lari (public) deðiþtirmek methodlarý Java açýsýndan farklý hale getirmz
	// Not 3: Body deðiþtirmek methodlarý Java açýsýndan farklý hale getirmz
	
	// NOT 4: siz daha kodu yazarken yani kodu çalýþtýrmadan önce 
	// Java sizi yaptýðýnýz hatalardan dolayý uyarýrsa 
	// bu tip hatalara "Compile Time Error" denir. Compile yazýlan kodlarýn 0101001001010 çevirmeydi
	
	// NOT 5:kodu yazarken herhangi bir hata yok fakat kodu çalýþtýrdýktan sonra 
	// Consale de kýrmýzý hata mesajlarý alýrsanýz 
	// bu hatalara "Run Time Error" denir.
	
	// Not 6: Overloading, Compile Time Error verir.
	
//	public static void carpma(int num1, int num2) {
//		System.out.println(num1*num2);
//	}
//	public static int carpma(int num1, int num2) { // int olunca System.out.println(num1*num1); yazýlmaz
//		                                           // return (num1*num2) yazýlýr.
//		return (num1*num2);        // return tek baþýna yazdýrmaz 
	                               // yazdýrma için return nu syso nu içine koymak lazým
//	}
//	private static void carpma(int num1, int num2) {
//		System.out.println(num1*num1);
//	}
}
