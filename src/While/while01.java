package While;

import java.util.Scanner;

public class while01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer ="Y"; //while문이 실행되도록 초기값을 조건이 참인 값을 너헝준다
		
		int count = 0;
		while(answer.equals("Y")	) {
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer = sc.nextLine();
			
			if(answer.equals("Y")) {
				System.out.printf("음악을 %d 번 재생했습니다.\n",++count);
			}
				
			
		}
	
		System.out.println("재생종료");
		//while문은 조건이 거짓이면 단한번도 실행되지 않는다
		
	}

} 
