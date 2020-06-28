package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		// [A, C, B, C]
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("C");
    list.add("B");
    list.add("C");
    System.out.println(list);
    
    // B var mý?  ÇOK SIK KULLANILIR
    
    // list.contains("B"); list B elemanýný içeriyor mu? varsa Tru yoksa False
    
    System.out.println(list.contains("B")); // true
    System.out.println(list.contains("Z")); // yok   FAlse
    
    
    // listteki elemanlarý alfebetik sýraya koyunuz
    
    // Collections==> bir araya getirilmiþ parçalar. Kolleksiyon gibi
    // Collections.sort(listin adý) metodu hepsini alfebetik sýralar (natural order)
    
    Collections.sort(list); // Collections büyük bir class ilerde detay olarak göreceðiz
    System.out.println(list);// [A, B, C, C]
    
    
    }

}
