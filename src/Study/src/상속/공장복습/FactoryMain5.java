package 상속.공장복습;

public class FactoryMain5 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		Factory [] factories = new Factory[20];
		
		for(int i = 0 ; i<factories.length ; i++) {
			
			if(i % 2 == 0) {
				factories[i] = new SamsungFactory(i/2+1);
			}else {
				factories[i] = new LGFactory(i/2+1);
			}
		}
			
		System.out.println("모든 공장을 가동합니다.");
			
		for(int i = 0; i < factories.length ; i++) {
			
			//삼성1공장 가동합니다
			if(factories[i] instanceof SamsungFactory) {
				SamsungFactory samsungFactory = (SamsungFactory)factories[i];
				samsungFactory.start();
				samsungFactory.prduceSmartPhone();
				samsungFactory.stop();
			}
			else if(factories[i] instanceof LGFactory) {
				LGFactory lgFactory = (LGFactory)factories[i];
				lgFactory.start();
				lgFactory.produveSmartTv();
				lgFactory.stop();
			}
			
		}
			
		System.out.println("모든 공장을 중지합니다.");
	}

}
