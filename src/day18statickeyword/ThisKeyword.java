package day18statickeyword;

public class ThisKeyword {

	
	int x = 12;
	static int y = 13;
	ThisKeyword(int x){
		this();		    // this() ile i�inde bulundu�u class daki  parametresiz constructor'u �a��r�yoruz
						// keranda "parametresiz constructor" yazd�r�r.
						// this() kullanacaksa mutlaka ilk sat�ra yaz�lmal�d�r. yoksa compile time verir.
		
	//	this("ali"); 	// this("ali") ile string parametreli constructor � �a��r�r.
		
		this.x=x;		// this kulland���m�z zaman i�inde bulundu�unmuz clss daki 
						// instance ya da static variable ula�mak isteriz
						// e�itli�in sa��ndaki x parametredeki x dir. solundaki x ise variabledeki x'dir
		System.out.println("parametreli constructor");
	}
	ThisKeyword() {
		System.out.println("parametresiz constructor");
	}
	
	ThisKeyword(String str) {
		System.out.println("String parametreli constructor");
	}
	
	public static void main(String[] args) {
		ThisKeyword obj1 = new ThisKeyword(15);
		System.out.println(obj1.x);
		ThisKeyword obj2 = new ThisKeyword(15);
		System.out.println(obj2.x);
	}

}
