package day15methodcreation;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullan�c�ya paralelkenar, dikd�rtgen ve ��gen kelimelerinden 
		// birini ve iki say� se�mesini s�yleyin.  
		// Hangi �ekli se�erse, o �eklin alan�n� ve �evresini ekrana yazd�ran program� yaz�n�z.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Paralelkenar, Dikd�rtgen veya ��gen geometrik �ekillerinden birini seciniz");
		String geo = scan.nextLine().toLowerCase();
		System.out.println("�ki say� giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		cevreAlan (geo,num1, num2);
		scan.close();
	}
    public static void cevreAlan (String geo, double num1, double num2) {
    	switch(geo) {
    		case "paralelkenar":
    			System.out.println("Paralelkenar�n �evresi="+ (2*(num1+num2)));
    			System.out.println("Paralelkenar�n Alan�="+ (num1*num2));
    			break;
    		case "dikd�rtgen":
    			System.out.println("Dikd�rtgenin �evresi="+ (2*(num1+num2)));
    			System.out.println("Dikd�rtgenin Alan�="+ (num1*num2));
    			break;
    		case "��gen":
    			System.out.println("��genin �evresi="+ ((num1+num2+num1)));
    			System.out.println("��genin Alan�="+ (num1*num2)/2);
    			break;
    		default:
    			System.out.println("paralelkenar, dikd�rtgen veya ��gen haricinde bir�ey girmeyin");
    	}
    }
}
