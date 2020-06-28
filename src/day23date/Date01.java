package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// Java da date (tarih) classý vardýr
		// bugünün tarihi ekrana yazdýralým
		System.out.println(LocalDate.now());  // LocalDate.now()  TARÝH için kullanýlýr
											  // kullanýlan bilgisayardan alýyor
		// saat dakika saniye ve saniseyazdýralým
		System.out.println(LocalTime.now());  // LocalTime.now()  SAAT  için kullanýlýr
		
		// tarih ve saat ekrana yazdýralým
		System.out.println(LocalDateTime.now()); // 2020-05-20T17:03:25.684
												 // tarih ve saat arasýna T yazýyor java

	}

}
