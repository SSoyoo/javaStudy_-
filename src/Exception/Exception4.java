package Exception;

public class Exception4 {
	
	/*
	 * 모든 예외 클래스는 Exception 클래스를 상속받으므로  Exception 으로 처리가능
	 * 예외 클래스들에서 Exception 클래스으 메서드 사용가능
	 * 
	 * throw :  고의로 예외를 발생시킬 때 사용
	 * throws : 예외가 발생했을 경우 현재 메서드가 예외를 처리하지 않고
	 * 자신을 호출 한 쪽으로 예외 처리에 대한 책임을 넘기는 것 
	 * 
	 * void method() throws Exception{....}
	 */

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의 예외");
			throw e ;  // 고의적으로 예외를 발생
		}
		catch(Exception e ) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}
		
	}

}
