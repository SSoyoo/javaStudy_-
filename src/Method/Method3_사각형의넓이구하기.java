package Method;

public class Method3_사각형의넓이구하기 {

	public static void main(String[] args) {
		
		System.out.println("사각형의넓이 : " + rectangle(10, 50));
	}
	/*
	 * 사각형의 넓이는 어떻게 구하더라
	 * 가로 X 세로
	 */
	
	static int rectangle(int x, int y) {
		System.out.println("계산시작");
		return x*y;
		
	} 
}
