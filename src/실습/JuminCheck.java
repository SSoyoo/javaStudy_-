package 실습;

import java.util.Scanner;

public class JuminCheck {
	// 주민등록 번호 유효성 검사하기  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록 번호 13자리를 입력하세요 : ");
		String juminNo = sc.nextLine();
		
		//주민등록번호 :8	3	0	4	2	2	1	1	8	5	6	0	0	
		//가중치       :2	3	4	5	6	7	8	9	2	3	4   5
		
		//각각 곱해서 더하고 더한 값을 11로 나눈다, 11에서 나머지를 뺀 겨롸가 2자리 숫자면 10자리는 버리고 1자리만 취한다
		String check = "234567892345";
		int sum = 0;
		//문자를 곱센 연산하면 문자의 유니 코드 값으로 곱한다
		for(int i =0 ; i <12 ; i++) {
		//	sum+= (juminNo.charAt(i) -48) * (check.charAt(i) -48);
		//	sum += (juminNo.charAt(i) -48) * (i <8 ? i + 2 : i-6);
			sum += (juminNo.charAt(i) -48) * (i% 8 +2);
		}
	
	//	System.out.println(sum);
		
		int result = (11- sum % 11)%10;
		if(result == juminNo.charAt(12)-48) {
			System.out.println("정상");
		}else {
			System.out.println("오류");
		}
	
	
	}

}
