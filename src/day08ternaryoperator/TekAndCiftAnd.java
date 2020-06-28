package day08ternaryoperator;

public class TekAndCiftAnd {

	public static void main(String[] args) {
		
		System.out.println(3<2 && 5>4); // Java ilk önce 3<2 bakar bu yanlýþ olunca 
		                                // && iþaretinden dolayý diðerlerine bakmaz hýzýný arttýrýr
		
		System.out.println(3<2 & 5>4); // Burada 1 tane & var. Java 3<2 ye baktýktan sonra 5>4 de bakar
										// hýzý azalmýþ olur. tavsiye edilen && kullanmak.
										// Bazen karþýmýza & çýkabilir.
		
		
		

	}

}
