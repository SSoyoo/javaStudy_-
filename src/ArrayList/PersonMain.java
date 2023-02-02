package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonMain {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 20)); //add(value): ArrayList에 value를맨 뒤에 추가한다
		list.add(new Person("가나다", 40));
		list.add(new Person("가라마", 30));
		System.out.println(list.size()); // size : ArrayList에 저장된 데이터의 개수를 얻어온다

		list.add(1, new Person("라라라",10));
		System.out.println(list.size()+ ":"+ list); //add(index, value): ArrayList에 index번째 위치에  value를 삽입한다
		
		System.out.println(list.get(1));
		
		list.set(1, new Person("ㅇㅇㅇ",1)); // set: 인덱스 번째 위치의 값을 수정
		list.remove(2);	 // 인덱스 번째 위치의 값 제거
		list.clear();// 모든 데이터를 제거한다
		

		
		
	}

}