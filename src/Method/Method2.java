package Method;

public class Method2 {

	public static void main(String[] args) {
		f();
		System.out.println(f());
		
	}
	
	static int f() {
		System.out.println("f() 호출~");
		return 100;
	}
}
