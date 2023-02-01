package 상속.공장복습;

public class Factory {
	
	private int factoryNumber;
	
	public Factory(int factoryNumber)
	{ 
	/*
	 * 부모 클래스에서 전체 생성자를 만들었기 때문에 기본 생성자가 비활성화, 
	 * 상속받는 클래스에서 부모 생성자를 받는 매개변수를 생성해줘야한다
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
		this.factoryNumber = factoryNumber;
	}
	
	public void start() {
		
		System.out.println(factoryNumber + "공장을 가동합니다");
	}
	
	public void stop() {
		
		System.out.println(factoryNumber + "공장을 멈춥니다");
	}

}
