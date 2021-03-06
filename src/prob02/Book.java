package prob02;

public class Book {
	
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	public Book(int bookNo, String title, String author){
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this. stateCode = 1;
	}
	
	public void rent()
	{
		this.stateCode = 0;
		System.out.println(this.title + "이 대여 되었습니다.");
	}
	public void print(Book[] books) {
		for(int i=0; i<books.length; i++)
			System.out.println("Book Info : "+ books[i].getBookNo() + ", "
					+ books[i].getTitle() + ", " + books[i].getAuthor() + ", "
					+ (books[i].getStateCode() == 1? "재고 있음" : "대여중"));
	}
	

}
