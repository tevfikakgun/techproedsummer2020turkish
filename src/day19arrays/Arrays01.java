package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// int Array olutural�m
		int arr1 [] = new int [5];
// dat type isim []   new data t  ka� tane variable olaca�� 5
		System.out.println(arr1); // b�yle yaparsak array in adresini ��kt� olarak g�r�r�z [I@4554617c yazd�
								  // arraydeki variableleri ��kt�s�n� g�rmek istersek
								   // arr1[0] yazarsak indeksi 0 olan� yazd�r�r
		// 00000 array de ki default 5 s�f�r
		// 01234 arraydeki indeks
		System.out.println(arr1[0]); // array deki indeksi 0 olan yani ilk eleman� yazd�r�r.
		System.out.println(arr1[3]); // arraydaki index 3 olan  yani 4. eleman
		
		arr1[0]=12; // array daki indexi = olana 12 atand�
		System.out.println(arr1[0]);
		arr1[1]=14;
		System.out.println(arr1[1]);
		arr1[2]=18;
		System.out.println(arr1[2]);
		arr1[3]=20;
		System.out.println(arr1[3]);
		arr1[4]=22;
		System.out.println(arr1[4]);
		
		// array deki lemanlar� for d�ng�s�yle yap�n
		//        length 5 oldu�u i�in
		for(int i=0; i<5;i++)
			System.out.println(arr1[i]);
		
		// array de olmayan index e de�er atamas� yap�l�rsa run time error al�n�r
		arr1[5]=23;
		System.out.println(arr1[5]); // run time error verir
		                             // java.lang.ArrayIndexOutOfBoundsException: 5
									// Array index s�n�r�n�n d���nda rakam girdin hatas�.
	}

}
