package step01.api;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ex03JavaTime {

	public static void main(String[] args) {
		// 객체 생성
		// 1) now()
		LocalDate dateNow = LocalDate.now();
		LocalTime timeNow = LocalTime.now();
//		System.out.println(timeNow);
		
		// 2) of()
		LocalDate dateOf = LocalDate.of(2024, 8, 14);
		LocalTime timeOf = LocalTime.of(8, 14, 31);
//		System.out.println(timeOf);
		
		// 조회 getXXX (setXXX 메소드 존재X)
//		System.out.println(timeNow.getSecond());
		
		// 수정 with(), plus(), minus()
//		System.out.println(dateNow);
//		System.out.println(dateNow.withYear(2025));
//		System.out.println(dateNow.plusYears(1));
		System.out.println("---");
//		System.out.println(timeNow);
//		System.out.println(timeNow.withMinute(55));
//		System.out.println(timeNow.minusMinutes(20));
		
		// 비교 dateNow vs dateOf
//		System.out.println(dateNow.compareTo(dateOf));
//		System.out.println(dateNow.isBefore(dateOf));
//		System.out.println(dateNow.isAfter(dateOf));
//		System.out.println(dateNow.isEqual(dateOf));
		
		// LocalDateTime
		LocalDateTime ldt1 = LocalDateTime.of(dateOf, timeOf);
		LocalDateTime ldt2 = LocalDateTime.of(2024, 8, 14, 16, 50, 00);
//		System.out.println(ldt1);
//		System.out.println(ldt2);
		
		// toLocalXXX()
//		LocalDate ld = ldt1.toLocalDate();
//		LocalTime lt = ldt1.toLocalTime();
		
		// ZonedDateTime
		ZoneId londonId = ZoneId.of("Europe/London");
		ZonedDateTime londonDateTime = ZonedDateTime.now().withZoneSameInstant(londonId);
//		System.out.println(londonDateTime);
		
		// Period : 날짜의 차이
		// Duration : 시간의 차이
		
		LocalDate date1 = LocalDate.of(2022, 1, 1);
		LocalDate date2 = LocalDate.of(2025, 12, 31);
		
		Period p = Period.between(date1, date2);
//		System.out.println(p); // P3Y11M30D
//		System.out.println(p.getYears());
		
		LocalTime time1 = LocalTime.of(10, 20, 30);
		LocalTime time2 = LocalTime.of(20, 30, 10);
		
		Duration d = Duration.between(time1, time2);
//		System.out.println(d.getSeconds());
		
		// d.getSeconds() -> LocalTime
		LocalTime resultTime = LocalTime.of(0, 0).plusSeconds(d.getSeconds());
//		System.out.println(resultTime);
//		System.out.println(resultTime.getMinute());
		
		// DateTimeFormatter
		// 1) ofPattern(패턴)
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		// 1-1) LocalDate.format()
//		System.out.println(dateOf.format(dtf));
		
		// 1-2) ISO International Standard Organization : 국제 표준 기구
//		System.out.println(dateOf.format(DateTimeFormatter.ISO_LOCAL_DATE));
//		System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(dateOf));
		
		// 2) parse(문자열 형태 date, time)
		LocalDate parsedLocalDate = LocalDate.parse("2024-12-31");
		LocalTime parsedLocalTime = LocalTime.parse("14:02:35");
		System.out.println(parsedLocalTime);
		
	}

}
