package java_review;

public class Day0203 {

	public static void main(String[] args) {
		//0 ile 1000 aras�nda random bir say� olu�turarak 
		//bu say�n�n rakamlar� toplam�n� veren java algoritma kodunu yaz�n�z ?	
		//random sayi= 185  toplamlar� = 14
		
		

		//int ramdomSayi= (int)(Math.random()*10)+10; // 10 dahil ile 20 dahil de�il aras� de�erler
		        
		// Random random= new Random();
		        
		//  int randomSayi = random.nextInt(1000);
		int ramdomSayi= (int)(Math.random()*1000);// 0 dahil ile 1000 dahil de�il aras� say�
		System.out.println("Random Say�="+ramdomSayi);
		int num1 = ramdomSayi%10; // birler basama��
		int num4 = ramdomSayi/10;
		int num2 = num4%10;
		int num3 = ramdomSayi/100;
		System.out.println("Random girilen say�n�n rakamlar� toplam�="+(num1+num2+num3));
		
//		  int randomSayi = random.nextInt(1000);
//        int randomSayi= (int)(Math.random()*1000);
//        System.out.println("Random say�="+randomSayi);
//        int birler = randomSayi%10; // birler basama��
//    
//         randomSayi= randomSayi/10;
//    
//        int onlar = randomSayi%10; // onlar basama��
//        int yuzler= randomSayi/10; // y�zler basama��
//    
//    System.out.println("Toplamlar�= "+(birler+onlar+yuzler));
		

	}

}
