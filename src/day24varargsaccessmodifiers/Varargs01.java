package day24varargsaccessmodifiers;

public class Varargs01 {

	public static void main(String[] args) {
		// Varargs : Variable Arguments demektir
		// Bir method olu�turdu�umuzda arg�ment olarak istedi�miz kadar arg�ment giebilmemizi sa�lar	
		countNum(5); // countNum() ile �a��rd�k uzunlu�u 1 olarak ��kt�s� al�n�r
		countNum(5,7,9); // uzunlu�u 3 olarak ��kt�s� al�n�r
		countNum(5,7,9,11,13,15,17,19,21); // uzunlu�u 9 olarak ��kt�s� al�n�r
		
		
		sumNums(2,3); // sumNums() ile �a��rd�k  toplam� verir . Toplam� 5.0
		sumNums(4,5,7,9,11);  // Toplam� 36.0
		sumNums(3,4,7,9,1,13,8,45,78,87); // Toplam� 255.0
		sumNums(2.5,5.67); // Toplam� 8.17
		
		
		printName("Ali");
		
		printName("Ali","Kahraman");
		
		printName("Ali","Can","Kahraman");
	}
	
	
	//                         (int... a) varargs oldu�nu ifade eder. a verbial�n ad�
    public static void countNum(int... a) {
    	System.out.println(a.length); // a variabl�n�n uzunlu�u ekrana istiyoruz
    	
    }
    public static void sumNums(double... b) {
    	double sum = 0;
    	for(double w : b ) {
    		sum = sum + w;
    	}
    	System.out.println(sum);
    }
    public static void printName(String... n) {
    	for(String w : n) {
    		System.out.print(w + " ");
    	}
    	
    }
}
