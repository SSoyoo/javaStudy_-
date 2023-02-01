package 상속.공장복습;

public class FactoryMain3 {

	public static void main(String[] args) {
		
//		SamsungFactory sFactory = new SamsungFactory(1);
//		Factory f = sFactory;
//		SamsungFactory sf = (SamsungFactory)f;
//		
		
		Factory f = new SamsungFactory(1);
		SamsungFactory sf = (SamsungFactory)f;
		
		sf.start();
		
		
	}

}
