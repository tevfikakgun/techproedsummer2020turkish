package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// Java da date (tarih) class� vard�r
		// bug�n�n tarihi ekrana yazd�ral�m
		System.out.println(LocalDate.now());  // LocalDate.now()  TAR�H i�in kullan�l�r
											  // kullan�lan bilgisayardan al�yor
		// saat dakika saniye ve saniseyazd�ral�m
		System.out.println(LocalTime.now());  // LocalTime.now()  SAAT  i�in kullan�l�r
		
		// tarih ve saat ekrana yazd�ral�m
		System.out.println(LocalDateTime.now()); // 2020-05-20T17:03:25.684
												 // tarih ve saat aras�na T yaz�yor java

	}

}
