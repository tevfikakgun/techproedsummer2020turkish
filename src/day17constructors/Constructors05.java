package day17constructors;

public class Constructors05 {

	public static void main(String[] args) {
		
		Constructors04 obj1 = new Constructors04();
		System.out.println(obj1.num1);
		System.out.println(obj1.num2); // num2 static oldu�undan obj kullanarak �a�r�lmas�n� Java istemedi
		System.out.println(Constructors04.num2); // static oldu�unda  class ismiyle ca��rmak iyi oldu
	}

}
