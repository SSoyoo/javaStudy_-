package String;

public class StringBufferEx {

	public static void main(String[] args) {
		String str = "test";
		StringBuffer buffer = new StringBuffer("test");
		
		str.replace('t', 'T');
		System.out.println(str);
		
		buffer.replace(1, 3, "ES"); // 1부터 3전까지 ES 로 바꿀래
		System.out.println(buffer);
		
	}

}
