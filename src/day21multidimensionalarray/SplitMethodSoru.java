package day21multidimensionalarray;

public class SplitMethodSoru {

	public static void main(String[] args) {
		// Verilen bir c�mledeki bo�luklar haric character say�s�n� bulunuz.
		
		String str = "Verilen bir c�mledeki bo�luklar haric character say�s�n� bulunuz.";
		str = str.replace(" ", ""); // bo�luklar� kald�rd�k.
		String ch [] = str.split("");
		System.out.println(ch.length);
		
		// 2. yol
		// bo�luk say�s� kelime say�s�ndan bir azd�r.
		String str1 = "Verilen bir c�mledeki bo�luklar haric character say�s�n� bulunuz.";
		String kelime [] = str1.split(" ");
		int boslukSay�s� = kelime.length-1;
		System.out.println(boslukSay�s�);
		String character [] = str1.split("");
		System.out.println(character.length - boslukSay�s�);
		
		String str2 = "Verilen bir c�mledeki bo�luklar haric character say�s�n� bulunuz.";
		String cha [] = str2.split("");
		int count=0;
		for (int i=0 ; i<cha.length; i++) {
			if (cha[i].equals(" ")) {
				count++;
			}
				
		}
		System.out.println(cha.length-count);	
		
		
		

	}

}
