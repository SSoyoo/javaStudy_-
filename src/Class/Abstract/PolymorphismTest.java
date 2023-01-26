package Class.Abstract;

import java.util.Scanner;

/*
 * 다형성 : 하나의 메소드가 서로 다른 클래스에서 다양하게 사용 되는 것
 * 다형성을 구현할 메소드를 포함한 클래스는 같은 부모 클래스를 가져야한다
 * 부모 클래스와 자식 클래스에 반드시 같은 메소드가 있어야하고
 * 자식 클래스는 이를 반드시 오버라이드 해서 사용해야 한다
 * 부모 클래스의 객체에 자식 클래스의 객체를 대입해서 실행해야 한다
 */

abstract class Shape2{
	
	public abstract void draw();
}

class Point extends Shape2{ // 다형성을 구현하는 클래스들, 

	@Override
	public void draw() {
		System.out.println("점을 찍는다");
		
	}
	
}

class Line2 extends Shape2{ // 부모를 다 상속받음 

	@Override
	public void draw() {
		System.out.println("선을 긋는다");
	}
	
}

public class PolymorphismTest {

	public static void main(String[] args) {
		
	Shape2 [ ] shapes = {new Point(), new Line2()};

	Scanner sc = new Scanner(System.in);
	int menu = sc.nextInt();
	
	shapes[menu -1].draw();
	}

}
