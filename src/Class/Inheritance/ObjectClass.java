package Class.Inheritance;

public class ObjectClass {

	public static void main(String[] args) {
		
	Aclass a = new Aclass();
	//a.에서 나오는 기능들은 오브젝트 클래스에서 나온것
	
	Aclass a1 = new Aclass();
	Aclass a2 = new Aclass();
	
	//toString() 객체의 정보를 문자열로 출력
	System.out.println(a1.toString());
	System.out.println(a1); //.toString 생략가능
	
	//equals() : 두 객체가 동일한지를 비교
	
	System.out.println(a1.equals(a1));
	
	
	//getClass() : 객체의 클래스 정보를 가져옴
	
	System.out.println(a1.getClass());

	}
}

class Aclass{
	
}