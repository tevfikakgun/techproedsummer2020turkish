package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		// bu zamana kadar yazd���m�z her kodu mainnin i�ine yazd�k.
		// milyonlarca sat�r yaz�ld���ndan her kodu main i�inde yapmak zorluklar olu�turur
		// baz� metodlar� main metodun d���nda olu�turaca��z
		// main metodun i�ine onlar� �a��raca��z
        
		//       argument () deki ifadelerin ad� burada 3 ve 5 var  
		// toplama(3,5); // a�a��daki toplama metodunu �a��r�yoruz. // 8 yazacak
		// carpma();  // �arpmay� �a��rd�k                       // 15 yazacak
		
		System.out.println(toplama(3,5.2)); // 8.2
		System.out.println(carpma(3,5));
		
		// method parantezinin i�indeki variablelere "parametre" denir.
		// method �a��r�l�rken method parentezinin i�ine yaz�lan de�erlere "arg�ment" denir.
		// Parametrenin data type ile Arg�mentin data type e�le�meli.
		
	}
	//     "static" bir metodu main metodun i�inden �a��rmak i�in yazmak zorunday�z
    public static double toplama(int num1, double num2) { // toplama metodu  
   //                         parametre: int num1 ve int num2
   // 	System.out.println(3+5); 
    	return num1+num2; // return: num1 ile num2 yi toplay�p sonucu ver
    	
 }
    public static int carpma(int num1,int num2) {
    	//System.out.println(3*5);
    	return num1*num2;
    }
    
}
