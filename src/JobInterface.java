
public interface JobInterface {
		
	public void printJobInfo();
	//print "This full time job..."
	//print "This part time job..."
	
	public void setName(String name);
	public String getName();
	public void setCompanyName(String companyName);
	public String getCompanyName();
	public void setEmail(String department);
	public String getEmail();
	public void setHours(int hours);
	//part time is only 10-30 hours a week
	//full time is 31-80 hours a week
	public int getHours();
	public void setPay(double pay);
	public double getPay();
	//public void setDescription(String description);
	//public String getDescription();
	//When creating an applicant
	
}
