package 상속.공장복습;

public class FactotyMain2 {

	public static void main(String[] args) {
		// 공장 공장1 = new삼성(1); 업캐스팅! : 부모 객체로 형변환, 명시하지 않아도 된다
		
		Factory [] factories = new Factory[4];
		
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);

		System.out.println("모든 공장을 가동합니다");
		for(int i = 0 ; i<factories.length ; i++) {
			factories[i].start();
		}
		
	}

}
