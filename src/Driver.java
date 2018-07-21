import java.util.Scanner;

public class Driver {
	public static Scanner input = new Scanner(System.in);
	public static Library lib = new Library();
	private static Customer cust;
	
	public static void main(String[] args) {
		
		UI();
	
	}
	
	public static void UI() {
		int choice;
		do {
			initialize();
			choice = input.nextInt();
			input.nextLine();
			switch(choice) {
			case 1:
				System.out.print("Enter Customer ID: ");
				int id = input.nextInt();
				boolean valid = false;
				for(Customer c: lib.getCustomerList()) 
				{
					if(c.getCustomer_ID() == id) {
						System.out.println(c.getCustomer_ID() + "\n" + c.getCust_Name() + "\n" + c.getCust_Email());
						cust = c;
						valid = true;

					}
				}
				
					if(valid) {
						customerProcess();
					} else {
						System.out.println("Invalid ID!");
					}
					
				break;
			case 2:
				lib.addNewCustomer();
				break;
			case 3:
				lib.addBooks();
				break;
			case 4:
				lib.displayCustomerList();
				break;
			case 5:
				lib.displayBookList();
				break;
			default:
				System.out.println("Invalid Input\n");
				break;
			}
		}while(choice != 6);
	}
	
	public static void customerProcess() {
		int customerChoice;
		do {
			customerUI();
			customerChoice = input.nextInt();
			input.nextLine();
			switch(customerChoice) {
			case 1:
				System.out.print("Enter book Id to search: ");
				int bookId = input.nextInt();
				lib.searchBookBYId(bookId);
				break;
			case 2:
				System.out.print("Enter Id of book to Return: ");
				int myId = input.nextInt();
				lib.returnBook(myId, cust);
				break;
			case 3:
				System.out.print("Enter book Id to Issue: ");
				int id = input.nextInt();
				lib.issueBook(id, cust);
				break;
			case 4:
				System.out.println("Display book issued");
				System.out.printf("%5s%12s%12s%14s%5s\n","Book_ID","Author","ISBN","Title","No of Page");
				System.out.println("----------------------------------------------------------------------------------");
				for(Book b : cust.getBooksIssued()) {
					System.out.printf("%5d %-15s %-15s %-20s %5d\n",b.getBook_Id(),b.getAuthor(), b.getIsbn(), b.getTitle(), b.getNumberOfPages());
				}
				System.out.println();
				break;
			case 5:
				UI();
				break;
			default:
				break;
			}
		}while(customerChoice != 6);
		
	}
	
	public static void initialize() {
		System.out.println("***************Welcome to Library Management System***************");
		System.out.println("1 - Existing Customer");
		System.out.println("2 - Add new Customer");
		System.out.println("3 - Add new Book");
		System.out.println("4 - Display Customer List");
		System.out.println("5 - Display Book List");
		System.out.println("6 - Exit");
	}
	
	public static void customerUI(){
		System.out.println("***************Customer Interface***************");
		System.out.println("1 - Search Books");
		System.out.println("2 - Return Books");
		System.out.println("3 - Issue Books");
		System.out.println("4 - View issue Book Details");
		System.out.println("5 - Return to main menu");
		System.out.println("6 - Exit");
	}
	
	

} //end of class


