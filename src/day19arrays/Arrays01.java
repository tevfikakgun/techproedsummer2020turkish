package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// int Array oluturalım
		int arr1 [] = new int [5];
// dat type isim []   new data t  kaç tane variable olacağı 5
		System.out.println(arr1); // böyle yaparsak array in adresini çıktı olarak görürüz [I@4554617c yazdı
								  // arraydeki variableleri çıktısını görmek istersek
								   // arr1[0] yazarsak indeksi 0 olanı yazdırır
		// 00000 array de ki default 5 sıfır
		// 01234 arraydeki indeks
		System.out.println(arr1[0]); // array deki indeksi 0 olan yani ilk elemanı yazdırır.
		System.out.println(arr1[3]); // arraydaki index 3 olan  yani 4. eleman
		
		arr1[0]=12; // array daki indexi = olana 12 atandı
		System.out.println(arr1[0]);
		arr1[1]=14;
		System.out.println(arr1[1]);
		arr1[2]=18;
		System.out.println(arr1[2]);
		arr1[3]=20;
		System.out.println(arr1[3]);
		arr1[4]=22;
		System.out.println(arr1[4]);
		
		// array deki lemanları for döngüsüyle yapın
		//        length 5 olduğu için
		for(int i=0; i<5;i++)
			System.out.println(arr1[i]);
		
		// array de olmayan index e değer ataması yapılırsa run time error alınır
		arr1[5]=23;
		System.out.println(arr1[5]); // run time error verir
		                             // java.lang.ArrayIndexOutOfBoundsException: 5
									// Array index sınırının dışında rakam girdin hatası.
	}

}
