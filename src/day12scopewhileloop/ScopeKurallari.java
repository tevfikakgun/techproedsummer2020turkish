package day12scopewhileloop;

public class ScopeKurallari {
	
	// class bir deniz
	// her bir metod bir ada
	// variable balýk
	// adadakiler denizdeki balýklara ulaþabilirler.
	//bu variable'lara "class veriable" yada "Instance veriable" denir.
	
	
	// variable burada da olabilir. ******Mesala int num1=5 bunu hepsi kullanýr
	public static void main(String[] args) { // main metod
		/*
		 *  Scope kelime anlamý kapsam demektir.
		 *  Oluþturduðunuz bir variable i nerelerde kullanabileceðinizi gösterir.
		 */
	}
	// variable burada da olabilir*****Mesala int num1=5 bunu hepsi kullanýr
	
	public void toplama (int num,String str) {  // (int num,String str) parantez içine variable atanmýþ
												// bunlara deðer atanmaz
		System.out.println("Toplama");        
		// XXXXX burada class variable OLMAZ XXXXXX
	}
	
	// variable burada da olabilir***** iMesala int num1=5 bunu hepsi kullanýr
	
	public void carpma () {   // çarpma metod
		int num = 12;         // bu variable'yý carpma metodu kullanabilir ama diðer metodlar bunu kullamaz
							  // Buna Local variable denir
							  // Buna biz deðer atamak zorundayýz
		
		System.out.println("Carpma");	
		
	}
	// variable burada da olabilir	*****Mesala int num1=5 bunu hepsi kullanýr
	
	
	
	// 1.Kural : 
	// class ýn içinde bir veriable oluþturusanýz her bir metod bu veriable ý kullanabilir
	// Class variable'lra deðer atamasý yapmazsak Java onlara default (Java kafasýna göre) deðer verir.
	// Java tüm sayýlara için default olarak 0 deðerini verir.
	
	// 2. Kural:
	// bir metodun içindeki veriable'yi sadece o metod kullanabilir diðer metodlr kullamaz.
	// Örneðin çarpma metodundaki int num= 12; sadece çarpma metodunda kullanýlabilir.
	// Methodun içinde oluþturulan bu veriable'lara "Local Veriable" denir. yerel bir veriable yani.
	// Method içindeki veriableye deðer atamak zorundasýnýz. Java onlara default value atamaz. 
	
	// 3.Kural;
	// Methodlarýn parantezleri içinde oluþturulan variable'lar sadece o methodlarýn Local Veriable'ler
	// gibi sadece o methodlarýn bodyleri içinde kullanýlabilir
	// public void toplama (int num,String str) { }gibi
	// bunlarada Local Variable denir.
	// Ancak Parantezin içindeki variable'lere deðer atama yapýlmaz.bunlar parametredir
	
	// 4. Kural
	// bir variableyi kullanmaya baþlamadan önce tanýmlamalýyýz
	// once num=num+2; sonra int num=12; diyemeyiz.XXXX
	// once int num=12; sonra num=num+2; bu þekilde yapmalýyýz.
	// Yani önce variableyi tanýmla sonra iþlem yap
}
