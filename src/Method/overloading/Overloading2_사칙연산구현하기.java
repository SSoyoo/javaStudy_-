package Method.overloading;

public class Overloading2_사칙연산구현하기 {

	public static void main(String[] args) {
		
		System.out.println(sum(10,10));
		System.out.println(sub(10,20));
		System.out.println(mul(345,67));
		System.out.println(div(10,2));
	 
		
		System.out.println(sum(10.5,1.7));
		System.out.println(sub(1.8,2.0));
		System.out.println(mul(34.5,6.7));
		System.out.println(div(3.5,1.2));
		
		System.out.println(sum("Hello" , "World"));
		
		

	}
	// 정수형의 사칙연산
	static int sum(int x, int y) { 
		return x+y;
	}
	static int sub(int x , int y) {
		return x-y;
	}
	
	static int mul(int x , int y) {
		return x*y;
	}
	
	static int div(int x, int y) {
		return x/y;
	}
	
	// 실수형의 사칙연산
	static double sum(double x, double y) { 
		return x+y;
	}
	static double sub(double x , double y) {
		return x-y;
	}
	
	static double mul(double x , double y) {
		return x*y;
	}
	
	static double div(double x, double y) {
		return x/y;
	}
	
	// 문자열의 덧셈연산
	
	
	static String sum(String x, String y) {
		return x+y;
	}

}
