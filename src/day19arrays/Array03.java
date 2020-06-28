package day19arrays;

public class Array03 {

	public static void main(String[] args) {
		// Elemanlar� 1,2,3,4,5 olan bir int array olu�turunuz
		// bu array de 3 eleman�n olup olmad���n� kontrol ediniz. 
		// varsa ekrana "3 var"
		// yoksa " 3 yok" yazd�r�n
		
		// Array olu�turup eleman eklemek i�in  1. YOL
//		int arr [] = new int [5];
//		arr [0]=1;
//		arr [1]=2;
//		arr [2]=3;
//		arr [3]=4;
//		arr [4]=5;
		
		// Array olu�turup eleman eklemek i�in  2. YOL  KISA YOL
		
		int arr []= {1,2,3,4,5}; // her bir atamay� tek tek yazmayaya gerek olmadan yaz�ld�
		// �nce 1. elemana bak�l�r 3 m�? de�ilse 2. elema bak�l�r 3 m�?
		// 3. elemana bakar�z 3 m�? 3 ise yazar
		
		int count = 0; // flag (bayrak)
		
		for (int i=0;i<5;i++) {
			if (arr[i]==3) {
				count++;
			} // d�ng� bitti count = 1 oluyor
		}
		if (count>0) { // count=1 oldu�una 3 var yazacak
			System.out.println(count+ " tane 3 var");
		}else {
			System.out.println("3 yok");
		}
	}


}
