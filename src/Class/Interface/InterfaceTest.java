package Class.Interface;
/*
 * 인터페이스란 정적멤버(static)와 추상 메소드로만 구성된 클래스의 특별한 형태
 * 인터페이스는 다중 상속을 허용한다
 * 클래스는 클래스끼리, 인터페이스는 인터페이스끼리 상속시켜야 한다.
 */

public class InterfaceTest {

	public static void main(String[] args) {
		
	System.out.println(Shape.PI);	
	System.out.println(Draw.PI);

	}

}

class Point{
	int x, y;
	public void move() {}
}

class Shape{
	public static final double PI = 3.141592;
	public void draw() {}
	public void erase() {}
}

interface Draw{
	
	public static final double PI = 3.14;
	int LIMIt =1000; // 인터 페이스는 멤버변수 선언시 다 생략해도 자동으로 public static final 붙여준다
	
	
}
