package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// StringBuilder class'� String �retmeye ve �retilen Stringleri manipule etmeye yarar.
		
		// String class'� kullanarak String uretirseniz
		// Yapt���n�z de�i�iklikler ilk �retti�iniz String'i etkilemez.
		// de�i�ikli�in ger�ekle�mesi i�in atama yapmak zorundas�n�z. 
		// String class'�n� kullanarak �retti�iniz Stringler atamas�z de�i�tirilemedi�i i�in
		// String class'�na "IMMUTABLE"(de�i�imi yaps�tmayan) denir. 
		
		String str = "Ali";
		str.concat("Can"); // atama yap�lmad� yeni bir object olu�tu str hala "Ali'
		System.out.println(str);// Ali
		str=str.concat("Can"); // atama yap�ld� str art�k "AliCan" d�r.
		System.out.println(str); // AliCan
		
		
		StringBuilder strBld = new StringBuilder("Ali"); //StringBuilder class'�nda Ali stringini �rettik
		strBld.append("Can");
		// append() methodu Strin'e yeni bir String eklemek i�in kullan�l�r
		// Concatenation yapt�
						
		System.out.println(strBld); // AliCan atama yapmadan de�i�iklik oldu
		
		// StringBuilder class'�nda yap�nca atama yapmadan de�i�iklik yap�l�r.
		// stringBuilder'lar de�i�imi yans�tt��� i�in "mutable" denir.
		
		// 2. YOL
		StringBuilder strBld2 = new StringBuilder(); // bo� bir string �retir ""
		strBld2.append("AliCan"); // bo� String e "AliCan" ekledik
		
		// 3.YOL
		
		StringBuilder strBld3 = new StringBuilder(5); // Uzunlu�u be� olan bir string �rettik.
		
		strBld3.append("Ali"); // ilk �� indexe "Ali" gelir
		strBld3.append("Kahraman"); // ilk akla gelen "AliKa" olmas� ama StringBuilder geni�leyebilir
									// "AliKahraman" yazabilir
		System.out.println(strBld3);
		
		
		
	}

}
