package Class.Inheritance;

public class Overriding { 

	public static void main(String[] args) {
		
		Leader leader = new Leader();
		leader.say();

	}

}

class Student2{
	
	void learn() {
		System.out.println("배우기");
	}
	
	void eat() {
		System.out.println("밥 먹기");
	}
	
	void say() {
		System.out.println("선생님 안녕하세요!");
	}
	
}

class Leader extends Student2{
	void lead() {}
	void say(){ //메소드 오버라이딩, 재정의
		System.out.println("선생님께 인사");
		super.say();
		/*
		 *  super : 부모 클래스의 생성자 호출
		 *  - 자식 클래스의 생성사 첫 줄에서 이뤄짐
		 *  - 작성하지 않을 시 컴파일러가 자동호출
		 *  
		 */
	}
}