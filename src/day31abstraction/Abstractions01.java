package day31abstraction;

public abstract class Abstractions01 {

	public static void main(String[] args) {
		/*
		 * Abstract classlardan obje üretemez
		 * Constractor'larý yoktur
		 * Abstract class'lar concrete(body'li) ve abstract(baody'siz) methodlar içerir
		 * Abstract class'larý hem concrete class hem de abstract class child leri olabilir
		 * Abstract class'in child'i concrete class ise Abstract class'daki 
		 * 		abstract methodlarý mutlaka override etmeli. 
		 * 		bunu yaparker body ekler ve abstract yazýsý silinir.
		 * 	Bunun faydasý þudur
		 * 		Perýnt classlarda olup child classlarda mecburen olmasýný 
		 * 		istediðiniz özellikleri abstract yapmak
		 * Abstract classýn childi abstract class ise Abstract classdaki 
		 * herhangi bir þeye override etmek zorunlu deðildir.
		 * 
		 * 
		 * Abstract methodlar sadece abstract classlarýn içinde yazýlýr
		 * Abstract classlarýn body si olur
		 * Abstract methodlarýn bodysi olmaz
		 * 
		 * Concrete methodlar hem concrete hem de abstract class larda olabilir
		 * 
		 * Herhangi  bir parent tarafýndan override edilen abstract method alttaki concrete child'lar 
		 * tarafýndan override edilmese de olur.
		 * 
		 * Abstract class'lar final olamaz.
		 * 		Abstract class oluþturmanýn sebebi o class daki özelliklerin child'lar 
		 * 		zorunlu olarak kullanýlmasýydý. "final" yapmanýn manasý da child olmamasýydý.
		 * 		bu yüzden final ve abstract bir arada olamaz. Compile time error alýnýr.
		 * 
		 * Abstract methodlar finaly olmaz.
		 * 		bir methodun finaly olmasý override edilmez. 
		 * 		Ancak Abstract metodlarý override edip body eklemek zorundayýz.
		 * 
		 * Abstract metodlar privite olmaz.
		 * 		abstract metodlara ulaþýlmasý için hazýrlýyoruz. 
		 * 		Privite olursa ulaþýlmasýný engellemiþ oluruz.
		 * 
		 */

	}

	public void concereteMethod () {
		System.out.println("Ben cocrete'ým");
	}
	public abstract void abstractMethod();
}
