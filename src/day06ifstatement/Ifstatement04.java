package day06ifstatement;

public class Ifstatement04 {

	public static void main(String[] args) {
		// bir tane String variable ve bir g�n ismini hepsi k���k harflerle de�er atay�n
		// E�er atad���n�z de�er hafta i�i g�nlerinden birinin ilk harf ise hafta i�i yazd�r�n
		// e�er atad���n�z hafta sonu ise Hafta sonu yazd�r.
        
		String day = "carsamba";
		if (day.equals("pazartesi") || day.equals("sal�") || day.equals("carsamba") || day.equals("persembe") || day.equals("cuma")) {
			System.out.println("Hafta i�i");
		}
		if (day.equals("cumartesi")  || day.equals("pazar")) {
			System.out.println("Hafta sonu");
		}
	}

}
