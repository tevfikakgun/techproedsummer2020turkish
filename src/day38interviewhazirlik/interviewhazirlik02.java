package day38interviewhazirlik;

public class interviewhazirlik02 {

	/*
	 * 9) Access modifier nedir açıklar mısınız?
	 *    Bir class'a variable'a veya method'a ulaşımı duzenler
	 *    4 tane access modifier vardır
	 *       a. Public : Herkes ulaşabilir
	 *       b. Protected : Aynı package içinden ve farklı package'lerdeki child class'lardan
	 *       ulaşılabilir.
	 *       c. Default : (Package Private) Sadece aynı package'den ulaşılabilir.
	 *       d. Private : Sadece class içinde ulaşılabilir.
	 *       
	 * 10) Pass by Value ve Pass by Reference ne demektir?
	 *  bir methoda variable yolladığında Java o variablenın kopyasını oluşturur ve 
	    methoda kopyayı yollar bu yüzden variablenin orjinal değeri
		method çaliştıktan sonrada aynı kalır.
		Pass by Value denir.
		Java Pass by Reference' yi kullanmaz. Burada orjinalide değişir.
		Pass by Reference'da referencenin kopyası oluşturulup methoda gönderilir.
		fakat reference nin kopyası da kendisigibi aynı objecti gösterdiği için 
		orjinal değer değişir. (Hazinenin haritası da fotokopiside hazineyi göterir)
	 */
	/*
	 * 11)Abstract class ile Interface  class farkları nedir?
	 *    Abstract class'lar multıble interitance'a musaade etmez, Interface'ler eder
	 *    
	 *    Interface'de abstract metodlar olur concrete metodlar static ve default keyword leriyle oluşturulur
	 *    Halbuki abstract classlarda normal concrete methodlar bulunabilir
	 *    
	 *    Interface'lerin variableleri public static final olmak zorundadır
	 *    ve intelize edilmelidir. 
	 *    Halbuki abstract classlarda bu zorunlulukların hiçbirisi yoktur.
	 *    
	 *    Bir ınterfacein parentı class olamaz, childi class da olur interface olur.
	 *    ama abstractların childı da parentıda hem abstract class hem de concrete class olur.
	 *    
	 *    
	 */
	
	
}
