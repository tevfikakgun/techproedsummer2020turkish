package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {

//	public static void main(String[] args) throws FileNotFoundException {
//	FileInputStream file = new FileInputStream("C/ogrenci.txt");
	
	// Chech Exceptions (Compile Tme Eror) handle edebilmek için iki yol vardýr.
	// 1. Throws keywordunu kullanma
	// pek kullanýlmaz çünkü consule hata olarak çok teknik kelime olur.
	//FileInputStream bilgisayardan dosya almak 
    // için kullanýlan bir class dýr
	// önce birinci FileInputStream import ettik sonra ikinci FileInputStream geliyoruz oradan throws seçiyoruz
	

	}

    // ikinci try-catch block kullanmaktýr. Bunu kullanýrsanýz consule teknik mesajlar yerine
	// kencih yazdýðýnýz mesajlarý görebilirsiniz. Bu yüzden try-catch kullanmak tercih edilir
	class ExceptionTryCatch {
		
		public static void main(String[] args) {
			try {
				FileInputStream file = new FileInputStream("C/ogrenci.txt");
			} catch (FileNotFoundException e) {
				System.out.println("Dosyanýn adý pathi yanliþ veya dosya silinmiþ olabilir");
			}	
			
			
		}
	}

