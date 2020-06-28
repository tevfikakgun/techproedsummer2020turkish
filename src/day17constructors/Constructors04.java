package day17constructors;

public class Constructors04 {

	int num1 = 12;
	static int num2 = 22;
	
	public static void main(String[] args) {
		// static methodlarýn içinde sadece static elemanlar kullanýlabilir
		// num1 static olmadýðýndan main methodun içinde kullanýlamaz
		// num2 static olduðundan main methodun içinde kullanmamýz problem olmaz
		
//		num1++; // Java num1++ ya hata verdi
		num2++;
		
		
		//  ÇOK ÖNEMLÝ
		// static olan veriable'lar  class a baðlýydý. class bir kalýptýr. 
		// static olan veriable'larda bir deðiþiklik yaparsanýz class da bir deðiþiklik yapmýþ olursunuz
		// class a baðlý olan bütün objeler deðiþir.
		// bir fabrikada 1000 iþci var maaþlarýn %10 artmasý örneði
		// static int maas=2000
		
		// zoom da gien kiþi sayacý static yapýlmýþ sayacý herkesi görür.
		// static int sayac= 0;  her giren sayýyý bir attýrýr.
		
		
//		özet
//		kural 1: static ise method ve variable larý class ismiyle cagýrabiliriz
//		kural 2: static medholarda static olmayan variable kullanýlmaz.
//		kural 3: class daki bir variable staticse o variable da yapýlan degisim butun objelerde gecerlidir.(gokdeki ay gibi)


		
		
		
		// static olmayan variable de ise bu durum söz konusu deðildir.
		
		

	}

}
