package day33interface;

public interface IcAraba {
	
	int price = 2000; // finallar mavileþir deðiþtiremezsin demektir.
	boolean old = true;
	public abstract void direksiyon();
	public void koltuk ();
	void klima ();
	
	// default keyword kullanýrsak methoda body eklemek zorundayýz
	// aksi takdirde Compile time error verir.
	
	public default void doseme () {
		System.out.println("Interface'de default keyword ile döþeme yaptým");
	}
	
	// static keyword kullanýrsak methoda body eklemek zorundayýz
	// aksi takdirde Compile time error verir.
	
	public static void isitma () {
		System.out.println("Interface'de static keyword ile ýsýtma yaptým");
	}
	// interface ler public ve default olabilir ama 
	// private ya da 
}
