import java.util.ArrayList;

public class Job implements JobInterface	{	//Regular Job //Extends function manager?
	
	private String name;
	private String companyName;
	private String email;
	//private String description;
	private int hours;
	private double pay;
	//ArrayList<Applicant> applicant = new ArrayList<Applicant>();
	//ArrayList<Employer> employer = new ArrayList<Employer>();
	//use jobs.addApplicants
	
	@Override
	public void printJobInfo() {
		// TODO Auto-generated method stub
		System.out.printf("\nJob Title: %s; Company Name: %s; Job Email: %s; Hours: %d; Pay: %.2f"
				+ "", name, companyName, email, hours, pay);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setCompanyName(String companyName) {
		// TODO Auto-generated method stub
		this.companyName = companyName;
	}

	@Override
	public String getCompanyName() {
		// TODO Auto-generated method stub
		return companyName;
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email = email;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public void setHours(int hours) {
		// TODO Auto-generated method stub
		this.hours = hours;
	}

	@Override
	public int getHours() {
		// TODO Auto-generated method stub
		return hours;
	}

	@Override
	public void setPay(double pay) {
		// TODO Auto-generated method stub
		this.pay = pay;
	}

	@Override
	public double getPay() {
		// TODO Auto-generated method stub
		return pay;
	}
	
	

}