package Array;
import java.util.*;

public class Array_로또번호생성기 {
	
 /*
  * 로또 
  * 1등부터 5등까지 존재
  * 45개중에서 6개의 숫자맞추기
  * 
  
  */
	public static void main(String[] args) {
		
		/*
		 * 1) 6개의 덤숫자와 보너스 점수를 로또 배열에 저장
		 * 2) 1~45까지 6개의 숫자를 입력받아 배열에 저장, 사용자에게 점수를 입력받음
		 * 입력한 값과 배열에 있는 값을 비교하여 동일한 값의 개수를 카운트
		 * 몇개의 숫자를 맞췄는지 조건에 따라 등수출력 
		 * 
		 * 5개의 숫자와 보너스 맞히면 2등
		 * 5개를 맞히면 3등
		 * 4개를 맞히면 4등
		 * 3개를 맞히면 5등
		 */
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int [] lottoAr = new int[6];
		int [] userAr = new int[6];
		int bonus;
		int bonusUser;
		int count = 0; // 이 변수값이 증가하는 것 == 랜덤값이랑, 유저값이 같을 때
		
		
		// 로또 배열 6개에 랜덤값 저장 하고 중복 제거
		for(int i =0; i<lottoAr.length; i++) {
			lottoAr[i] = random.nextInt(45)+1; //
			for(int j = 0; j < i ; j++) {
				if(lottoAr[i]==lottoAr[j]) {
					i--;
					break;
				}
			}
		}
	
		//보너스 번호에 랜덤값 저장 후 로또 배열에서의 중복은 제외하기
		bonus = random.nextInt(45)+1;
		
		
		// System.out.println("당첨번호 :" + Arrays.toString(lottoAr)+ "\n 보너스번호 : "+bonus);
		//사용자에게 6개의 값 입력 받음
		System.out.println("1~45까지의 숫자 6개 입력 : ");
		 for(int i =0; i<userAr.length ; i++) {
			 userAr[i] = sc.nextInt();
		 }
		//유저가 입력한 보너스 값
		 System.out.println("보너스 값 입력: ");
		 bonusUser = sc.nextInt();
		 
		 
		 //로또 배열의 값과 사용자 배열의 값 중 같은 값이 몇개 있는지 카운팅
		 
		 
		 for(int j = 0 ; j<6;j++) {
			 for(int i = 0; i<6; i++) {
				 if(lottoAr[j] == userAr[i]) {
					 count++;

				 }
			 }
		 }
		 
		 //해결할 것 : 배열에 중복 제거할 것 
		 //count의 값에 따라 등수결정
		 if(count == 6) {
			 System.out.println("축하합니다. 1등입니다!");
		 }
		 else if(count ==5) {
			 if(bonus == bonusUser) {
				 System.out.println("축하합니다. 2등입니다!");
			 }else {
				 System.out.println("축하합니다. 3등입니다!");
			 }
		 }
		 else if(count == 4) {
			 System.out.println("축하합니다. 4등입니다!");
		 }
		 else if(count == 3) {
			 System.out.println("축하합니다. 5등입니다");
		 }
		 else {
			 System.out.println("다음기회에!");
		 }
		 
		 System.out.println("당첨번호 :" + Arrays.toString(lottoAr)+ "\n 보너스번호 : "+bonus);
		 System.out.println("입력한 번호:" + Arrays.toString(userAr) + "\n 보너스 번호:"+bonusUser);
		
	}

}
