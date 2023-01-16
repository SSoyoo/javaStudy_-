package While;

import java.util.*; // util 에 있는 모든 클래스를 가져와

public class While02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int user =-1;
		int rNum = random.nextInt(100)+1; // 0~99까지 100개 생성된거에서 1을 더하면 1~100까지 
		
		while(rNum != user) {
			System.out.println("숫자입력: ");
			user = sc.nextInt();
					if(rNum<user) {
						System.out.println("Down!"	);
					}
					
					else if(rNum>user) {
						System.out.println("Up");
					}
					
					else {
						System.out.println("정답!");
					}
		}
		
	}

}
