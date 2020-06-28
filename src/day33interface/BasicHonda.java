package day33interface;

public class BasicHonda extends Araba implements IcAraba, DisAraba {

	// class'lara extends ediliyor interface'lere implements ediliyor
	// interface'ler interface extends yapar
	// ayný cinsler extends
	// farklý cinsler implements yapar
	// bir class birdan fazla interface'e implements yapabilir
	
	
	// classlarda multi parents olmamasýnýn sebebi her classtan ayrý ayrý ayný özellik varsa child 
	// hangisini sececegine karar veremez ve hata verir.
	
	// Methodlarda
	// interfacelerde multi parents olmasýnda bir problem olmaz çünkü child istedi birini seçer.
	// ancak burada hepsinin return taypý ayný olmalý (hepsi void, hepsi int, hepsi String)
	// ama return taypý farklý olursa compile tim error verir.
	
	// veriable ayný data type
	// interface lerde ayný data type olup deðerler farklýysa kime ulamak istiyorsanýz
	// o interfacesin adýyla ulaþmanýz lazým.(interface'in ismi.variable adý)
	
	// interface in parenti interface olmalýdýr.
	// interface in içinde body li method kullanmak isterseniz sadece static ve default yazmanýz lazým
	// 
	
	
	
	public static void main(String[] args) {
		BasicHonda basicHonda = new BasicHonda();
		basicHonda.diesel();
		basicHonda.direksiyon();
		basicHonda.kapi();
		basicHonda.klima();
		basicHonda.koltuk();
		basicHonda.move();
		System.out.println("Dis Araba interface'inden price: "+ DisAraba.price); // iki farklý yerde price olduðu için 
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
		System.out.println("10 sn de 100 km'lik hýza ulaþýr");
		
	}

	@Override
	public void kapi() {
		System.out.println("Manuel kapi");
		
	}

}
