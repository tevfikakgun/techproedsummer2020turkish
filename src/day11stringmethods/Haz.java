package day11stringmethods;

public class Haz {

	public static void main(String[] args) {
		String str1= "Cat, caterpillar";
		System.out.println(str1.substring(0));
		System.out.println(str1.substring(4));
		System.out.println(str1.substring(8));
		System.out.println(str1.substring(10));
		System.out.println(str1.substring(15));
		System.out.println(str1.substring(0, 4));
		System.out.println(str1.substring(5, 8));
		System.out.println(str1.substring(6, 10));
		System.out.println(str1.substring(11, 16));
		
		System.out.println(str1.startsWith("c"));
		System.out.println(str1.startsWith("C"));
		System.out.println(str1.startsWith("Cat"));
		System.out.println(str1.startsWith("cat"));
		System.out.println(str1.endsWith("r"));
		System.out.println(str1.endsWith("lar"));
		
		int str2 = 1000;
		int str3 = 750;
		String str4= "1000";
		String str5= "750";
		System.out.println(String.valueOf(str2)+String.valueOf(str3));
		System.out.println(Integer.valueOf(str4)+Integer.valueOf(str5));
		
		
		
		
		
		
	}

}
