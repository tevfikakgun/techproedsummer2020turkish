package day31abstraction;

public abstract class Abstractions01 {

	public static void main(String[] args) {
		/*
		 * Abstract classlardan obje �retemez
		 * Constractor'lar� yoktur
		 * Abstract class'lar concrete(body'li) ve abstract(baody'siz) methodlar i�erir
		 * Abstract class'lar� hem concrete class hem de abstract class child leri olabilir
		 * Abstract class'in child'i concrete class ise Abstract class'daki 
		 * 		abstract methodlar� mutlaka override etmeli. 
		 * 		bunu yaparker body ekler ve abstract yaz�s� silinir.
		 * 	Bunun faydas� �udur
		 * 		Per�nt classlarda olup child classlarda mecburen olmas�n� 
		 * 		istedi�iniz �zellikleri abstract yapmak
		 * Abstract class�n childi abstract class ise Abstract classdaki 
		 * herhangi bir �eye override etmek zorunlu de�ildir.
		 * 
		 * 
		 * Abstract methodlar sadece abstract classlar�n i�inde yaz�l�r
		 * Abstract classlar�n body si olur
		 * Abstract methodlar�n bodysi olmaz
		 * 
		 * Concrete methodlar hem concrete hem de abstract class larda olabilir
		 * 
		 * Herhangi  bir parent taraf�ndan override edilen abstract method alttaki concrete child'lar 
		 * taraf�ndan override edilmese de olur.
		 * 
		 * Abstract class'lar final olamaz.
		 * 		Abstract class olu�turman�n sebebi o class daki �zelliklerin child'lar 
		 * 		zorunlu olarak kullan�lmas�yd�. "final" yapman�n manas� da child olmamas�yd�.
		 * 		bu y�zden final ve abstract bir arada olamaz. Compile time error al�n�r.
		 * 
		 * Abstract methodlar finaly olmaz.
		 * 		bir methodun finaly olmas� override edilmez. 
		 * 		Ancak Abstract metodlar� override edip body eklemek zorunday�z.
		 * 
		 * Abstract metodlar privite olmaz.
		 * 		abstract metodlara ula��lmas� i�in haz�rl�yoruz. 
		 * 		Privite olursa ula��lmas�n� engellemi� oluruz.
		 * 
		 */

	}

	public void concereteMethod () {
		System.out.println("Ben cocrete'�m");
	}
	public abstract void abstractMethod();
}
