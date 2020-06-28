package day38interviewhazirlik;

public class InterviewHazirlik01 {

	/*
	 * 1) Java --->"Platform Independent" programlama dilidir.
	 *    Yani; her hangi bir paltformada yazılan Java kodu diğer platformlarda da çalşır.
	 *    Mesela kodu Mac de yazdınız Windows da çalışır.
	 *    
	 * 2) IDE ---> Integrated Development Environment demektir. Eclips ve IntelliJ piyasada kullanılan
	 *    meşhur iki IDE dir.
	 *    IntelliJ daha yardım severdir. kullanılımı artıyor.
	 *    
	 * 3) Constructor--> Yeni bir object üretilirken Constructor aktive olur ve object'i üretir.
	 * 	  Return type yoktur.
	 * 	  Ismi class ismi ile aynı olmalıdır.
	 *    Object üretmek iin Constructor üretmek zorunda değiliz. Çünkü Java her class için default bir
	 *    constructor üretmiştir.
	 *    Default Constructor'lar parametresizdir
	 *    Biz herhangi bir constructor ürettiğimizde defaultlar yok olur.
	 *    Constructor'lar overload edilebilir.
	 *    Constructor'lar child class'ta kullanılabilir ama override edilemezler.
	 *    
	 * 4) OOP Concept nedir? 
	 *    OOP Concept 
	 *    a. Inheritance 	: parent - child ilişkisi
	 *    b. Encapsulation	: 
	 *    c. Polymorhism 	: overloadin ve ovverriding
	 *    d. Abstarction 	:
	 *    e. Interface 	    :
	 *       içerir.
	 *       
	 * a) Inheritance nedir?
	 *    Parent (super class) - child(sub class) ilişkisidir.
	 *    A class'ı B class'ına extends edilirse, A child, B Parent olur.
	 *    A class'ı B interface'ne implements ederse A child, B Parent olur.
	 *    A interface'i B interface'ına extends ederse A child, B Parent olur.
	 *    Child parent'taki kodların private kullanamaz
	 *    Child parent'taki kodların public ve protected olanları kullanır.
	 *    Resability(tekrar kullanablme), short coding, mainteance(tamir) faydaları vardır.
	 *    
	 * b) Encapsulation nedir?
	 *    Data hiding (data gizleme) demektir. 
	 *    Data lar private yapılarak gizlenir.
	 *    Gizlenen datalar getter() ile okunur,setter() ile update edilir.
	 *    Değiştirilmesini istemediğimiz kodlari koruma altına almak için kullanılır.
	 *    Maintace faydası da vardır.
	 *    Kodun hiç değiştirilmesini istemiyor sadece okunmasını istiyorsanız setter() oluşturmayınız. (Immtable class)
	 *    Kodun ne değiştirilmesini ne de okunmasını istiyosanız o zaman getter() da setter() da oluşturmayınız
	 *    
	 * c) Polymorphis nedir?
	 *    Polymorphism(çoklu yapı) overloading ve overriding'dir.
	 *  
	 * d) Abstraction Class nedir?
	 *    Abstraction Class üretmek için abstract keyword kullanmalıyız.
	 *    Abstraction Class'lardan object üretilemez ( instantiate(görünürlülüğü) yapılamaz)
	 *    Abstraction Class'larda hem abstract hem de concrete methodlar bulunabilir.
	 *    Abstraction methodun olduğu class kesinlikle abstract olmalıdır.
	 *    Abstraction methodlarin (body siz) concrete childler tarafından override 
	 *    edilme zorunluluğu vardır. Concrete'ler override edilmesi de olur.
	 **** Abstraction Class'ı child classların bazı görevleri yapmak zorunda bırakmak için oluştururuz.
	 *
	 * e) Interface nedir?
	 *    Java normalde multipe inheitance'a musaade etmez. Bu yüzden Abstract class kullandığımızda
	 *    multiple interitance kullanmak zorunda kalırız. 
	 *    Bunu Java bize interface kullanma hakkı vererek halletmiştir. 
	 *    Çünkü; interface'lere multiple implements/extends yapılabilir.
	 *    
	 * 5) Overloading nedir?
	 * 	  Method ismi aynı tutularak parametrelerin sayıları,yerleri ve ya data tipleri 
	 *    değiştirilerek methodlar oluşturma işlemine overloading denir.
	 *    Overloading CompileTime'dir yani overloading de yaptığınız hata code yazarken
	 *    belli olur.
	 *    Aynı isme sahip methodlarla farkı işlemler yapabilmek için.
	 *    Mesela substring(4) ve substring(4,7) methodlarının fonksiyonları esasında aaynıdır.
	 *    ikiside bir stringin belli bir bölümünü almaya yarar. Fakat bazı durumlarda bitiş indexini söylemek 
	 *    gerekir bazı durumlarda gerekmez. bunun için ismi değiştirmeden parametreleri deiğiştiririz.
	 *    
	 * 6) Ovverriding nedir?
	 *    Method Signature'a(Method ismi+Parametre) dokunmuyoruz, sadece bodyi değiştiriyoruz.
	 *    Overrindg inheritance olunca olur.
	 *    Aynı method'un farklı kullanımları için overriding gereklidir.
	 *    Animal da ses() methodu var--> Dog() {havlama} --> Cat() {miyavlama}
	 *    Overriding Run Time dir.
	 *  
	 * 7) Array ile ArrayList arasındaki farklar nelerdir?
	 *    Array oluşturulurken uzunluğu belli edilmek zorundadır ve daha sonra uzunluk değiştirilemez
	 *    ArrayList te ise başlangıçta uzunluğu belirtme zorunluluğumuz yok. 
	 *    eleman ekledikçe uzunluk artar, eleman çıkartıldıkça uzunluk azalır.
	 *    
	 * 8) String ile StringBuilder arasındaki fark nedir?
	 * 	  Stringler immutable'dır(değişmez) , StringBuilder'lar(değişebilir) ise mutable'dir
	 *    StringBuilder class'ı daha kullanışlıdır. 
	 *    Bir String'i tersten yazdırmak için reverse() kullanılır.
	 *    
	 *    
	 *    
	 *    
	 */
}
