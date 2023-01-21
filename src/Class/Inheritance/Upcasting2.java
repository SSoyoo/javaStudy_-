package Class.Inheritance;

public class Upcasting2 {

	public static void main(String[] args) {
		
		A obj = new B(); // 부모 변수에 자식 값을 담음 : 업캐스팅
		obj.methodA();
	//  obj.methodB(); 오류! 
		
	}

}


class A{
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A{
	void method() {
		System.out.println("methodB");
	}
}