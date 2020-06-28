package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		// while loop kullanarak ilk 5 sayma sayýsýnýn toplamýný ekrana yazdýran prog
		
		int num = 1;
		int sum = 0;
		while (num<6) {
			sum =sum + num;
			num++;
		}
		System.out.println(sum);
		// en son toplamý görmek için System.out.println(sum); ifadesini loop dýþýna yazýn
		// her adýmdaki toplamý gormek için System.out.println(sum); ifadesi loop içine yazýn
	}

}
