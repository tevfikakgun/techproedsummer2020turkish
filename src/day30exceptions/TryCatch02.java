package day30exceptions;

public class TryCatch02 {
		static String k;
	public static void main(String[] args) {
		
		String s = "";
		System.out.println(s.length());// null yani hiç  0 çýktýsýný verir
		try {
			s+="t"; // s ye "t" yi ekler
		}catch (Exception e) { // hata olmadýðý için bu bölüm çalýþmaz
			s+="c";
		}finally {
			s+="f"; // her zaman çalýþýr  "t" nin yanýna "f" yazar
		}
		 s+="a";
		 System.out.println(s);
		 
		 String n = null; // null object olarak atanmýþ olur. uzunluðu ölçülemez
		 System.out.println(n.length()); // NullPointerException ( hata ) verir.
		 
		 String m;
//		 System.out.println(m); // exception verir çünkü deðer atamamýz lazým
//		 System.out.println(k); // exception verir çünkü class veriable olsa dahi deðer atamak lazýmdýr
		 
		 
		
	}
}
