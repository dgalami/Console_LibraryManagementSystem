import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;




public class Library {
	private List<Customer> customerList = new ArrayList<Customer>();
	private List<Book> bookList = new ArrayList<Book>();
	Customer cust = null;
	Book book = null;
	
	Scanner input = new Scanner(System.in);
	
	public Library() {
		
	}
	
	//getters and setters
	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}


	public List<Book> getBookList() {
		return bookList;
	}


	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addNewCustomer() {
		System.out.print("Enter new Customer Name: ");
		String name = input.nextLine();
		System.out.print("Enter email address: ");
		String email = input.nextLine();
		System.out.print("Enter the address seperated by ['Eg. street name,city,state,zipcode,phone no']: ");
		String address = input.nextLine();
		
		String[] value = address.trim().split(",");
		cust = new Customer(idGenerator(), name, email, value[0], value[1], value[2], value[3], value[4]);
		customerList.add(cust);
		
		System.out.println("Customer added Successfully!\n");
		
	}
	
	public void displayCustomerList() {
		System.out.printf("%s%9s%25s\n","Customer_ID","Name","Email");
		System.out.println("-----------------------------------------------------------------");
		for(Customer c: customerList) {
			System.out.printf("%10d%15s%30s\n",c.getCustomer_ID(),c.getCust_Name(),c.getCust_Email());
		}
		System.out.println();
	}
	public void displayBookList() {
		System.out.printf("%5s%12s%12s%14s%5s\n","Book_ID","Author","ISBN","Title","No of Page");
		System.out.println("-----------------------------------------------------------------");
		for(Book b: bookList) {
			System.out.printf("%5d %-15s %-15s %-20s %5d\n",b.getBook_Id(),b.getAuthor(),b.getIsbn(),b.getTitle(),b.getNumberOfPages());
		}
		System.out.println();
	}
	


	public int idGenerator() {
		Random rand = new Random();
		int result = rand.nextInt((100 - 1) + 1) + 1;
		return result;
	}
	
	public int countTotalBook() {
		return bookList.size();
		
	}
	public void addBooks() {
		System.out.print("Enter autor name: ");
		String author = input.nextLine();
		System.out.print("Enter isbn: ");
		String isbn = input.nextLine();
		System.out.print("Enter title: ");
		String title = input.nextLine();
		System.out.print("Enter no of page: ");
		int noOfPage = input.nextInt();
		input.nextLine();
		book = new Book(idGenerator(),author, isbn, title, noOfPage);
		bookList.add(book);
		System.out.println("Book Added Successfully\n");
	}
	
	public void returnBook(int bookId, Customer c) {
		Book myBook = null;
		for(Book b: c.getBooksIssued()) {
			if(bookId == b.getBook_Id()) {
				myBook = b;
				bookList.add(b);
				break;
			}
		}
		c.getBooksIssued().remove(myBook);
		System.out.println("Book Returned.\n");
		
	}
	
	public void issueBook(int bookId, Customer c) {
		Book myBook = null;
		for(Book b : bookList) {
			if(bookId == b.getBook_Id()) {
				myBook = b;
				c.addBooksIssued(b,c);
				break;
			}
		}
		
		bookList.remove(myBook);
		System.out.println("Book Issued Complete.\n");
	}
	
	public void searchBookBYId(int bookId) {
		boolean valid = false;
		for(Book b : bookList) {
			if(bookId == b.getBook_Id()) {
				valid = true;
				System.out.println("\t" + b.getBook_Id() + "\t" + b.getAuthor() + "\t" + b.getIsbn() + "\t" + b.getTitle() + "\t" + b.getNumberOfPages());
			} 
		}
		if(!valid) {
			System.out.println("Book not found!\n");
		}
	}
	
	
	
}
