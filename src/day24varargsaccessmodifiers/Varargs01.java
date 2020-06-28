package day24varargsaccessmodifiers;

public class Varargs01 {

	public static void main(String[] args) {
		// Varargs : Variable Arguments demektir
		// Bir method oluþturduðumuzda argüment olarak istediðmiz kadar argüment giebilmemizi saðlar	
		countNum(5); // countNum() ile çaðýrdýk uzunluðu 1 olarak çýktýsý alýnýr
		countNum(5,7,9); // uzunluðu 3 olarak çýktýsý alýnýr
		countNum(5,7,9,11,13,15,17,19,21); // uzunluðu 9 olarak çýktýsý alýnýr
		
		
		sumNums(2,3); // sumNums() ile çaðýrdýk  toplamý verir . Toplamý 5.0
		sumNums(4,5,7,9,11);  // Toplamý 36.0
		sumNums(3,4,7,9,1,13,8,45,78,87); // Toplamý 255.0
		sumNums(2.5,5.67); // Toplamý 8.17
		
		
		printName("Ali");
		
		printName("Ali","Kahraman");
		
		printName("Ali","Can","Kahraman");
	}
	
	
	//                         (int... a) varargs olduðnu ifade eder. a verbialýn adý
    public static void countNum(int... a) {
    	System.out.println(a.length); // a variablýnýn uzunluðu ekrana istiyoruz
    	
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
