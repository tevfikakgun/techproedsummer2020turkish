package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 0;
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) { 
			System.out.println("Sýfýr ile bölme yapýlamaz");
		}finally {
			System.out.println("Aferin sana");
		}
		// istediðimiz kadar catch kullabiliriz ama üsteki catch alttakinin child ý olmalýdýr
		// catch den sonra istenirse finally {} yazýlabilir.
		// finally block oluþturursanýz hata olsada olmasa da her zaman çalýþýr.
		// try-catch den sonra yazýlýr
		
		
		//ÝNTERVÝEW
		// Final, finally, finalize keywordlarýnýn farký nedir?
		/*
		 * 1. finally{} try-catch blocktan sonra kullanýlýr. Exception olsada olmasada çalýþýr.
		 * 
		 * 2. final  veriablelarda final kullanýlýrsa o veriablenin deðeri deðiþtirilemez
		 *    Mesela pi sayýsýnýn deðiþtirilmesini istemiyorsanýz final yapýlýr ve deðer deðiþtirilemez.
		 *    final pi = 3.14; gibi
		 *    
		 *    Methodlarda final kullanýlýrsa o metodun badi kýsmý deðiþmez.Dolayýsýyla overriding yapýlamaz
		 *    
		 *    Classlarda final kullanýlýrsa o class extend edilemez. 
		 *    public class Animal { }
		 *    public class Dog extend Animal { } olabilir.
		 *    puclic class final Animal { } yazýlýrsa bu Animal sýn child classlarý olmaz.
		 *    
		 *     
		 * 3. finalize () bir methoddur. 
		 * 	  Garbage Collector sürekli çalýþýr ve temizlik yapar. 
		 * 	  Garbage Collector bir þeyi silmeden önce onun  
		 *    finalize() edilip edilmediðine bakar. finallize edilmiþleri siler.
		 */
		
	}
}
