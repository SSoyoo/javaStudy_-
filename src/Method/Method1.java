package Method;

public class Method1 {
	/*
	 * 반환타입 메서드명 (타입 변수명, 타입 변수명){
	 *  명령1
	 *  명령2
	 *  리턴값
	 * 
	 * }
	 * 
	 * 메서드명 (값1 , 값2)
	 * 
	 *  리턴 값 : 함수에 구현된 모든 명령 실행 후 함수가 갖게 될 결과 값
	 *  리턴 타입(반환타입): 반환하는 값의 자료형
	 */

	public static void main(String[] args) {
		open();
		open();
		open();
		
		f1(100);
		f1(200);
	}
	
	static void open() {
		System.out.println("문열기");
		System.out.println("바닥 청소");
		System.out.println("포스켜기");
		System.out.println("빵 진열");
	}
	
	static void f1(int x) {//함수 호출시 100을 전달받아 전달받은 100을 출력하자
		System.out.println("x: "+ x);
		
	
	}
	

}


