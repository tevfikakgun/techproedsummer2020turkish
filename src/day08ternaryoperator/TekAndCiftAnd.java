package day08ternaryoperator;

public class TekAndCiftAnd {

	public static void main(String[] args) {
		
		System.out.println(3<2 && 5>4); // Java ilk �nce 3<2 bakar bu yanl�� olunca 
		                                // && i�aretinden dolay� di�erlerine bakmaz h�z�n� artt�r�r
		
		System.out.println(3<2 & 5>4); // Burada 1 tane & var. Java 3<2 ye bakt�ktan sonra 5>4 de bakar
										// h�z� azalm�� olur. tavsiye edilen && kullanmak.
										// Bazen kar��m�za & ��kabilir.
		
		
		

	}

}
