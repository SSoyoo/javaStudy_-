package ArrayList.bookshop;

import java.util.Arrays;

public class BookList {
	

	private Bookvo [] bookList; // 책 정보를 기억할 배열을 선한
	private int size; // 배열의 크기
	private int count; // 배열의 첨자, 배열에 저장된 데이터의 개수
	
	//기본 생성자가 실행되면 30권의 책을 저장 할 수 있는 배열을 만들고, 
	//배열의 크기를 넘겨받는 생성자가 실행되면 넘겨 받은 크기만큼 배열을 만든다
	
	public BookList() {
		this(30);
	}
	
	public Bookvo[] getBookList() {
		return bookList;
	}

	public void setBookList(Bookvo[] bookList) {
		this.bookList = bookList;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public BookList(int size) {
		this.size = size;
		bookList = new Bookvo[size];
	}

	@Override
	public String toString() {
		return "BookList [bookList=" + Arrays.toString(bookList) + "]";
	}
	
	
//bookList 에 bookvo클래스 객제를 저장하는 메소드	
	
	public void addBook(Bookvo book) {
		bookList[count++] = book;
		
	}
	
	 

}
