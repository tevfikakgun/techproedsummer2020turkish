package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// Date formatýný deðiþtirmek 
		LocalDate date = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy"); // dd gün, MMM ay yyyy yýl
				//dtf.format(temporal) ile deðþtirmiþ olduk
		System.out.println(dtf.format(date)); // 20-May-2020
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(dtf1.format(date)); // 20-05-2020
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/M/dd");
		System.out.println(dtf2.format(date)); // 2020/5/20
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yy/M/dd");
		System.out.println(dtf3.format(date)); // 20/5/20
		
		
		
		// Time Formatýný deðiþtirmek
		
		LocalTime time = LocalTime.now();
		
		DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("HH:mm"); // HH 24 saat, mm dakika
		System.out.println(dtf5.format(time)); // 18:05
		DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("hh:mm"); // hh 12 saat
		System.out.println(dtf6.format(time)); // 06.06
		
		// time.now(zone) baþka bir yerin saati
		System.out.println(time.now(ZoneId.of("America/Sao_Paulo")));
		
		
		
		
		
		
		
		
	}

}
