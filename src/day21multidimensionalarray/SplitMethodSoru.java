package day21multidimensionalarray;

public class SplitMethodSoru {

	public static void main(String[] args) {
		// Verilen bir cümledeki boþluklar haric character sayýsýný bulunuz.
		
		String str = "Verilen bir cümledeki boþluklar haric character sayýsýný bulunuz.";
		str = str.replace(" ", ""); // boþluklarý kaldýrdýk.
		String ch [] = str.split("");
		System.out.println(ch.length);
		
		// 2. yol
		// boþluk sayýsý kelime sayýsýndan bir azdýr.
		String str1 = "Verilen bir cümledeki boþluklar haric character sayýsýný bulunuz.";
		String kelime [] = str1.split(" ");
		int boslukSayýsý = kelime.length-1;
		System.out.println(boslukSayýsý);
		String character [] = str1.split("");
		System.out.println(character.length - boslukSayýsý);
		
		String str2 = "Verilen bir cümledeki boþluklar haric character sayýsýný bulunuz.";
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
