package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		// ilk 4 sayma syýsýnýn çarpýmýný veren for loop
		// 1*2**3*4=24
		
		int product=1; // çarpma=product
		for (int i=1; i<5; i++) {
			product=product*i;
		}
		System.out.println("Sonuç="+product);
		
		// ilk 6 çift sayma sayýsýnýn çarpýmýný veren for loop
		// 2,4,6,8,10,12
		int prod= 1;
		for (int i=2; i<13;i=i+2) {
			prod=prod*i;
		}
		System.out.println("Sonuç2="+prod);
		
		// Matematikte geri sayým yapýp çarmaya faktoryel denir.
		//6!=6*5*4*3*2*1= 720
		
		// 9! hesaplayan for loop
		int prod2=1;
		for(int i=9; i>0; i--) {
			prod2=prod2*i;
		}
		System.out.println("9!="+prod2);
		
	}

}
