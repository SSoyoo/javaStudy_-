package ArrayList;
import java.util.ArrayList;
public class ArrayListTest1 {

	public static void main(String[] args) {
		
	//배열은 한번 선언하면 프로그램에서 크기를 바꿀 수 없다
	//<E>제네릭 이라고 부르며 ArryaList에 저장할 자료형을 반드시 클래스로 적는다
	//ArrayList에 저장할 자료가 기본 자료형이라면 기본 자료형을 클래스화 시켜놓은 랩퍼클래스를 사용한다.
	//랩퍼 클래스는 기본 자료형의 첫 문자만 대문자로 적으면 되고, character와 integers는 풀네임을 사용한다.	
	ArrayList<Integer> list = new ArrayList<>();
	for(int i = 0; i<10 ; i++) {
		list.add(i+1);
	}
	
	for(int i = 0 ; i<10 ; i++) {
		System.out.println(list.get(i));
	}
	
	}

}
