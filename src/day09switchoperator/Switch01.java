package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		// A harfini bulunca "ilk harf"
		// B harfini bulunca "ikinci harf"
		// C harfini bulunca "�c�nc� harf"
		// D harfini bulunca "D�rd�nc� harf"
		// di�erleri i�in "bilmiyorum"
		// if else if  ile ve smitch ile yapal�m
		// 2 den fzla else if varsa switch kullanmak laz�mmmmm
		
	//	char harf = 'D';
		
//		if (harf=='A') {
//			System.out.println("�lk harf");
//		}else if (harf=='B') {
//			System.out.println("�kinci harf");
//		}else if (harf=='C') {
//			System.out.println("���nc� harf");
//		}else if (harf=='D') {
//			System.out.println("D�rd�nc� harf");
//		}else {
//			System.out.println("Bilmiyorum");
//		}
		// 2. yol --> SW�TCH
		
		char harf = 'D';
		switch (harf) { // switch de s k���k harf
			case 'A': // : unutmay�n 
				System.out.println("�lk harf");
				break; // break ; yazma unutmayal�m
			case 'B':
				System.out.println("�kinci harf");
				break;
			case 'C':
				System.out.println("���nc� harf");
				break;
			case 'D':
				System.out.println("D�rd�nc� harf");
				break;
			default: // default switch in else sidir. bunu yapmazsak alternatiflerialmaz
				System.out.println("Bilmiyorum");
		}

	}

}
