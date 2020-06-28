package day06ifstatement;

public class Ifstatement04 {

	public static void main(String[] args) {
		// bir tane String variable ve bir gün ismini hepsi küçük harflerle deðer atayýn
		// Eðer atadýðýnýz deðer hafta içi günlerinden birinin ilk harf ise hafta içi yazdýrýn
		// eðer atadýðýnýz hafta sonu ise Hafta sonu yazdýr.
        
		String day = "carsamba";
		if (day.equals("pazartesi") || day.equals("salý") || day.equals("carsamba") || day.equals("persembe") || day.equals("cuma")) {
			System.out.println("Hafta içi");
		}
		if (day.equals("cumartesi")  || day.equals("pazar")) {
			System.out.println("Hafta sonu");
		}
	}

}
