package contineBreak;

import java.util.Scanner;

public class Continue문01 {
	public static void main(String[] args) {
		
		/*아래의 명령을 무시하고 다음 반복을 실행해라
		 * 
		 * 반복문{
		 *		if(다음 반복을 실행할 조건){
		 *			continue;
		 *		} 
		 * 	}
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("숫자입력: ");
			num = sc.nextInt();
			//num ==0 종료
			if(num == 0) {
				System.out.println("종료");
				break;
			}
			//num<0반복시작
			if(num<0) {
				System.out.println("아래 명령 무시하고 다음 반복진행!");
				continue;
				
			}
			System.out.println("num:"+num); // 얘가 무시됨
			
		}
		
		
	}
}
