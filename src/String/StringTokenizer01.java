package String;
import java.util.*;

public class StringTokenizer01 {

	public static void main(String[] args) {
		
	//StringTokenizer :문자열을 구분문자열을 기준으로 분리할 때 사용
		/*
		 * 문자열 생성
		 * 구분할 문장열 생성
		 * StringTokenizer 객체생성
		 * 
		 * nextToken(): 다음 토큰으로 이동. 가져오기 위해 사용
		 * hasMoreTokens(): 다음 토큰이 존재하면 true,존재하지 않으면false
		 * countTokens():  남은 토큰의 개수
		 */
		
		String str = "kim:010-1234-5678";
		String delim = ":";
		StringTokenizer st = new StringTokenizer(str, delim);
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		
		System.out.println(st.hasMoreTokens());
		
	}

}
