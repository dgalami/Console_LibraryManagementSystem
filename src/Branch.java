
public class Branch extends Library{
	private int branch_Id;
	private String branch_Name;
	private Address branch_Location;
	
	public Branch() {
	
	}
	
	public Branch(int branch_Id, String branch_Name, String branch_Location, String streetName, String City, String State, String zipCode, String phoneNo) {
		super();
		this.branch_Id = branch_Id;
		this.branch_Name = branch_Name;
		this.branch_Location = new Address(streetName,City,State,zipCode,phoneNo);
	}

	//getters and setters
	public int getBranch_Id() {
		return branch_Id;
	}

	public void setBranch_Id(int branch_Id) {
		this.branch_Id = branch_Id;
	}

	public String getBranch_Name() {
		return branch_Name;
	}

	public void setBranch_Name(String branch_Name) {
		this.branch_Name = branch_Name;
	}


	@Override
	public String toString() {
		String display = this.getBranch_Id() + "\n" + this.getBranch_Name() + "\n" + branch_Location.toString();
		return display;
	}
	
	
	
	
}
