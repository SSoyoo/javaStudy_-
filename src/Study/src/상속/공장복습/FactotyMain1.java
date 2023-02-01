package 상속.공장복습;

public class FactotyMain1 {

	public static void main(String[] args) {
		
	SamsungFactory[] samsungFactories = new SamsungFactory[3];
	
	samsungFactories[0] = new SamsungFactory(1);
	samsungFactories[1] = new SamsungFactory(2);
	samsungFactories[2] = new SamsungFactory(3);
	
	
	LGFactory [] lgFactories = new LGFactory[3];
	
	lgFactories[0] = new LGFactory(1);
	lgFactories[1] = new LGFactory(2);
	lgFactories[2] = new LGFactory(3);
	
	System.out.println("삼성공장 가동");
	for(int i = 0; i<samsungFactories.length ; i++) {
		samsungFactories[i].start();
		
	}
	System.out.println("삼성공장 중지");
	for(int i = 0; i<samsungFactories.length ; i++) {
		samsungFactories[i].stop();
		
	}
		
	}

}
