package day06ifstatement;

public class Ifstatement01 {

	public static void main(String[] args) {
		
		if (3>2) {
			System.out.println("if body �al��t�"); // if(3>2) do�ru oldu�u i�in "if body �al��t�" yaz�s� okunur.
		}
      // bir int variable olu�turun ve �n bir de�er atay�n.
		// e�er atad���n�z de�er pozitifse ekrana pozitif yazd�r�n
		// e�er atad���n�z de�er negatif ise ekrana negatif yazd�r�n
		// if () {} bu �ekilde ol�turulur. () deki �art do�ru ise {} aras�ndaki ifadeyi okur.
		
		
		int num1 = 0; 
		if (num1>0) {
			System.out.println("Pozitif");
		}
		if (num1<0) {
			System.out.println("Negatif");
		}
		if(num1==0) {
			System.out.println("N�tr");
		}
	}

}
