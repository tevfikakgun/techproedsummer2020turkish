package java_review;

public class Day202 {

	public static void main(String[] args) {
		////*** interview question***
	       // Verilen iki de�eri ���nc� bir de�er kullanmadan yerlerini de�i�tiriniz
	       int  x = 50; //=>10
	       int  y  = 10; //=>50
	       
	       System.out.println("---De�i�iklik �ncesi----");
	        System.out.println("1.say�"+ x);
	        System.out.println("2.say�"+ y);
	        
	        x = x + y; // 50 + 10 = 60
	        y = x - y; // 60 - 10 = 50
	        x = x - y; // 60 - 50 = 10
	        System.out.println("---De�i�iklik sonras�----");
	        System.out.println("1.say�"+ x);
	        System.out.println("2.say�"+ y);
	}

}
