
public class Employer extends Person {
	protected String companyName, contactTitle, extNo;
	
	public Employer (String fName, String lName, String phoneNo, String email, String companyName, String contactTitle, String extNo) {
		//place a call to superclass constructor
		//are initialized int the superclass: String fName, String lName, String phoneNo, String email
		super(fName, lName, phoneNo, email);
		this.companyName = companyName;
		this.contactTitle = contactTitle;
		this.extNo = extNo;
		
	}
	
	public void PrintInfo() {
		super.PrintInfo();
		System.out.printf(" Company Name: %s; Contact Title: %s; Extension Number: %s\n", companyName, contactTitle, extNo);
	}
	
	public String writeToFile() {
		String s = super.writeToFile();
		s += String.format(" %s, %s, %s\n", companyName, contactTitle, extNo);
		return s;
	}
}
