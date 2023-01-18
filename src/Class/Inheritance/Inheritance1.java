package Class.Inheritance;

public class Inheritance1 {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.breath();
		st.learn();
		
		Teacher t = new Teacher();
		t.eat();
		t.teach();
		
		// 구현하지 않아도 부모 클래스에서 받아왔기 때문에 사용가능
		// 생성자는 상속되지 않는다
		// 자바는 다중상속을 지원하지 않는다
		// 클래스의 앞 final 키워드를 적으면 다른 클래스가 상속 불가함
	}

}	

class Person{
	
	void breath() {
		System.out.println("숨쉬기");
	}
	
	void eat() {
		System.out.println("밥먹기");
	}
	
	void say() {
		System.out.println("말하기");
	}
}

class Student extends Person{
	
	void learn() {
		System.out.println("배우기");
	}
	
}

class Teacher extends Person{
	
	void teach() {
		System.out.println("가르치기");
	}
}




