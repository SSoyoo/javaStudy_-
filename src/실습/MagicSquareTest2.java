package 실습;

import java.util.Scanner;

public class MagicSquareTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int data [][]	= new int [n][n];
		int i = 0 , j =n/2 ;
		for (int k = 1 ; k<= Math.pow(n, 2) ; k++) {
			
			data[i][j] =k;
		if(k % n == 0) {
			i++;
		}else {
		
			if(--i<0) {
				i= n-1;
			}
			
			if(++j == n) {
				j = 0;
			}
		}
			
		}
	for (i =0 ; i<n ; i++) {
		for(j = 0 ; j<n ; j++) {
			System.out.printf("%2d ", data[i][j]);
		}
		System.out.println();
	}
	}

}
