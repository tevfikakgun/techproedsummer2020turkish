package day19arrays;
		
public class OdevArrays {
//	Bir array’de herhangi iki elemanýn ayný olup olmadýðýný kontrol
//	eden bir program yazýnýz.Ayný eleman varsa “Ayný eleman var” yoksa  “Ayný eleman yok” yazdýrýnýz.
	public static void main(String[] args) {
		int arr [] = {1,3,5,1,5,2,0};
		
		int count = 0;                                   // i(ind) i(deger) j(ind) j(deger) count    out
														//    0      1         1       3      0       yok
		for (int i= 0; i<arr.length; i++ ) {            //    0      1         2       5      0       yok
			for (int j=i+1; j<arr.length; j++) {        //    0      1         3       1      1       var
				if (arr[i]==arr[j]) {					//    arr[i]==arr[j] deðerler eþitlendi
					count++;                            //   j 5 e gidene kadar i=0 olarak kaldý.
					break;								// eðer j 5 olduðunda eþitlik olmazsa i=1 olurdu
		  // arkada iþlemlerin kýsa sürmesi için break kullanýldý
		  // for döngülerinde i, j, k, l þeklinde deðerler veriliyormuþ.
				}
			}
		}

		if (count>0) {
			System.out.println("Ayný eleman var");
		}else {
			System.out.println("Ayný eleman yok");
		}

  }
}
