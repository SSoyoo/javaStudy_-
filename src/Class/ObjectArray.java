package Class;

public class ObjectArray {

	public static void main(String[] args) {
		
		Aclass ar[] = new Aclass[3];
		
		ar[0] = new Aclass(); 
		// 객체 배열을 사용할 때는 변수명[ ] = new 클래스명 을 통해 객체를 생성해야 객체 내 필드 접근가능
		
		
		ar[0].x = 100;
		ar[0].f1();
		
		
	}

}

	class Aclass{
		
		int x;
		void f1() {
		
			System.out.println("f1()");
			
		 }
	}
