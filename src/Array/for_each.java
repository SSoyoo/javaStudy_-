 package Array;

import java.util.Scanner;

public class for_each {

	public static void main(String[] args) {
		
		String [] a = {"Java", "Hello", "Programming"};
		for(String i :a) {
			System.out.println(i);
			
		}
		
		int [ ] b = {1,2,3,4,5};
		for(int i:b) {
			System.out.print(i);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n과일 세개를 입력하세요:");
		
		String [] fruits = new String[3];
		for(int i = 0; i<fruits.length ; i++) {
			fruits[i] = sc.nextLine();
		}
		
		for(String i : fruits) {
			System.out.println(i);
			
		}
		
	}

}
