package day19arrays;
		
public class OdevArrays {
//	Bir array�de herhangi iki eleman�n ayn� olup olmad���n� kontrol
//	eden bir program yaz�n�z.Ayn� eleman varsa �Ayn� eleman var� yoksa  �Ayn� eleman yok� yazd�r�n�z.
	public static void main(String[] args) {
		int arr [] = {1,3,5,1,5,2,0};
		
		int count = 0;                                   // i(ind) i(deger) j(ind) j(deger) count    out
														//    0      1         1       3      0       yok
		for (int i= 0; i<arr.length; i++ ) {            //    0      1         2       5      0       yok
			for (int j=i+1; j<arr.length; j++) {        //    0      1         3       1      1       var
				if (arr[i]==arr[j]) {					//    arr[i]==arr[j] de�erler e�itlendi
					count++;                            //   j 5 e gidene kadar i=0 olarak kald�.
					break;								// e�er j 5 oldu�unda e�itlik olmazsa i=1 olurdu
		  // arkada i�lemlerin k�sa s�rmesi i�in break kullan�ld�
		  // for d�ng�lerinde i, j, k, l �eklinde de�erler veriliyormu�.
				}
			}
		}

		if (count>0) {
			System.out.println("Ayn� eleman var");
		}else {
			System.out.println("Ayn� eleman yok");
		}

  }
}
