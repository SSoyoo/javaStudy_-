package Class.Inheritance;

public class DownCating {

	public static void main(String[] args) {
		//다운캐스팅 : 업캐스팅 된 부모 클래스의 객체가 자식클래스의
		//참조변수로 형 변환되는 것 
		
		/*
		 * <구조>
		 * 자식클래스 변수명 = (자식클래스) 업 캐스팅 된 부모 참조변수
		 *업캐스팅 된 변수만 가능
		 */
		
		Human h1 = new Student3("가길동", 20, "게임하기", 3); //업캐스팅
		
		//다운캐스팅
		Student3 s1 = (Student3)h1; // 업캐스팅 된 변수를 다시 다운캐스팅 하겠다
				
		
	}

}
