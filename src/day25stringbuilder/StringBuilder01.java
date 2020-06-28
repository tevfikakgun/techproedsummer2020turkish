package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// StringBuilder class'ý String üretmeye ve üretilen Stringleri manipule etmeye yarar.
		
		// String class'ý kullanarak String uretirseniz
		// Yaptýðýnýz deðiþiklikler ilk ürettiðiniz String'i etkilemez.
		// deðiþikliðin gerçekleþmesi için atama yapmak zorundasýnýz. 
		// String class'ýný kullanarak ürettiðiniz Stringler atamasýz deðiþtirilemediði için
		// String class'ýna "IMMUTABLE"(deðiþimi yapsýtmayan) denir. 
		
		String str = "Ali";
		str.concat("Can"); // atama yapýlmadý yeni bir object oluþtu str hala "Ali'
		System.out.println(str);// Ali
		str=str.concat("Can"); // atama yapýldý str artýk "AliCan" dýr.
		System.out.println(str); // AliCan
		
		
		StringBuilder strBld = new StringBuilder("Ali"); //StringBuilder class'ýnda Ali stringini ürettik
		strBld.append("Can");
		// append() methodu Strin'e yeni bir String eklemek için kullanýlýr
		// Concatenation yaptý
						
		System.out.println(strBld); // AliCan atama yapmadan deðiþiklik oldu
		
		// StringBuilder class'ýnda yapýnca atama yapmadan deðiþiklik yapýlýr.
		// stringBuilder'lar deðiþimi yansýttýðý için "mutable" denir.
		
		// 2. YOL
		StringBuilder strBld2 = new StringBuilder(); // boþ bir string üretir ""
		strBld2.append("AliCan"); // boþ String e "AliCan" ekledik
		
		// 3.YOL
		
		StringBuilder strBld3 = new StringBuilder(5); // Uzunluðu beþ olan bir string ürettik.
		
		strBld3.append("Ali"); // ilk üç indexe "Ali" gelir
		strBld3.append("Kahraman"); // ilk akla gelen "AliKa" olmasý ama StringBuilder geniþleyebilir
									// "AliKahraman" yazabilir
		System.out.println(strBld3);
		
		
		
	}

}
