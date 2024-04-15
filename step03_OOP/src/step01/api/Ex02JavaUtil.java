package step01.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

public class Ex02JavaUtil {

	public static void main(String[] args) {
		/*
		 * Collection Framework
		 * 	- List, Map, Set
		 * Properties -> File I/O
		 * etc...
		 */
		
		// Properties
		Properties props = new Properties(); 
		props.setProperty("language", "kr");
		props.setProperty("timeout", "30");
		
//		
		System.out.println(props.getProperty("language"));
		
		// property 출력
		// 1)
		System.out.println(props);
		
		// 2) 
		Enumeration enumeration = props.propertyNames();
		System.out.println(enumeration);
		
		while(enumeration.hasMoreElements()) {
			String propertyName = (String) enumeration.nextElement();
			System.out.println(propertyName);
		}
		System.out.println("---");
		
		// Calendar : 날짜, 시간
		// 자체적으로 new 객체 생성 X(-> 추상클래스이기 때문)
		// 현재 시스템 날짜+시간
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
//		System.out.println(year);
		
		/*
		 * YEAR, MONTH, DATE, DAY_OF_MONTH, DAY_OF_WEEK
		 * HOUR, MINUTE, SECOND, MILLISECOND 
		 * 
		 */
		// 0 ~ 11(12월)
//		System.out.println(cal.get(Calendar.MONTH));
		
		// milliseconds 
//		System.out.println(cal.getTimeInMillis());
		
		// ex) calendar - 시간차 계산
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		// 오전 10시 20분 30초
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		// 오후 20시 30분 10초
		time1.set(Calendar.HOUR_OF_DAY, 20);
		time1.set(Calendar.MINUTE, 30);
		time1.set(Calendar.SECOND, 10);
		
		// 차이(초)
//		System.out.println(Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000);
		
		
		// Date
//		Date date = new Date();
//		System.out.println(date);
//		
//		System.out.println(date.getMonth());
		
		// Date <--> Calendar
		// 1) Calendar -> Date
		Calendar c = Calendar.getInstance();
		Date d1 = c.getTime();
		Date d2 = new Date(c.getTimeInMillis());
		
		// 2) Date -> Calendar
		Date d = new Date();
		Calendar c2 = Calendar.getInstance();
		c2.setTime(d);
		
		// SimpleDateFormat
		// 1) pattern -> 2-1) format(date객체)
		//            -> 2-2) parse(문자열 date형식)
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd"); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SS");
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SS, E, w, W, D");
		
		System.out.println(d);
//		System.out.println(sdf1.format(d));
//		System.out.println(sdf2.format(d));
		System.out.println("---");
//		System.out.println(sdf3.format(d));
//		System.out.println(sdf4.format(d));
		System.out.println("---");
//		System.out.println(sdf5.format(d));
		
		/*
		 * y - 4자리년도
		 * M - 월
		 * d - 일(이번달)
		 * D - 일(올해)
		 * h - 시간(12시)
		 * H - 시간(24시)
		 * m - 분
		 * s - 초
		 * S - 밀리초
		 * E - 요일
		 * w - 주(올해)
		 * W - 주(이번달)
		 * 
		 */
		
		// 2-2) parse
		try {
			Date date2 = sdf1.parse("2024/04/11 14:57");
			System.out.println(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Calendar, Date 사용은 X!!!
	 * 	1) Locale에 따른 프로그래밍 이상현상 발생 가능
	 *  2) Calendar, Date는 가변 객체
	 *  3) 날짜지정의 값이 어떤 필드들은 0부터 시작하므로 헷갈릴 수 있음
	 *  4) Date JDK 1.0, Calendar JDK 1.1 부터 사용 가능하여 Date, Calendar를 함께 활용
	 *  
	 */

	/*
	 * java.time 패키지
	 * 	1) 불변 객체 반환
	 *  2) 기능별 클래스 제공
	 *  	- LocalDate : 날짜
	 * 		- LocalTime : 시간
	 * 		- LocalDateTime : 날짜, 시간
	 * 
	 */
	
}
