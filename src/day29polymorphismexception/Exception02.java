package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {

//	public static void main(String[] args) throws FileNotFoundException {
//	FileInputStream file = new FileInputStream("C/ogrenci.txt");
	
	// Chech Exceptions (Compile Tme Eror) handle edebilmek i�in iki yol vard�r.
	// 1. Throws keywordunu kullanma
	// pek kullan�lmaz ��nk� consule hata olarak �ok teknik kelime olur.
	//FileInputStream bilgisayardan dosya almak 
    // i�in kullan�lan bir class d�r
	// �nce birinci FileInputStream import ettik sonra ikinci FileInputStream geliyoruz oradan throws se�iyoruz
	

	}

    // ikinci try-catch block kullanmakt�r. Bunu kullan�rsan�z consule teknik mesajlar yerine
	// kencih yazd���n�z mesajlar� g�rebilirsiniz. Bu y�zden try-catch kullanmak tercih edilir
	class ExceptionTryCatch {
		
		public static void main(String[] args) {
			try {
				FileInputStream file = new FileInputStream("C/ogrenci.txt");
			} catch (FileNotFoundException e) {
				System.out.println("Dosyan�n ad� pathi yanli� veya dosya silinmi� olabilir");
			}	
			
			
		}
	}

