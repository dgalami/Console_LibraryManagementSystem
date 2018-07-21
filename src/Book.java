
public class Book {
	private int book_Id;
	private String author;
	private String isbn;
	private String title;
	private int numberOfPages;
	
	
	public Book() {
	
	}
	public Book(int book_Id, String author, String isbn, String title, int numberOfPages) {
		this.book_Id = book_Id;
		this.author = author;
		this.isbn = isbn;
		this.title = title;
		this.numberOfPages = numberOfPages;
	}
	
	//getters and setters
	public int getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	@Override
	public String toString() {
		String display = this.getBook_Id() + "\n" + this.getAuthor() + "\n" + this.getIsbn() + "\n" + this.getTitle() + "\n" + this.getNumberOfPages();
		return display;
	}
}
