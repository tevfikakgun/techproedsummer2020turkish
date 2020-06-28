package day19arrays;

public class Array03 {

	public static void main(String[] args) {
		// Elemanlarý 1,2,3,4,5 olan bir int array oluþturunuz
		// bu array de 3 elemanýn olup olmadýðýný kontrol ediniz. 
		// varsa ekrana "3 var"
		// yoksa " 3 yok" yazdýrýn
		
		// Array oluþturup eleman eklemek için  1. YOL
//		int arr [] = new int [5];
//		arr [0]=1;
//		arr [1]=2;
//		arr [2]=3;
//		arr [3]=4;
//		arr [4]=5;
		
		// Array oluþturup eleman eklemek için  2. YOL  KISA YOL
		
		int arr []= {1,2,3,4,5}; // her bir atamayý tek tek yazmayaya gerek olmadan yazýldý
		// önce 1. elemana bakýlýr 3 mü? deðilse 2. elema bakýlýr 3 mü?
		// 3. elemana bakarýz 3 mü? 3 ise yazar
		
		int count = 0; // flag (bayrak)
		
		for (int i=0;i<5;i++) {
			if (arr[i]==3) {
				count++;
			} // döngü bitti count = 1 oluyor
		}
		if (count>0) { // count=1 olduðuna 3 var yazacak
			System.out.println(count+ " tane 3 var");
		}else {
			System.out.println("3 yok");
		}
	}


}
