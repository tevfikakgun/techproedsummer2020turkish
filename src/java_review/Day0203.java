package java_review;

public class Day0203 {

	public static void main(String[] args) {
		//0 ile 1000 arasýnda random bir sayý oluþturarak 
		//bu sayýnýn rakamlarý toplamýný veren java algoritma kodunu yazýnýz ?	
		//random sayi= 185  toplamlarý = 14
		
		

		//int ramdomSayi= (int)(Math.random()*10)+10; // 10 dahil ile 20 dahil deðil arasý deðerler
		        
		// Random random= new Random();
		        
		//  int randomSayi = random.nextInt(1000);
		int ramdomSayi= (int)(Math.random()*1000);// 0 dahil ile 1000 dahil deðil arasý sayý
		System.out.println("Random Sayý="+ramdomSayi);
		int num1 = ramdomSayi%10; // birler basamaðý
		int num4 = ramdomSayi/10;
		int num2 = num4%10;
		int num3 = ramdomSayi/100;
		System.out.println("Random girilen sayýnýn rakamlarý toplamý="+(num1+num2+num3));
		
//		  int randomSayi = random.nextInt(1000);
//        int randomSayi= (int)(Math.random()*1000);
//        System.out.println("Random sayý="+randomSayi);
//        int birler = randomSayi%10; // birler basamaðý
//    
//         randomSayi= randomSayi/10;
//    
//        int onlar = randomSayi%10; // onlar basamaðý
//        int yuzler= randomSayi/10; // yüzler basamaðý
//    
//    System.out.println("Toplamlarý= "+(birler+onlar+yuzler));
		

	}

}
