package Class.Inheritance;

public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Car{
	int wheel;
	int speed;
	String color;
	
	Car(){
	}
	Car(String color){
		this.color = color;
	}
}

class SportsCar extends Car{
	int speedLimit;
	
	//<- 부모 클래스의 디폴트 생성자가 자동으로 호출되기 때문에 부모의 디폴트 생성자가 존재해야한다
	SportsCar(String color, int speedLimit){
		super(color);
		this.color = color;
		this.speedLimit = speedLimit;
	}
}