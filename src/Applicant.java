
public class Applicant extends Person {
	protected String dateOfBirth;
	protected String SSN;
	protected String jobPosition;
	
	public Applicant (String fName, String lName, String phoneNo, String email,
			String dateOfBirth, String SSN, String jobPosition) {
		super(fName, lName, phoneNo, email);
		this.dateOfBirth = dateOfBirth;
		this.SSN = SSN;
		this.jobPosition = jobPosition;		
	}
	
	public void PrintInfo() {
		super.PrintInfo();
		System.out.printf(" DOB: %s; SSN: %s; Position: %s\n", dateOfBirth, SSN, jobPosition);
	}
	
	public String writeToFile() {
		String s = super.writeToFile();
		s += String.format(" %s, %s, %s\n", dateOfBirth, SSN, jobPosition);
		return s;
	}
}


