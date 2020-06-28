package day26encapsulation;

public class Encapsulation02 {
    // pratik getter() ve setter oluþturma
	// private deðerler yazýldýktan sonra
	// sol üstköþede file  Edit  Source  var
	// orada Generate Getters setter bölümüne kýlla
	// çýkan ekranda kimin geetr ve setter i oluþturulacaksa seç
	// sonra bunlarý en alta yazmasý için Last Nember ý seç
	
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
	Encapsulation01 obj = new Encapsulation01();  // obj oluþturduk
	System.out.println(obj.getKrediKartNo());     // obj. diyerek Encapsulation01 clasýnýn içindeki deðerler ulaþabildik 
	System.out.println(obj.getKimlikNo());
	obj.setKimlikNo("7586904837");  // set ile kimlik num deðiþtirdik
	System.out.println(obj.getKimlikNo()); // bu deðiþiklik bu class da geçerlidir
											// baþka bir classtan obj oluþturulsa
											// kimlik num eski haliyle gelir çünkü deðiþiklik bu classta yapýldý
		                                    // ana veri deðiþmedi
	
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


