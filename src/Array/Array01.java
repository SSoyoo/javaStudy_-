package Array;

public class Array01 {

	public static void main(String[] args) {
		//배열이란? 같은 자료형의 변수들의 나열된 묶음
		//사용목적: 같은 타입의 변수들을 편하게 관리하기 위해서 
		/*
		 * 배여릐 선언과 생성
		 * 1) 타입 [ ] 배열명; 
		 * 2)배열명 = new[길이];
		 * 
		 * 타입[ ] 배열명 = new 타입[길이];
		 * 배열 각 요소는 배열명 [인덱스 ]로 변수처럼 사용가능
		 */
		
		//세명의 학생점수 저장하고 싶다 
		int score1 = 100;
		int score2 = 90;
		int score3 = 80;
		
		System.out.println("1번째 학생의 점수:" +score1+"점");
		System.out.println("2번째 학생의 점수:" +score2+"점");
		System.out.println("3번째 학생의 점수:" +score2+"점");
		
		int [] scores = new int[3];
		scores[0] =100;
		scores[1] =70;
		scores[2] =80;
		
		for(int i =0; i<3; i++) {
			System.out.println(i +1 +" 번째의 학생의 점수: " + scores[i] +"점");
		}
		
		System.out.println("1번째 학생의 점수:" +scores[0]+"점");
		System.out.println("2번째 학생의 점수:" +scores[1]+"점");
		System.out.println("3번째 학생의 점수:" +scores[2]+"점");
		
		
	}

}
