package day17constructors;

public class Constructors04 {

	int num1 = 12;
	static int num2 = 22;
	
	public static void main(String[] args) {
		// static methodlar�n i�inde sadece static elemanlar kullan�labilir
		// num1 static olmad���ndan main methodun i�inde kullan�lamaz
		// num2 static oldu�undan main methodun i�inde kullanmam�z problem olmaz
		
//		num1++; // Java num1++ ya hata verdi
		num2++;
		
		
		//  �OK �NEML�
		// static olan veriable'lar  class a ba�l�yd�. class bir kal�pt�r. 
		// static olan veriable'larda bir de�i�iklik yaparsan�z class da bir de�i�iklik yapm�� olursunuz
		// class a ba�l� olan b�t�n objeler de�i�ir.
		// bir fabrikada 1000 i�ci var maa�lar�n %10 artmas� �rne�i
		// static int maas=2000
		
		// zoom da gien ki�i sayac� static yap�lm�� sayac� herkesi g�r�r.
		// static int sayac= 0;  her giren say�y� bir att�r�r.
		
		
//		�zet
//		kural 1: static ise method ve variable lar� class ismiyle cag�rabiliriz
//		kural 2: static medholarda static olmayan variable kullan�lmaz.
//		kural 3: class daki bir variable staticse o variable da yap�lan degisim butun objelerde gecerlidir.(gokdeki ay gibi)


		
		
		
		// static olmayan variable de ise bu durum s�z konusu de�ildir.
		
		

	}

}
