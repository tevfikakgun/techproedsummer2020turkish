package java_review;

public class Day02 {

	public static void main(String[] args) {
		/// verilen iki say�n�n yerlerini de�i�tiriniz
        int num1 = 11; // ==>33
        int num2 = 33;// ==>11
        System.out.println("---De�i�iklik �ncesi----");
        System.out.println("1.say�"+ num1);
        System.out.println("2.say�"+ num2);
        
        // ilk �nce 1. say�y� gecici klas�re koyal�m
        int gecici = num1;
        // 2. say�y� 1. say�ya at�yoruz
        num1 = num2;
        // gecicideki say�y� 2. say�ya e�itliyoruz
        num2 = gecici;
        System.out.println("---De�i�iklik sonras�----");
        System.out.println("1.say�"+ num1);
        System.out.println("2.say�"+ num2);
        
	}

}
