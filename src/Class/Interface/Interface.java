package Class.Interface;

public class Interface {
	
	/*
	 * 클래스 : 설계도, 인터페이스 : 규격
	 * 
	 * 
	 * 인터페이스의 문법
	 * 
	 * - 상수  : final 타입 변수명 = 값;
	 * - 추상메서드
	 * 
	 * 구현방법
	 * 
	 * - interface 인터페이스명{
	 * 필드
	 * 
	 * };
	 * 
	 * 클래스로 인터페이스 구현
	 * 
	 * interface 인터페이스명{
	 * }
	 * 
	 * class 클래스명 implements 인터페이스명{
	 *  추상메서드
	 * }
	 */

	public static void main(String[] args) {
		
		B b = new B();
		b.methodA();
		b.methodB();

	}

}

interface Ainter{
	
	final int x =10;
	int y =20; // final 생략가능하나 값 변경 불가
	
	abstract void methodA();
	void methodB(); //abstract 생략가능
	
}

class B implements Ainter{
	
	@Override
	public void methodA() {
		System.out.println("메소드a");
		
	}
	
	@Override
	public void methodB() {
		System.out.println("메소드b");
		
	}
}