package Class;

public class InnerClass {

	public static void main(String[] args) {

	}

}

class A{
	static class StaticInner{}
	class InstanceInner{}
	
	StaticInner st1 = new StaticInner();
	InstanceInner ii1= new InstanceInner();
	
	
	static void staticMethod(){
		StaticInner st2 = new StaticInner();
//		InstanceInner ii2 = new InstanceInner(); 스테틱 메서드는 인스턴스 멤버에 접근할 수 없다
	}
	
	void InstanceMetod() {
		
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
		
	}
}