package Class;

public class variable02 {

	public static void main(String[] args) {
		
		
		System.out.println(Car.wheel);
		
		Car c1 = new Car();
		System.out.println(c1.speed);
		Car c2 = new Car();
		System.out.println("변경전");
		System.out.println("c1.speed : " + c1.speed);
		System.out.println("c2.speed : " + c2.speed);
		System.out.println("c1.wheel : " + c1.wheel);
		System.out.println("c2.wheel : " + c2.wheel);
		
		c2.speed = 100;
		c2.wheel = 5;
		System.out.println("변경후");
		System.out.println("c1.speed : " + c1.speed);
		System.out.println("c2.speed : " + c2.speed);
		System.out.println("c1.wheel : " + c1.wheel);
		System.out.println("c2.wheel : " + c2.wheel);
		
	}

}

class Car{
	static int wheel =4;
	int speed ;
}