package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		// A harfini bulunca "ilk harf"
		// B harfini bulunca "ikinci harf"
		// C harfini bulunca "Ücüncü harf"
		// D harfini bulunca "Dördüncü harf"
		// diðerleri için "bilmiyorum"
		// if else if  ile ve smitch ile yapalým
		// 2 den fzla else if varsa switch kullanmak lazýmmmmm
		
	//	char harf = 'D';
		
//		if (harf=='A') {
//			System.out.println("Ýlk harf");
//		}else if (harf=='B') {
//			System.out.println("Ýkinci harf");
//		}else if (harf=='C') {
//			System.out.println("Üçüncü harf");
//		}else if (harf=='D') {
//			System.out.println("Dördüncü harf");
//		}else {
//			System.out.println("Bilmiyorum");
//		}
		// 2. yol --> SWÝTCH
		
		char harf = 'D';
		switch (harf) { // switch de s küçük harf
			case 'A': // : unutmayýn 
				System.out.println("Ýlk harf");
				break; // break ; yazma unutmayalým
			case 'B':
				System.out.println("Ýkinci harf");
				break;
			case 'C':
				System.out.println("Üçüncü harf");
				break;
			case 'D':
				System.out.println("Dördüncü harf");
				break;
			default: // default switch in else sidir. bunu yapmazsak alternatiflerialmaz
				System.out.println("Bilmiyorum");
		}

	}

}
