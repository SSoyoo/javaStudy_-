package 실습;

import java.util.Random;

public class lottoTest {

	public static void main(String[] args) {
/*
 * 1~45가 들어갈 배열 
 *
 * 
 */
		int [] lotto = new int [45];
		for (int i =0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		for (int i = 0 ; i<lotto.length ; i++) {
			System.out.printf("%2d ",lotto[i]);
			if((i+1) % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("\n------섞기전-------");
//lotto[0]에 저장된 값과 lotto[1]~lotto[44] 사이의 랜덤한 위치의 값을 교환한다
		
		Random random = new Random();
		for (int i = 0; i < lotto.length*2 ; i++) {
			int r =random.nextInt(44)+1;
			int temp = lotto[0];
			lotto[0] =lotto[r];
			lotto[r] = temp;
		}
		
		for (int i = 0 ; i<lotto.length ; i++) {
			System.out.printf("%2d ",lotto[i]);
			if((i+1) % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("\n------섞은후-------");
		
		
		System.out.println("1등 예상번호는");
		for (int i = 0; i<6; i++) {
			System.out.println(lotto[i] +" ");
		}
		System.out.println("보너스 번호는: " +lotto[6]);
	}

}
