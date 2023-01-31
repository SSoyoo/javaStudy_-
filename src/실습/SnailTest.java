package 실습;

public class SnailTest {

	public static void main(String[] args) {

		int [][] a = new int [5][5];
		int count = 0 ,i = 0 , j = -1, sw =1, k = 5;
		//count = 1~25 까지 증가는 변수, i = 행,j =열, sw 부호변경,k반복횟수
		
		while(true) {
			
		//행방향 채우기
			for(int p = 0; p<k; p++) {
				j+= sw;
				a[i][j]= ++count;
			}
			
			if(--k == 0) {
				break;
			}
			//열방향 채우기 
			for(int p = 0; p<k; p++) {
				i+= sw;
				a[i][j] = ++count;
			}
			
			sw *= -1;
		}
		
		
		
		for(i =0 ; i<5 ; i++) {
			for(j =0 ; j<5 ; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}
			
	}

}
