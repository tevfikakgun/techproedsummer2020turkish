package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// Date Manipulation (Tarih �zerinde de�i�iklikler yapmak)
		
		LocalDate date = LocalDate.now(); // �uanki tarihi date adl� objecte atama yapt�k.
		// date.plusDays(daysToAdd) ile g�n ekleyebiriz
		System.out.println(date); // 2020-05-20
		System.out.println(date.plusDays(1)); // 2020-05-21 bir g�n ekledik
		System.out.println(date.plusDays(15));  // 2020-06-04 15 g�n ekledik
		System.out.println(date.plusDays(300)); // 2021-03-16  300 g�n ekledik
		System.out.println(date.plusDays(-1)); // 2020-05-19 1g�n ��kartt�k ama kullan�lmaz
		// date.plusMonths(monthsToAdd) ile ay ekleriz
		System.out.println(date.plusMonths(2)); // 2020-07-20 2 ay ekledik
		System.out.println(date.plusMonths(8)); // 2021-01-20 8 ay ekledik
		// date.plusWeeks(weeksToAdd) hafta ekleriz
		System.out.println(date.plusWeeks(8));  // 2020-07-15 8 hafta ekledik
		//date.plusYears(yearsToAdd)
		System.out.println(date.plusYears(5));  // 2025-05-20 5 y�l ekledik
		
		// date.minusDays(daysToSubtract) g�n azalt�r
		System.out.println(date.minusDays(5)); //  2020-05-15 5 g�n �ncesi
		// date.minusMonths(monthsToSubtract)
		System.out.println(date.minusWeeks(8)); // 2020-03-25 8 hafta �cesi
		
		System.out.println(date.minusMonths(3)); // 2020-02-20 3 ay �ncesi
		System.out.println(date.minusYears(4));  //  2016-05-20 4 y�l �ncesi
		
		// ��pe at�lmadan �nce ��plerin toplan�p bir po�ete konmas� buna "F�NAL�ZE() " denir
		// po�etlenmi� ��plern at�lmas�na garbij collective denir
		
		
	}

}
