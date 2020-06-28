package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("ali");
		list.add("veli");
		list.add("deli");
		list.add("salla");
		System.out.println(list);
		System.out.println(list.size());
		list.add(1, "can");
		System.out.println(list);
		list.add(2, "kelli");
		System.out.println(list);
		list.remove(list.size()-1);
		System.out.println(list);
		list.remove("ali");
		System.out.println(list);
		list.set(1, "telli");
		System.out.println(list);
		System.out.println(list.contains("ali"));
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		list.add("ali");
		list.add("veli");
		list.add("deli");
		list.add("salla");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
