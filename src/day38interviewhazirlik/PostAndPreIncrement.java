package day38interviewhazirlik;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		int a = 12; // a ya 12atadık
		a = a ++; // a=12 a 12 di sonra artır diyoruz ama ++ sağında bir rakam yok o yüzden 12 diyecek
		System.out.println(a);//12
		
		int b = 22;
		b++;
		System.out.println(b);//23
		
		int c = 32;
		c = ++c;
		System.out.println(c);
				

	}

}
