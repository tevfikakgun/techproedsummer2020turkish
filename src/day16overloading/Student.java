package day16overloading;

public class Student {
	String name = "Emily";
	int age = 20;
	
	Student(String name, int age) {
		this.name = name;
		this.age = 22;
		
	}
	
	public static void main(String[] args) {
		
		Student st = new Student("Oliver",21);
		System.out.print(st.name);
		System.out.println(" ," + st.age); // burada age 21 yazmas�n� bekliyoruz ancak
										   // this.age = 22; yazarak sabit bir say� atamas� yapm��
										   // this.age= age; yazsayd� Oliver i�in 21 atam�� olacakt�
		

	}

}
