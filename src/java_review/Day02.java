package java_review;

public class Day02 {

	public static void main(String[] args) {
		/// verilen iki sayýnýn yerlerini deðiþtiriniz
        int num1 = 11; // ==>33
        int num2 = 33;// ==>11
        System.out.println("---Deðiþiklik öncesi----");
        System.out.println("1.sayý"+ num1);
        System.out.println("2.sayý"+ num2);
        
        // ilk önce 1. sayýyý gecici klasöre koyalým
        int gecici = num1;
        // 2. sayýyý 1. sayýya atýyoruz
        num1 = num2;
        // gecicideki sayýyý 2. sayýya eþitliyoruz
        num2 = gecici;
        System.out.println("---Deðiþiklik sonrasý----");
        System.out.println("1.sayý"+ num1);
        System.out.println("2.sayý"+ num2);
        
	}

}
