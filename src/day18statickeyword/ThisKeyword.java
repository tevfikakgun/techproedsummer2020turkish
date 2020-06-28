package day18statickeyword;

public class ThisKeyword {

	
	int x = 12;
	static int y = 13;
	ThisKeyword(int x){
		this();		    // this() ile içinde bulunduðu class daki  parametresiz constructor'u çaðýrýyoruz
						// keranda "parametresiz constructor" yazdýrýr.
						// this() kullanacaksa mutlaka ilk satýra yazýlmalýdýr. yoksa compile time verir.
		
	//	this("ali"); 	// this("ali") ile string parametreli constructor ý çaðýrýr.
		
		this.x=x;		// this kullandýðýmýz zaman içinde bulunduðunmuz clss daki 
						// instance ya da static variable ulaþmak isteriz
						// eþitliðin saðýndaki x parametredeki x dir. solundaki x ise variabledeki x'dir
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
