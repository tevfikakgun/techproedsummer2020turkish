package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		// while --> iken  demektir.
		// While I go tot school. Ben okula gideriken.
		// While I go to Uskudar, it rained. �skudara gideriken ya�mur ya�d�.
		
		int num = 0;
	// () i�ine �art yaz�l�r
	// num 4 ten k�c�k iken 
		while (num<4) { // parantez i�indeki trueoldu�u s�re While loop �al���r.
			System.out.print("Tevfik ");
			num++; // �NEML� art�rma yapmazsan�z sonsuz d�ng�ye girer program kitlenir.
		}

		System.out.println();
		// while loop kullanarak 1 den 10 kadar tam say�lar� ekraa yazd�r�n�z
		int num1 =1;
		while(num1<=10) {
			System.out.print(num1+ " ");
			num1++;
		}
		// 1 den 20 ye kadar �ift say�lar� yazd�r�n
		System.out.println();
		int num3 = 0;
		while(num3<21) {
			System.out.print(num3+" ");
			num3=num3+2;
		}
		System.out.println();
		int num4 =1;
		while(num4<21) {
			if (num4%2==0) {
				System.out.print(num4+" ");
			}
			num4++;
		}
		
		// whilw loop kullanalarak 5 den 120 ekadar 3 e b�l�nen
		System.out.println();
		int num5= 5;
		while(num5<121) {
			if (num5%3==0) {
				System.out.print(num5+" ");
			}
			num5++;
		}
				
	}

}
