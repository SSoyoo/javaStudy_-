package 상속.공장복습;

public class FactoryMain4 {

	public static void main(String[] args) {
		
		Factory [] factories = new Factory[4];
		
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);	
		
		System.out.println(factories[0] instanceof SamsungFactory);
		System.out.println(factories[1] instanceof SamsungFactory);
		
		for(int i =0 ; i<factories.length ; i++) {
			if(factories[i] instanceof SamsungFactory) {
				SamsungFactory samsungFactory = (SamsungFactory)factories[i];
				samsungFactory.prduceSmartPhone();
			}else if(factories[i] instanceof LGFactory) {
				LGFactory lgFactory = (LGFactory)factories[i];
				lgFactory.produveSmartTv();
			}
		}
		
		
	}

}
