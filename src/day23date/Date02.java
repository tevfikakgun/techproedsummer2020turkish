package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// Date Manipulation (Tarih üzerinde deðiþiklikler yapmak)
		
		LocalDate date = LocalDate.now(); // þuanki tarihi date adlý objecte atama yaptýk.
		// date.plusDays(daysToAdd) ile gün ekleyebiriz
		System.out.println(date); // 2020-05-20
		System.out.println(date.plusDays(1)); // 2020-05-21 bir gün ekledik
		System.out.println(date.plusDays(15));  // 2020-06-04 15 gün ekledik
		System.out.println(date.plusDays(300)); // 2021-03-16  300 gün ekledik
		System.out.println(date.plusDays(-1)); // 2020-05-19 1gün çýkarttýk ama kullanýlmaz
		// date.plusMonths(monthsToAdd) ile ay ekleriz
		System.out.println(date.plusMonths(2)); // 2020-07-20 2 ay ekledik
		System.out.println(date.plusMonths(8)); // 2021-01-20 8 ay ekledik
		// date.plusWeeks(weeksToAdd) hafta ekleriz
		System.out.println(date.plusWeeks(8));  // 2020-07-15 8 hafta ekledik
		//date.plusYears(yearsToAdd)
		System.out.println(date.plusYears(5));  // 2025-05-20 5 yýl ekledik
		
		// date.minusDays(daysToSubtract) gün azaltýr
		System.out.println(date.minusDays(5)); //  2020-05-15 5 gün öncesi
		// date.minusMonths(monthsToSubtract)
		System.out.println(date.minusWeeks(8)); // 2020-03-25 8 hafta öcesi
		
		System.out.println(date.minusMonths(3)); // 2020-02-20 3 ay öncesi
		System.out.println(date.minusYears(4));  //  2016-05-20 4 yýl öncesi
		
		// çöpe atýlmadan önce çöplerin toplanýp bir poþete konmasý buna "FÝNALÝZE() " denir
		// poþetlenmiþ çöplern atýlmasýna garbij collective denir
		
		
	}

}
