package Class.Inheritance;

public class upcasting1 {

	public static void main(String[] args) {
		//업캐스팅 : 자식 클래스의 객체가 부모클래스의 참조 변수로 형변환 되는 것
		//값은 자식값으로 채우되, 공간은 부모클래스로 만들어진 공간.
		//만들지 않은 스터디 등은 쓸수없음
		Student3 st1 = new Student3("일이삼", 13,"게임",3);
		Human h1 = new Student3	("가나다", 17, "ㅇㅇㅇ",3);
		h1.info();
		//동적바인딩
	//	st1.study()	;
	}

}

class Human{
	
	String name;
	int age;
	String hobby;
	
	public Human(String name, int age, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}

	void info () {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("hobby:" + hobby);
	}
	

}

class Student3 extends Human{
	
	int grade;
	public Student3(String name, int age, String hobby, int grade) {
		super(name,age,hobby);
		this.grade = grade;
	}
	
	void info() {//오버라이딩
		
		super.info();
		System.out.println("grade:" +grade);
		
	}
	
	void study() {
		System.out.println("공부하기");
	}
}