package ArrayList.bookshop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bookvo { // 책 한권의 정보를 기억하는 클래스
	
	public Bookvo(String title, String author, String publisher, Date date, double price) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		date.setYear(date.getYear()-1900);
		date.setMonth(date.getMonth()-1);
		this.date = date;
		this.price = price;
	}

	private String title;
	private String author;
	private String publisher;
	private Date date;
	private double price;
	
	public Bookvo() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM dd(E)");
		return String.format("%s %s %s %s %.2f", title , author, publisher,sdf.format(date),price);
	}
	
	
	
	
}
