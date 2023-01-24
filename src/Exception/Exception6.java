package Exception;

public class Exception6 {
	
	/*
	 * 기존의 예외 클래스로 예외 표현이 불가할 경우
	 * 나만의 예외 클래스르 만들어서 사용한다.
	 * 내가 만든 예외 클래스는 예외 클래스를 상속받도록 만든다
	 */

	public static void main(String[] args) {
		
		int age =-19;
		
		try {
			ticketing(age);
		}catch(AgeException e) {
			e.printStackTrace();
			
		}
	}

	public static void ticketing(int age) throws AgeException{
		if(age <0) {
			throw new AgeException("나이 입력 오류");
		}
	}
}

class AgeException extends Exception{
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
}