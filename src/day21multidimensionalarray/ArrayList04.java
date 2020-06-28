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
    
    // B var m�?  �OK SIK KULLANILIR
    
    // list.contains("B"); list B eleman�n� i�eriyor mu? varsa Tru yoksa False
    
    System.out.println(list.contains("B")); // true
    System.out.println(list.contains("Z")); // yok   FAlse
    
    
    // listteki elemanlar� alfebetik s�raya koyunuz
    
    // Collections==> bir araya getirilmi� par�alar. Kolleksiyon gibi
    // Collections.sort(listin ad�) metodu hepsini alfebetik s�ralar (natural order)
    
    Collections.sort(list); // Collections b�y�k bir class ilerde detay olarak g�rece�iz
    System.out.println(list);// [A, B, C, C]
    
    
    }

}
