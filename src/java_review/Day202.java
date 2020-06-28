package java_review;

public class Day202 {

	public static void main(String[] args) {
		////*** interview question***
	       // Verilen iki deðeri üçüncü bir deðer kullanmadan yerlerini deðiþtiriniz
	       int  x = 50; //=>10
	       int  y  = 10; //=>50
	       
	       System.out.println("---Deðiþiklik öncesi----");
	        System.out.println("1.sayý"+ x);
	        System.out.println("2.sayý"+ y);
	        
	        x = x + y; // 50 + 10 = 60
	        y = x - y; // 60 - 10 = 50
	        x = x - y; // 60 - 50 = 10
	        System.out.println("---Deðiþiklik sonrasý----");
	        System.out.println("1.sayý"+ x);
	        System.out.println("2.sayý"+ y);
	}

}
