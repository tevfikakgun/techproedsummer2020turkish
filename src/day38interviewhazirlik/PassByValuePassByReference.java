package day38interviewhazirlik;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		// bir methoda variable yolladığında Java o variablenın kopyasını oluşturur ve 
		// methoda kopyayı yollar bu yüzden variablenin orjinal değeri
		// method çaliştıktan sonrada aynı kalır.
		// Pass by Value denir.
		// Java Pass by Reference' yi kullanmaz. Burada orjinalide değişir.
		// Pass by Reference'da referencenin kopyası oluşturulup methoda gönderilir.
		// fakat reference nin kopyası da kendisigibi aynı objecti gösterdiği için 
		// orjinal değer değişir. (Hazinenin haritası da fotokopiside hazineyi göterir)
		
		int x = 12;
		System.out.println(increment(x));
		System.out.println(x);
		
	}
	public static int increment(int a) {
		a= a+1;
		return a;
	}
}
