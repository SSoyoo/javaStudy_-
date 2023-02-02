package ArrayList.bookshop;

import java.util.Date;

public class BookshopMain {

	public static void main(String[] args) {
//		Date date = new Data() : 현재 컴퓨터 시스템의 날짜와 시간을 얻어온다
//		Data data = new Data(년, 월, 일) : 입력한 년 월 일에 해당하는 날짜를 만든다
// 		날짜를 만들어거나 입력하는 경우 Data  클래스는 1900년을 기준으로 처리하므로 
//		년은 1900을 빼고 월은 1을 빼서 입력해야 한다,
		
		Bookvo book1 = new Bookvo("자바", "홍길동", "ㅂㅂ출판사", new Date(2022, 3,9), 30000);
		Bookvo book2 = new Bookvo("C++", "가길동", "ㅇㅇ출판사", new Date(2022, 3,9), 30000);
		Bookvo book3 = new Bookvo("파이썬", "나길동", "ㅁㅁ출판사", new Date(2022, 3,9), 30000);
		Bookvo book4 = new Bookvo("자바스크립트", "다길동", "ㄷㄷ출판사", new Date(2022, 3,9), 30000);
		Bookvo book5 = new Bookvo("SQL", "홍길동", "ㅂㅂ출판사", new Date(2022, 3,9), 30000);
		
		
		
		BookList bookList = new BookList(5);
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		
		System.out.println(bookList);
	}

}
