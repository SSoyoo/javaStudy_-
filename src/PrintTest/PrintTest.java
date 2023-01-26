package PrintTest;

public class PrintTest {

	public static void main(String[] args) {
		//묵시적 형변환 : 자료형의 크기가 서로 다른 자료의 연산 결과는 크기가 큰 자료형으로 자동 변화된다
		//자바의 기본 자료형
		// Boolean < char < short < int <long < float < double
		
		//명시적 형변환 : 프로그래머가 그 순간의 자료형을 변경할 수 있다. 캐스팅, 형변환
		
		System.out.println("5 / (double)3 = " + 5 /(double)3);
		System.out.println("A+32 = " + (char)('A' + 32));
	
	
		// 서식있는 출력 printf()
		//printf("출력서식"," 출력할내용) 출력서식문자를 제외한 나머지 문자는 입력한 그대로 출력된다
		//출력 서식문자 = d(정수) ,f(실수), c(문자), s(문자열)
		//출력 서식의 형식 : %,-,0,n .m
		// - : 출력할 전체 자리수가 지정된 경우 왼쪽에 맞춰 출력
		// 0 : 출력할 전체 자리수가 지정된 경우 왼쪽의 남는 자리에 0을 채워 출력
		// n : 출력할 전체 자리수
		//.m : 소수점 아래 자리수, 잘리는 자리에서 반올림
		
		System.out.printf("5 + 3 = %d\n" , 5+3);
		System.out.printf("%d + %d = %d", 5 , 3 , 5+3);
		
	}

}
