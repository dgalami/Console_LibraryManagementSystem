
public class Address {
	private String streetName;
	private String City;
	private String State;
	private String zipCode;
	private String phoneNo;
	

	//default constructor
	public Address() {
	
	}
	//constructor overload
	public Address(String streetName, String City, String State, String zipCode, String phoneNo) {
		this.setStreetName(streetName);
		this.setCity(City);
		this.setState(State);
		this.setZipCode(zipCode);
		this.setPhoneNo(phoneNo);
	}
	
	//getters
	public String getStreetName() {
		return streetName;
	}
	public String getCity() {
		return City;
	}
	public String getState() {
		return State;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	//setters
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setCity(String City) {
		this.City = City;
	}
	public void setState(String State) {
		this.State = State;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String toString() {
		String display = this.getStreetName() + "\n" + this.getCity() + ", " + this.getState() + ", "
				+ this.getZipCode() + "\n" + this.getPhoneNo();
		return display;
	}
}


