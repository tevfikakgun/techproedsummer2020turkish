package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		// while loop kullanarak ilk 5 sayma say�s�n�n toplam�n� ekrana yazd�ran prog
		
		int num = 1;
		int sum = 0;
		while (num<6) {
			sum =sum + num;
			num++;
		}
		System.out.println(sum);
		// en son toplam� g�rmek i�in System.out.println(sum); ifadesini loop d���na yaz�n
		// her ad�mdaki toplam� gormek i�in System.out.println(sum); ifadesi loop i�ine yaz�n
	}

}
