package day17constructors;

public class StaticMember {
	static int x;
	int y;
	StaticMember() {
		x+=2;
		y++;
	}
	static int getScuare() {
		return x*x;
	}
	public static void main(String[] args) {
		
		StaticMember sm1 = new StaticMember();
		StaticMember sm2 = new StaticMember();
		int z = sm1.getScuare();
		System.out.println("-x"+z+"-y"+sm2.y);

	}

}
