package day03operators;

public class Operators01 {

	public static void main(String[] args) {
		int i1 = 12;
		int i2 = 13;
		int i3 = 14;
		int i4 = 15;
		System.out.println(i1 + i2*i3);  // iþlem önceliði önemli
										// öncelik 1. parantez içi 2. çarpma ve bölmeler önce soldaki
										// 3. toplama ve çýkartma öncelik soldaki
		System.out.println(i1*i2 + i3*i4); // 12*13= 156 sonra 14*15=210 sonra 156+210=366
		System.out.println((i1+i2)/i4);
		System.out.println(i4*(i2+i1/3));
		System.out.println((i3-i1)*(i4-i2)+(i4/(i3-i2)));
		
		int sayi1= 5; // int tam sayý burada java int/int görünce sonucu tam sayý isteniyor diye 
		int sayi2=2;  // düþünür sonucu 2 yapar. doubleye atandýðý için 2.0 verir.
	
		double sonuc = sayi1/sayi2;
		System.out.println(sonuc);
		

	}

}
