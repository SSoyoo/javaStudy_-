package contineBreak;

import java.util.Scanner;

public class break문02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("입력");
			num =sc.nextInt();
			if(num ==0) {
				System.out.println("반복종료");
				break;
			}
			System.out.println("입력값 "+ num);
			
		}
		
	
	}

}
