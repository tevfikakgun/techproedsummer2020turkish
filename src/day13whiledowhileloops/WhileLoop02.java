package day13whiledowhileloops;

public class WhileLoop02 {

	public static void main(String[] args) {
		// ilk 5 sayma say�sn�n �arp�m�n� ekrana yazd�ran
		int num = 1;
		int product = 1;
		while (num<6) {
			product =product * num;
			num++;
		}
		System.out.println(product);

	}

}
