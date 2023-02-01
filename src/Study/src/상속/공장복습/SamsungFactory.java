package 상속.공장복습;

public class SamsungFactory extends Factory{
	
	public SamsungFactory(int factoryNumber) {
		super(factoryNumber); 
		// 자식 생성자에서 명시적으로 부모 생성자를 호출해야한다. 이때 사용하는 키워드가 super()이다. 
		// super(); 를 쓸 때는 자식 생성자의 첫 줄에 써야한다
	}

	@Override
	public void start() {
		System.out.print("삼성 ");
		super.start();
	}

	@Override
	public void stop() {
		System.out.print("삼성 ");
		super.stop();
	}

	public void prduceSmartPhone() {
		System.out.println("삼성스마트 폰을 만듭니다.");
	}
	
	
	

}
