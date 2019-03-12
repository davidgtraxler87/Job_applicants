
public class Person {
	protected String fName;
	protected String lName; 
	protected String phoneNo;
	protected String email;
	
	public Person(String fName, String lName, String phoneNo, String email) {
		this.fName = fName;
		this.lName = lName;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	
	public void PrintInfo() {
		System.out.printf("\nPerson: %s %s; Phone#: %s; Email:%s;"  , fName, lName, phoneNo, email);
	}
	
	public String writeToFile() {
		String s = String.format("\n%s, %s, %s, %s,"  , fName, lName, phoneNo, email);
		return s;
	}
}
