package day14dowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {
		
		// �nce bir i� yapacak sonra d�ng�ye girecek
		
		int num = 1;
		
		do {      // do yap demek num=1 a�a��ya g�nderecek 
			System.out.print(num+ " "); // 1 yazd�racak
			num++; // num 1 art�racak art�k num02 olacak 
			
		}while(num<4) ; // 2<4 oldu�u i�in tekrar "do" ya gidecek ve d�ng� 4 e kadar devam edecek 

		System.out.println();
		// 10 ile 20 aras�ndaki tek tam say�lar� ekrana do while ile yazd�r�n
		
		int num1 =11;
	
		do {
			System.out.print(num1+" ");
			num1=num1+2;
		}while (num1<20);
		
		
	}

}
