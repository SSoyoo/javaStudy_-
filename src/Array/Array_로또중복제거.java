package Array;
import java.util.*;

public class Array_로또중복제거 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int [] lottoAr = new int[6];
		
		for(int i = 0; i<lottoAr.length ; i++) {
			
			lottoAr[i] = r.nextInt(10)+1; // 45까지 랜덤 6개 생성해서 배열에 담음
			System.out.println("랜덤번호 6개 :" + Arrays.toString(lottoAr));
			
//			for(int j = 0; j< i ;j++) {
//				if(lottoAr[i] == lottoAr[j]) {
//					i--;
//					break;
//				}
//			}
		}
		
		System.out.println("그냥출력 : " + Arrays.toString(lottoAr));
		
		
	}

}
