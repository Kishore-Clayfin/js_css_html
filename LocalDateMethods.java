package taskPrograms;

import java.time.LocalDate;

public class LocalDateMethods 
{
	public static void main(String[] args) 
	{
		LocalDate today = LocalDate.now();
		System.out.println(today);// 2022-08-23
		System.out.println(today.getDayOfMonth());// 23
		System.out.println(today.getDayOfWeek());// TUESDAY
		System.out.println(today.getDayOfYear());// 235
		System.out.println(today.getMonth());// AUGUST
		System.out.println(today.getMonthValue());// 8
		System.out.println(today.getYear());// 2022
		System.out.println(today.minusYears(1));//2021-08-23
		
		LocalDate dt1 = LocalDate.parse("2018-11-27");
		
		LocalDate dt2 = LocalDate.of(2022,8,23);
		
		System.out.println(dt2);//2022-08-23
		System.out.println(today.isAfter(dt1));//true
		System.out.println(today.isBefore(dt1));//false
		System.out.println(today.isEqual(dt1));//false
		System.out.println(today.isLeapYear());//false
		
		
		System.out.println(today.plusMonths(2));//2022-10-23
		System.out.println(today.plusDays(10));//2022-09-02
		System.out.println(today.plusYears(1));//2023-08-23

	}
}
