package 상속.공장복습;

public class LGFactory extends Factory {

	public LGFactory (int factoryNumber) {
		super(factoryNumber);
	}

	@Override
	public void start() {
		System.out.print("엘지 ");
		super.start();
	}

	@Override
	public void stop() {
		System.out.print("엘지 ");
		super.stop();
	}
	
	public void produveSmartTv() {
		System.out.println("LG스마트 TV를 생산합니다.");
	}
	
	

}
