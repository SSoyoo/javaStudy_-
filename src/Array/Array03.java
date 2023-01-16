package Array;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		//a정수형 배열을 생성할 때 바로 초기값을 넣는방법
		int []a = new int[] {10,20,30,40};
		//b라는 정수형 배열을 생성할 때 초기값으로 넣는 방법(new int[] 생략가능)
		int[]b = {19,43,23,76,95};
		
		int[] c = new int[10];
		for(int i =0; i<c.length;i++) {
			c[i] =i;
			
		}
		for(int i =0; i<c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println();
		System.out.println(Arrays.toString(c));
	}

}
