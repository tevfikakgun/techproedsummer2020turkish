package day17constructors;

public class Constructors01 {
	
	String isim ="Ali Can";
	int yas = 33;
	
	// Method ile Main method ayný class da ise methodu sadece ismini yazarak kullanabilirsiniz.

	public static void main(String[] args) {  
		buyume(33);   	
							
		isimDegistir("Ayse Han");
		

	}
	public static void buyume(int yas) { // yasý bir artýrdýðýmýz method
		yas++;
		System.out.println(yas);
	}
	public static void isimDegistir (String isim) {  // ismi deðiþtirdiðimiz method
		System.out.println(isim);
	}
}
