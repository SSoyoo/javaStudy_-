package Class.Abstract;

abstract class Product{
	//추상클래스 : 한 개 이상의 추상 메소드를 포함한 클래스로 ,객체생성X
	//상속을 시키기 위해 만드는 클래스로, 상속받은 자식 클래스는 반드시 오버라이드 시켜서 사용
	public abstract void move();
}

class Camera extends Product{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class Abstract2 {

	public static void main(String[] args) {

	}

}

