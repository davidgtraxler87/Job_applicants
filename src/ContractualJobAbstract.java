
public abstract class ContractualJobAbstract extends Job {
	protected String projectName;
	protected int employmentPeriod;
	
	public abstract void setProjectName(String projectName);
	public abstract String getProjectName();
	public abstract void setEmploymentPeriod(int EmploymentPeriod);
	public abstract int getEmploymentPeriod();
	
	public void printJobInfo() {
		super.printJobInfo();
		System.out.printf("; Project name: %s; EmploymentPeriod: %d months", projectName, employmentPeriod);
	}
}
