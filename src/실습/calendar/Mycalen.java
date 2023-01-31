package 실습.calendar;
//달력에 사용할 메소드가 있는 클래스 
public class Mycalen {
	
	//인수로 년도를 넘겨받아 윤년,평년을 판단하여 윤년이면  true, 평년이면 false를 리턴하는 메소드
	
	public static boolean isLeapYear(int year) {
		
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

	
// 인수로 년 월을 넘겨받아 그 달의 마지막 날짜를 리턴하는 메소드
		
	}	
	
	public static int lastDay(int year , int month) {
		
		
		int [] m = {31,28,31,30,31,30,31,31,30,31,30,31};
		m[1] = isLeapYear(year) ? 29:28; // 윤년계산 하는 걸 굳이 한 번 더 쓸필요 없이 위에셔 만든 메소드 그대로 들고 오기
		int day = m[month-1];

		
		/*
		 * 윤년이면, 2월이 29일 아니면 28일
		 * 1,3,5,7,8,10,12 는 31일
		 * 4,6,9,11 은 30일 
		 * 
		 * 
		 */
		return day;
		
	}

	//인수로 년,원,일을 넘겨받아 1년1월1일부터 지나온 날짜의 합께를 계산해 리턴하는 메소드
	
	
	public static int totalDay(int year, int month , int day) {
		
		int sum = (year -1) * 365 + (year -1) / 4 -(year -1) / 100 + (year -1) / 400;
		for(int i = 1; i<month; i++) {
			sum += lastDay(year,i);
		}
	
		
		return sum+day;
	}
	
	//인수로 년 ,월,일을 넘겨받아 요일을 숫자로 리턴하는 메소드
	// 일요일(0)~ 목요일(4)~토요일(6)
	
	public static int weekDay(int year, int month , int day) {
		return totalDay(year,month,day) % 7;
	}
	
	
	
}
