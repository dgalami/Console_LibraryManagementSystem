import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int customer_ID;
	private String cust_Name;
	private String cust_Email;
	private Address cust_Address;
	
	private List<Book> booksIssued = new ArrayList<Book>();
	
	public Customer() {
		
	}
	
	public Customer(int customer_ID, String cust_Name, String cust_Email, String streetName, String City, String State, String zipCode, String phoneNo ) {
		this.customer_ID = customer_ID;
		this.cust_Name = cust_Name;
		this.cust_Email = cust_Email;
		this.cust_Address = new Address(streetName,City,State,zipCode,phoneNo);
	}


	//getters and setters
	public int getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getCust_Name() {
		return cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	public String getCust_Email() {
		return cust_Email;
	}
	public void setCust_Email(String cust_Email) {
		this.cust_Email = cust_Email;
	}
	
	//issued book list
	public List<Book> getBooksIssued() {
		return booksIssued;
	}


	public void addBooksIssued(Book bookIssued, Customer cust) {
		cust.booksIssued.add(bookIssued);
	}
	


	//@Override
	public String toString() {
		String display = this.getCustomer_ID() + "\n" + this.getCust_Name() + "\n" + this.getCust_Email()  + "\n" + cust_Address.toString();
		return display;
	}
	
	
}
