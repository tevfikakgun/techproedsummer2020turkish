package day12scopewhileloop;

public class ScopeKurallari {
	
	// class bir deniz
	// her bir metod bir ada
	// variable bal�k
	// adadakiler denizdeki bal�klara ula�abilirler.
	//bu variable'lara "class veriable" yada "Instance veriable" denir.
	
	
	// variable burada da olabilir. ******Mesala int num1=5 bunu hepsi kullan�r
	public static void main(String[] args) { // main metod
		/*
		 *  Scope kelime anlam� kapsam demektir.
		 *  Olu�turdu�unuz bir variable i nerelerde kullanabilece�inizi g�sterir.
		 */
	}
	// variable burada da olabilir*****Mesala int num1=5 bunu hepsi kullan�r
	
	public void toplama (int num,String str) {  // (int num,String str) parantez i�ine variable atanm��
												// bunlara de�er atanmaz
		System.out.println("Toplama");        
		// XXXXX burada class variable OLMAZ XXXXXX
	}
	
	// variable burada da olabilir***** iMesala int num1=5 bunu hepsi kullan�r
	
	public void carpma () {   // �arpma metod
		int num = 12;         // bu variable'y� carpma metodu kullanabilir ama di�er metodlar bunu kullamaz
							  // Buna Local variable denir
							  // Buna biz de�er atamak zorunday�z
		
		System.out.println("Carpma");	
		
	}
	// variable burada da olabilir	*****Mesala int num1=5 bunu hepsi kullan�r
	
	
	
	// 1.Kural : 
	// class �n i�inde bir veriable olu�turusan�z her bir metod bu veriable � kullanabilir
	// Class variable'lra de�er atamas� yapmazsak Java onlara default (Java kafas�na g�re) de�er verir.
	// Java t�m say�lara i�in default olarak 0 de�erini verir.
	
	// 2. Kural:
	// bir metodun i�indeki veriable'yi sadece o metod kullanabilir di�er metodlr kullamaz.
	// �rne�in �arpma metodundaki int num= 12; sadece �arpma metodunda kullan�labilir.
	// Methodun i�inde olu�turulan bu veriable'lara "Local Veriable" denir. yerel bir veriable yani.
	// Method i�indeki veriableye de�er atamak zorundas�n�z. Java onlara default value atamaz. 
	
	// 3.Kural;
	// Methodlar�n parantezleri i�inde olu�turulan variable'lar sadece o methodlar�n Local Veriable'ler
	// gibi sadece o methodlar�n bodyleri i�inde kullan�labilir
	// public void toplama (int num,String str) { }gibi
	// bunlarada Local Variable denir.
	// Ancak Parantezin i�indeki variable'lere de�er atama yap�lmaz.bunlar parametredir
	
	// 4. Kural
	// bir variableyi kullanmaya ba�lamadan �nce tan�mlamal�y�z
	// once num=num+2; sonra int num=12; diyemeyiz.XXXX
	// once int num=12; sonra num=num+2; bu �ekilde yapmal�y�z.
	// Yani �nce variableyi tan�mla sonra i�lem yap
}
