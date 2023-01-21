package Class;

public class InnerClass2 {
	
	/*
	 * 내부클래스의 객체를 생성하는 방법
	 * 외부클래스. 내부클래서 객체명 = new 외부클래스 생성자() 내부클래스 생성자();
	 * 이미 만들어진 외부클래스객체.내부클래스 생성자()
	 */

	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		System.out.println("아우터 클래스의 a 값"+ oc.a);
		System.out.println("아우터 클래스의 b 값"+ OuterClass.b);
		
		System.out.println("이너클래스 접근하기");
		
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i = oc2.new Inner();
		
		System.out.println("이너의 c값" + i.c);
		i.innerMethod();

		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("스태틱이너d의 값:" +si.d);
	//	si.staticMethod(); -> 객체를 사용하지 않고 클래스명을 사용해서 호출할수있다
		OuterClass.StaticInner.staticMethod();
	}
	
	
	

}

class OuterClass{
	int a= 3; 
	static int b =4;
	class Inner{
		int c= 5;
		public void innerMethod() {
			System.out.println("Inner Class");
		}
	}

	static class StaticInner{
		int d =6;
		static int stat =10;
		public static void staticMethod() {
			System.out.println("static Inner");
		}
	}
}

