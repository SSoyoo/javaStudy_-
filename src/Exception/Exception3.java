package Exception;

public class Exception3 {

	public static void main(String[] args) {

		
		int a =4;
		int b=3;
		try {
			System.out.println("외부로 접속");
			int c = b/a;
		}
		catch(ArithmeticException e) {
			System.out.println("오류가 발생하였습니다");
		}
		
		finally { // 오류가 발생하지 않아도 실행된다 
			System.out.println("연결해제");
		}
	}

}
