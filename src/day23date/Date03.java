package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		// time Manipulation (zaman� de�i�tirece�iz
		
		LocalTime time = LocalTime.now();
		// time.now() anl�k zaman
		System.out.println(time); // anl�k saat
		// time.plusHours(hoursToAdd) saat eklemek
		System.out.println(time.plusHours(2)); // 2 saat sonras�
		// time.plusMinutes(minutesToAdd) dakika eklemek
		System.out.println(time.plusMinutes(5)); // 5 dk sonras�
		// time.plusSeconds(secondstoAdd) saniyeyi eklemek 
		System.out.println(time.plusSeconds(45));  // 45 saniye sonras�
		// time.minusHours(hoursToSubtract) saat azaltmak
		System.out.println(time.minusHours(3));  // 3 saat �ncesi
		// time.minusMinutes(minutesToSubtract)  dakika   azaltmak
		System.out.println(time.minusMinutes(15));  // 15 dk �ncesi
		// time.minusSeconds(secondsToSubtract) saniye azaltmak
		System.out.println(time.minusSeconds(30));  // 30 saniye �ncesi
		
		LocalTime time1 = LocalTime.now(); //
		System.out.println(time1);
	}

}
