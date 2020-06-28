package day14dowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {
		
		// önce bir iþ yapacak sonra döngüye girecek
		
		int num = 1;
		
		do {      // do yap demek num=1 aþaðýya gönderecek 
			System.out.print(num+ " "); // 1 yazdýracak
			num++; // num 1 artýracak artýk num02 olacak 
			
		}while(num<4) ; // 2<4 olduðu için tekrar "do" ya gidecek ve döngü 4 e kadar devam edecek 

		System.out.println();
		// 10 ile 20 arasýndaki tek tam sayýlarý ekrana do while ile yazdýrýn
		
		int num1 =11;
	
		do {
			System.out.print(num1+" ");
			num1=num1+2;
		}while (num1<20);
		
		
	}

}
