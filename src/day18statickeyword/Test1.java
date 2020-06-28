package day18statickeyword;

public class Test1 {
		static int i =1;
	
	public static void main(String[] args) {
		int i = 1;
		for (Test1.i=1; Test1.i<10;Test1.i++) { //static i
			i=i+2; // main metodun içindeki i ( normal i)
					System.out.print(Test1.i+"static olan ");
					System.out.println();
					System.out.print(i+" static olmayan");
		}
	}
 	
}
