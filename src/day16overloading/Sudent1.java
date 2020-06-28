package day16overloading;

public class Sudent1 {

	String name;
	int age;
	String phone;
	
	Sudent1(){
		
	}
	Sudent1(String name, int age, String phone){
		this.phone=phone;
		this.name=name;
	}
	
	
	public static void main(String[] args) {
		Sudent1 s1 = new Sudent1();
		Sudent1 s2 = new Sudent1("John", 25, "029-998877");
		System.out.println(s2.name+", "+s2.age+", "+s2.phone);
		

	}

}
