package day33interface;

public class BasicHonda extends Araba implements IcAraba, DisAraba {

	// class'lara extends ediliyor interface'lere implements ediliyor
	// interface'ler interface extends yapar
	// ayn� cinsler extends
	// farkl� cinsler implements yapar
	// bir class birdan fazla interface'e implements yapabilir
	
	
	// classlarda multi parents olmamas�n�n sebebi her classtan ayr� ayr� ayn� �zellik varsa child 
	// hangisini sececegine karar veremez ve hata verir.
	
	// Methodlarda
	// interfacelerde multi parents olmas�nda bir problem olmaz ��nk� child istedi birini se�er.
	// ancak burada hepsinin return tayp� ayn� olmal� (hepsi void, hepsi int, hepsi String)
	// ama return tayp� farkl� olursa compile tim error verir.
	
	// veriable ayn� data type
	// interface lerde ayn� data type olup de�erler farkl�ysa kime ulamak istiyorsan�z
	// o interfacesin ad�yla ula�man�z laz�m.(interface'in ismi.variable ad�)
	
	// interface in parenti interface olmal�d�r.
	// interface in i�inde body li method kullanmak isterseniz sadece static ve default yazman�z laz�m
	// 
	
	
	
	public static void main(String[] args) {
		BasicHonda basicHonda = new BasicHonda();
		basicHonda.diesel();
		basicHonda.direksiyon();
		basicHonda.kapi();
		basicHonda.klima();
		basicHonda.koltuk();
		basicHonda.move();
		System.out.println("Dis Araba interface'inden price: "+ DisAraba.price); // iki farkl� yerde price oldu�u i�in 
																				// DisAraba.price  diyerek 
	}
	
	

	@Override
	public void direksiyon() {
		System.out.println("Plastik");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Suni deri");
		
	}

	@Override
	public void klima() {
		System.out.println("Manuel klima");
		
	}

	@Override
	public void move() {
		System.out.println("10 sn de 100 km'lik h�za ula��r");
		
	}

	@Override
	public void kapi() {
		System.out.println("Manuel kapi");
		
	}

}
