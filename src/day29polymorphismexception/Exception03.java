package day29polymorphismexception;

public class Exception03 {

	public static void main(String[] args) {
		// bölme iþlemi yapan bir program yazalým
		int num1 = 12;
		int num2 = 0;
	//	System.out.println(num1/num2);
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at day29polymorphismexception.Exception03.main(Exception03.java:9) hatasýný verir
		// çözüm için 
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("Sýfýrla bölme olmaz");
		}catch(Exception e) {
			System.out.println("Her exception'ý yakala");
		}
		
		// ArithmeticException Run time Exception dýr. Matematik kurallarýna uymayan bir iþlem 
		// yapýldýðýnda bu exception alýnýr.
		// try dan sonra birden fazla catch kullanýlabilir. birden fazl istisnai durum olabilir.
		// ama üsteki catch aldaki catch in child'ý olmalýdýr. 
		// catch'leri Specificten genele doðru dizmelisiniz
	}

}
