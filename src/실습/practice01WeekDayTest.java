package 실습;

import java.util.Scanner;

public class practice01WeekDayTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("요일을 계산할 년,월,일: ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
//1년 1월 1일부터 입력한 년도의 전년도 12월31일 까지 지난 날짜를 계산한다
		int sum = (year -1) * 365 + (year -1) / 4 -(year -1) / 100 + (year -1) / 400; //지난년도 까지의 윤년의 날을 더해주는 것 
		
// 전년도 12월 31일까지 지난 날짜수에 올해 전달 까지 지난 날짜를 더한다
		for (int i = 1 ; i<month ; i++) {
			int [] m = {31,28,31,30,31,30,31,31,30,31,30,31};
			m[1] = year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ? 29:28;
//			switch(i) {
//			case 2 : 
//				sum += year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ? 29:28; //2월에는 윤년이면 29을 더하고 아니면 28을 더한다
//				break;
//			case 4 : case 6 : case 9 :case 11 : // 날짜가 30일인달
//				sum+= 30;
//				break;
//			default : // 기타등등 == 31일달 default 는 해당값이 없을 때도 무조건 실행 , 있을때도 실행 없을때도 실행
//			}
//				sum+= 31;
//				break;
			
			sum +=m[i-1];
				
			}
		
//전달 까지 지난 날수에 오늘까지의 날짜를 더한다
		sum+= day;
	
// 나머지가 0이면 일 1 : 월 2:  화....		

//		switch (sum%7) {
//		case 0 :System.out.println("일요일"); break;
//		case 1 :System.out.println("월요일"); break;
//		case 2 :System.out.println("화요일"); break;
//		case 3 :System.out.println("수요일"); break;
//		case 4 :System.out.println("목요일"); break;
//		case 5 :System.out.println("금요일"); break;
//		case 6 :System.out.println("토요일"); break;
//		}
		
		String [] week = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		System.out.println(week[sum%7]);
		
		}
		
	}



/*
 *삼항연산자
 * 
 * 조건식 ? 식1 : 식2
 * 조건식이 참이면 식1 반환 거짓이면 식2를 반환
 * 
*/