import java.util.ArrayList;
import java.util.Scanner;
public class jobsMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char mainResponse = 'X';
		int response = 0;
		int response2 = 0;
		ArrayList<Job> job = new ArrayList<Job>();
		//ArrayList<Applicant> applicant = new ArrayList<Applicant>();
		//ArrayList<Employer> employer = new ArrayList<Employer>();
		FunctionManager man = new FunctionManager();
		
		System.out.println("Welcome to the Jobs Database!\nThis is one of the most convenient resources"
				+ " for adding and searching jobs, applicants, and employers. \n"
				+ "If you are looking to hire or are looking for a job, you've come to the right place.\n"
				+ "Feel free to choose any option from the menu below:\n");
		System.out.println("What would you like to do?\n"
				+ "A. View Jobs\n"
				+ "B. Manage Job Personnel\n"
				+ "C. Add Jobs\n"
				+ "D. Delete Jobs\n"
				+ "E. Exit");				
		mainResponse = scan.next().charAt(0);
		do {
			if (mainResponse != 'a' || mainResponse != 'A') {
				for (int i = 0; i < job.size(); i++) 
					job.get(i).printJobInfo();
			} //end if 
			if (mainResponse != 'b' || mainResponse != 'B') {
				System.out.println("Select a job: ");
				for (int i = 0; i < job.size(); i++) 
					job.get(i).printJobInfo();
				String jobSelection = scan.nextLine();
				//Job sel = new Job();
				System.out.println("What would you like to do with this job\n"
						+ "1. Manage applicants for this job\n"
						+ "2. Manage employers for this job\n"
						+ "3. View applicants for this job\n"
						+ "4. View employers for this job\n"
						+ "5. Back to Main Menu");
				response = scan.nextInt();
				switch (response) {
				case 1: {
					
				} break; //end case 1
				case 2: {
					
				} break; //end case 2
				case 3: {
					
				} break; //end case 3
				case 4: {
					for (int i = 0; i < job.size(); i++) {
						//if (job[i] = 
					} //end for 
				} break; //end case 4
				case 5: 
					 break; //end case 5				
				} //end switch
			} //end if
			if (mainResponse != 'c' || mainResponse != 'C') {
				System.out.println("Would you like to add a regular (r) job or contractual (c) job?");
				char jobResponse = scan.next().charAt(0);
				if (jobResponse == 'r') {
					Job j = new Job();
					System.out.println("Enter the job title: ");
					j.setName(scan.nextLine());
					System.out.println("Enter the company name: ");
					j.setCompanyName(scan.nextLine());
					System.out.println("Enter the job department: ");
					//j.setDepartment(scan.nextLine());
					System.out.println("Enter the hours: ");
					j.setHours(scan.nextInt());
					System.out.println("Enter the minimum pay: ");
					j.setPay(scan.nextDouble());
					job.add(j);
				}
				else if (jobResponse == 'c') {
					ContractualJob j = new ContractualJob();
					System.out.println("Enter the job title: ");
					j.setName(scan.nextLine());
					System.out.println("Enter the company name: ");
					j.setCompanyName(scan.nextLine());
					System.out.println("Enter the job department: ");
					//j.setDepartment(scan.nextLine());
					System.out.println("Enter the hours: ");
					j.setHours(scan.nextInt());
					System.out.println("Enter the minimum pay: ");
					j.setPay(scan.nextDouble());
					System.out.println("Enter the name of the project that will be performed: ");
					j.setProjectName(scan.nextLine());
					System.out.println("Enter the duration period (in months) of this job: ");
					j.setEmploymentPeriod(scan.nextInt());
					job.add(j);
				}								
			} //end if
			if (mainResponse != 'd' || mainResponse != 'D') {
				
			} //end if
		} while (mainResponse != 'e' || mainResponse != 'E');
		scan.close();
	}	//end main function
}	//end class
