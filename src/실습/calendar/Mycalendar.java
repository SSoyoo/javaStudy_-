package 실습.calendar;

import java.util.Scanner;

//달력출력 클래스
public class Mycalendar {
	
	public static void main(String[] args) {
	
//		System.out.println(Mycalen.isLeapYear(2023));
//		System.out.println(Mycalen.lastDay(2023, 2));
//		System.out.println(Mycalen.totalDay(2023, 1, 30));
//		System.out.println(Mycalen.weekDay(2023, 1, 30));
	
		Scanner sc = new Scanner(System.in);
		System.out.println("달력을 출력할 년, 월,일:");
		int year =sc.nextInt();
		int month = sc.nextInt();
	
		
		System.out.printf("     %4d년 %2d월\n" ,year,month );
		System.out.println("===================");	
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("===================");	
		
//1일의 요일만큼 반복하면 빈캄 출력		
		
		for(int i = 1 ;i<=Mycalen.weekDay(year, month,1); i++) {
			System.out.print("   ");
		}
		
		for(int i = 1; i<Mycalen.lastDay(year, month) ; i++) {
			System.out.printf(" %2d " ,i);
// 출력한 날짜가 토요일이면 줄을 바꾼다
			if(Mycalen.weekDay(year, month, i) == 6) {
				System.out.println();
			}
		}
		
}
}
