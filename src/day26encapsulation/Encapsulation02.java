package day26encapsulation;

public class Encapsulation02 {
    // pratik getter() ve setter olu�turma
	// private de�erler yaz�ld�ktan sonra
	// sol �stk��ede file  Edit  Source  var
	// orada Generate Getters setter b�l�m�ne k�lla
	// ��kan ekranda kimin geetr ve setter i olu�turulacaksa se�
	// sonra bunlar� en alta yazmas� i�in Last Nember � se�
	
	private char ilkHarf = 'S';
	private double para = 23.75;
	private boolean emekli = false;
	
	//Variable'a atanan degerin degistirilmesini istemiyorsaniz o variable ile 
	//alakali setter() olusturmamalisiniz
	
	//Variable'a atanan degerin okunmasini istemiyorsaniz, o variable ile alakali
	//getter() olusturmamalisiniz.
	
	//Sadece getter() kullanir ve hic setter() kullanmazsaniz, variable degerleri 
	//degistirilemez demektir. Bu tarz class'lara "Immutable Class" denir.
	
	//Sadece setter() kullanir ve hic getter() kullanmazsaniz, variable degerleri 
	//okunamaz demektir.
	
	public static void main(String[] args) {
	Encapsulation01 obj = new Encapsulation01();  // obj olu�turduk
	System.out.println(obj.getKrediKartNo());     // obj. diyerek Encapsulation01 clas�n�n i�indeki de�erler ula�abildik 
	System.out.println(obj.getKimlikNo());
	obj.setKimlikNo("7586904837");  // set ile kimlik num de�i�tirdik
	System.out.println(obj.getKimlikNo()); // bu de�i�iklik bu class da ge�erlidir
											// ba�ka bir classtan obj olu�turulsa
											// kimlik num eski haliyle gelir ��nk� de�i�iklik bu classta yap�ld�
		                                    // ana veri de�i�medi
	
	}

	public char getIlkHarf() {
		return ilkHarf;
	}

	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf = ilkHarf;
	}

	public double getPara() {
		return para;
	}

	public void setPara(double para) {
		this.para = para;
	}

	public boolean isEmekli() {
		return emekli;
	}

	public void setEmekli(boolean emekli) {
		this.emekli = emekli;
	}
	
	
	

	}


