package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		// time Manipulation (zamaný deðiþtireceðiz
		
		LocalTime time = LocalTime.now();
		// time.now() anlýk zaman
		System.out.println(time); // anlýk saat
		// time.plusHours(hoursToAdd) saat eklemek
		System.out.println(time.plusHours(2)); // 2 saat sonrasý
		// time.plusMinutes(minutesToAdd) dakika eklemek
		System.out.println(time.plusMinutes(5)); // 5 dk sonrasý
		// time.plusSeconds(secondstoAdd) saniyeyi eklemek 
		System.out.println(time.plusSeconds(45));  // 45 saniye sonrasý
		// time.minusHours(hoursToSubtract) saat azaltmak
		System.out.println(time.minusHours(3));  // 3 saat öncesi
		// time.minusMinutes(minutesToSubtract)  dakika   azaltmak
		System.out.println(time.minusMinutes(15));  // 15 dk öncesi
		// time.minusSeconds(secondsToSubtract) saniye azaltmak
		System.out.println(time.minusSeconds(30));  // 30 saniye öncesi
		
		LocalTime time1 = LocalTime.now(); //
		System.out.println(time1);
	}

}
