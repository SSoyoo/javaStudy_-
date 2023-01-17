package Array.다차원배열;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		//5개의 정수형 변수 묶는 1차원 배열 X2 = 2차원 배열
		
		int ar1 [] = new int[5];
		int ar2 [] = new int[5];
		
		int ar3 [] [] = new int[2][5]; 
		// 내가 배열을 2개 만들건데, 그 안에 5개씩 담을거야 
		// 자료형 배열명 [][] = new 자료형 [묶음크기][변수갯수];
	
		/*
		 * 4명의 학생의 점수 3개를 입력받아 scores라는 변수에 담아보자 
		 * 출력결과
		 * 
		 * 1번학생 점수
		 * 국어 : 90
		 * 영어 :100
		 * 수학 : 50
		 * 
		 * 2번학생점수
		 * 국어 :100
		 * 영어: 20
		 * 수학 : 30
		 * 
		 * 3번 학생점수
		 * 국어: 40
		 * 영어:50 
		 * 수학:60
		 * 
		 * 4번학생점수
		 * 국어 : 100
		 * 영어 :100
		 * 수학 :99
		 */
	
		Scanner sc = new Scanner(System.in);
		int scores[][]=new int[4][3];
		String subject[] = {"국어","영어","수학"};
		
		// 2차원 배열을 이용해서 사용자에게 입력받은 값 저장하는 법
		for(int j = 0; j<4; j++) {
			System.out.println(j+1 + "번째 학생의 점수");
			for (int i =0 ; i<3; i++) {
				System.out.println(subject[i]+":");
				scores[j][i] = sc.nextInt();
			}
		}
		
		
		//2차원 배열에 저장된 값 출력
		
		for(int i = 0; i<3; i++) {
			System.out.print("\t"+ subject[i]);
		}
		System.out.println();
	
		for(int j =0; j<4; j++) {
			System.out.print(j+1 + "번:\t");
			for(int i =0 ; i<3; i++) {
				System.out.print(scores[j][i] + "\t");
			}
			System.out.println();
		}
	
		
		}
}
