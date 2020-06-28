package day29polymorphismexception;

public class Exception03 {

	public static void main(String[] args) {
		// b�lme i�lemi yapan bir program yazal�m
		int num1 = 12;
		int num2 = 0;
	//	System.out.println(num1/num2);
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at day29polymorphismexception.Exception03.main(Exception03.java:9) hatas�n� verir
		// ��z�m i�in 
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("S�f�rla b�lme olmaz");
		}catch(Exception e) {
			System.out.println("Her exception'� yakala");
		}
		
		// ArithmeticException Run time Exception d�r. Matematik kurallar�na uymayan bir i�lem 
		// yap�ld���nda bu exception al�n�r.
		// try dan sonra birden fazla catch kullan�labilir. birden fazl istisnai durum olabilir.
		// ama �steki catch aldaki catch in child'� olmal�d�r. 
		// catch'leri Specificten genele do�ru dizmelisiniz
	}

}
