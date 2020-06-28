package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		//Ýki Array in eþit olabilmesi için 
		// 1 . elemanlar eþit olmalý
		// 2 . eþit elemanlarýn indexleri de eþit olmalýdýr.
		// {1,2,3} ile {1,2,3} ayný, {1,2,3} ile {2,1,3} eþit deðildir.
		// 
		
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		System.out.println(arr1==arr2); // false verir. çünkü referencelere farklý buna da bakar. adresler farklý
		System.out.println(Arrays.equals(arr1, arr2)); // 
		// Arrays.equals(a, a2) methodu sadece deðerlerin ve indexlerin eþitliðin bakar.
	}

}
