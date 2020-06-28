package day06ifstatement;

public class Ifstatement01 {

	public static void main(String[] args) {
		
		if (3>2) {
			System.out.println("if body çalýþtý"); // if(3>2) doðru olduðu için "if body çalýþtý" yazýsý okunur.
		}
      // bir int variable oluþturun ve ön bir deðer atayýn.
		// eðer atadýðýnýz deðer pozitifse ekrana pozitif yazdýrýn
		// eðer atadýðýnýz deðer negatif ise ekrana negatif yazdýrýn
		// if () {} bu þekilde olþturulur. () deki þart doðru ise {} arasýndaki ifadeyi okur.
		
		
		int num1 = 0; 
		if (num1>0) {
			System.out.println("Pozitif");
		}
		if (num1<0) {
			System.out.println("Negatif");
		}
		if(num1==0) {
			System.out.println("Nötr");
		}
	}

}
