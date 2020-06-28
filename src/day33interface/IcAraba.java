package day33interface;

public interface IcAraba {
	
	int price = 2000; // finallar mavile�ir de�i�tiremezsin demektir.
	boolean old = true;
	public abstract void direksiyon();
	public void koltuk ();
	void klima ();
	
	// default keyword kullan�rsak methoda body eklemek zorunday�z
	// aksi takdirde Compile time error verir.
	
	public default void doseme () {
		System.out.println("Interface'de default keyword ile d��eme yapt�m");
	}
	
	// static keyword kullan�rsak methoda body eklemek zorunday�z
	// aksi takdirde Compile time error verir.
	
	public static void isitma () {
		System.out.println("Interface'de static keyword ile �s�tma yapt�m");
	}
	// interface ler public ve default olabilir ama 
	// private ya da 
}
