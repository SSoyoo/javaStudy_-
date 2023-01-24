package Exception;

public class RethrowExample {

	public static void main(String[] args) {
		
		try {
			System.out.println("외부 try");
			
			try {
				
			System.out.println("내부 try");
			Exception e = new Exception();
			throw e;
				
			}
			catch(Exception e) {
				
				System.out.println("내부 try catch exception:" + e);
				System.out.println("예외던지기 한번더");	
				throw e;
			}
			finally {
				System.out.println("finally 구문호출");
			}
		}
		catch(Exception e) {
			System.out.println("외부 try catch exception:" + e);
			
		}
		
		System.out.println("종료");
	}

}
