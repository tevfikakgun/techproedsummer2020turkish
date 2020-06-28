package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		// bu zamana kadar yazdýðýmýz her kodu mainnin içine yazdýk.
		// milyonlarca satýr yazýldýðýndan her kodu main içinde yapmak zorluklar oluþturur
		// bazý metodlarý main metodun dýþýnda oluþturacaðýz
		// main metodun içine onlarý çaðýracaðýz
        
		//       argument () deki ifadelerin adý burada 3 ve 5 var  
		// toplama(3,5); // aþaðýdaki toplama metodunu çaðýrýyoruz. // 8 yazacak
		// carpma();  // çarpmayý çaðýrdýk                       // 15 yazacak
		
		System.out.println(toplama(3,5.2)); // 8.2
		System.out.println(carpma(3,5));
		
		// method parantezinin içindeki variablelere "parametre" denir.
		// method çaðýrýlýrken method parentezinin içine yazýlan deðerlere "argüment" denir.
		// Parametrenin data type ile Argümentin data type eþleþmeli.
		
	}
	//     "static" bir metodu main metodun içinden çaðýrmak için yazmak zorundayýz
    public static double toplama(int num1, double num2) { // toplama metodu  
   //                         parametre: int num1 ve int num2
   // 	System.out.println(3+5); 
    	return num1+num2; // return: num1 ile num2 yi toplayýp sonucu ver
    	
 }
    public static int carpma(int num1,int num2) {
    	//System.out.println(3*5);
    	return num1*num2;
    }
    
}
