package day30exceptions;

public class TryCatch02 {
		static String k;
	public static void main(String[] args) {
		
		String s = "";
		System.out.println(s.length());// null yani hi�  0 ��kt�s�n� verir
		try {
			s+="t"; // s ye "t" yi ekler
		}catch (Exception e) { // hata olmad��� i�in bu b�l�m �al��maz
			s+="c";
		}finally {
			s+="f"; // her zaman �al���r  "t" nin yan�na "f" yazar
		}
		 s+="a";
		 System.out.println(s);
		 
		 String n = null; // null object olarak atanm�� olur. uzunlu�u �l��lemez
		 System.out.println(n.length()); // NullPointerException ( hata ) verir.
		 
		 String m;
//		 System.out.println(m); // exception verir ��nk� de�er atamam�z laz�m
//		 System.out.println(k); // exception verir ��nk� class veriable olsa dahi de�er atamak laz�md�r
		 
		 
		
	}
}
