package 실습;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int [] ball = {0,1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i<10000 ; i++) {
			
			int r = random.nextInt(9)+1;
			int temp = ball[0];
			ball[0] = ball[r];
			ball[r] = temp;
			
		
		}
		
		System.out.println("레벨을 입력하세요: ");
		int level = sc.nextInt();
		
//		System.out.print("cpu : ");
//		for( int i = 0 ; i<level; i++) {
//			System.out.print(ball[i]);
//		}
		System.out.println();
		sc.nextLine(); //키보드 버퍼를 비움 

//맞출때까지 반복한다
		int count = 0;
		
		while(true) {
			System.out.print("user: ");
			String user =sc.nextLine();
//스트라이크와 볼의 개수를 센다
			int s = 0;
			int b = 0; 
		
			for(int i = 0; i < level ; i++) {
				
				if(ball[i]==user.charAt(i)-48) {
					s++;
				}
				if(user.indexOf(ball[i] + "")>=0) {
					b++;
				}
				
			}
			
			if(s == level) {
				break;
			}
			System.out.println(s+"스트라이크,"+ (b-s)+"볼");
			count++;
		}	
		
		System.out.println("정답 ! 도전횟수 : " +  count + "번");
	
	
	}	
		}			