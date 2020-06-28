package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		//�ki Array in e�it olabilmesi i�in 
		// 1 . elemanlar e�it olmal�
		// 2 . e�it elemanlar�n indexleri de e�it olmal�d�r.
		// {1,2,3} ile {1,2,3} ayn�, {1,2,3} ile {2,1,3} e�it de�ildir.
		// 
		
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		System.out.println(arr1==arr2); // false verir. ��nk� referencelere farkl� buna da bakar. adresler farkl�
		System.out.println(Arrays.equals(arr1, arr2)); // 
		// Arrays.equals(a, a2) methodu sadece de�erlerin ve indexlerin e�itli�in bakar.
	}

}
