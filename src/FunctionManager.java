import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class FunctionManager {
	
	public ArrayList<Job> addJobsByFile() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to import regular jobs (r) or contractual jobs (c)? ");
		char answer = scan.next().charAt(0);
		if (answer == 'r') {		
			ArrayList<Job> job = new ArrayList<Job>();
			String candFile = "C:\\Users\\Reagan\\Documents\\at_NSU\\Object Oriented Programming\\Jobs.txt";
			try {
				BufferedReader file = new BufferedReader(new FileReader(candFile));
				String line = file.readLine();		
				while (line != null) {				
					line = line.replaceAll("\\s+","");
					String[] candInfo = line.split(",",0);
					Job j = new Job();
					j.setName(candInfo[0]);
					j.setCompanyName(candInfo[1]);
					j.setEmail(candInfo[2]);
					j.setHours(Integer.parseInt(candInfo[3]));
					j.setPay(Double.parseDouble(candInfo[4]));								
					job.add(j);	
					line = file.readLine();	
				}
				file.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return job;
		} //end if
		
		else if (answer == 'c') {
			ArrayList<Job> job = new ArrayList<Job>();
			String candFile = "C:\\Users\\Reagan\\Documents\\at_NSU\\Object Oriented Programming\\ContractualJobs.txt";
			try {
				BufferedReader file = new BufferedReader(new FileReader(candFile));
				String line = file.readLine();		
				while (line != null) {				
					line = line.replaceAll("\\s+","");
					String[] candInfo = line.split(",",0);
					ContractualJob j = new ContractualJob();
					j.setName(candInfo[0]);
					j.setCompanyName(candInfo[1]);
					j.setEmail(candInfo[2]);
					j.setHours(Integer.parseInt(candInfo[3]));
					j.setPay(Double.parseDouble(candInfo[4]));			
					j.setProjectName(candInfo[5]);
					j.setEmploymentPeriod((Integer.parseInt(candInfo[6])));
					job.add(j);	
					line = file.readLine();	
				}
				file.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return job;
		} //end if
		return null;
	}
	
	public ArrayList<Applicant> addApplicantsByFile() {
		ArrayList<Applicant> applicant = new ArrayList<Applicant>();
		String candFile = "C:\\Users\\Reagan\\Documents\\at_NSU\\Object Oriented Programming\\Candidates.txt";
		try {
			BufferedReader file = new BufferedReader(new FileReader(candFile));
			String line = file.readLine();		
			while (line != null) {
				line = line.replaceAll("\\s+","");
				String[] candInfo = line.split(",",0);
				String fName = candInfo[0];
				String lName = candInfo[1];
				String phone = candInfo[2];
				String email = candInfo[3];
				String DOB = candInfo[4];
				String SSN = candInfo[5];
				String jobPosition = candInfo[6];				
				Applicant a = new Applicant(fName, lName, phone, email, DOB, SSN, jobPosition);
				applicant.add(a);							
				line = file.readLine();			
			}
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return applicant;
	}
	
	public ArrayList<Employer> addEmployersByFile() {
		ArrayList<Employer> employer = new ArrayList<Employer>();
		String candFile = "C:\\Users\\Reagan\\Documents\\at_NSU\\Object Oriented Programming\\Employers.txt";
		try {
			BufferedReader file = new BufferedReader(new FileReader(candFile));
			String line = file.readLine();		
			while (line != null) {
				line = line.replaceAll("\\s+","");
				String[] candInfo = line.split(",",0);
				String fName = candInfo[0];
				String lName = candInfo[1];
				String phone = candInfo[2];
				String email = candInfo[3];
				String comanyName = candInfo[4];
				String contactTitle = candInfo[5];
				String ExtNum = candInfo[6];				
				Employer e = new Employer(fName, lName, phone, email, comanyName, contactTitle, ExtNum);
				employer.add(e);							
				line = file.readLine();			
			}
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employer;
	}
	
	public Job addJob() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to add a regular (r) job or contractual (c) job?");
		char jobResponse = scan.next().charAt(0);
		if (jobResponse == 'r') {
			Job j = new Job();
			System.out.println("Enter the job title: ");
			scan.nextLine();
			j.setName(scan.nextLine());
			System.out.println("Enter the company name: ");
			j.setCompanyName(scan.nextLine());
			System.out.println("Enter the job email address: ");
			j.setEmail(scan.nextLine());
			System.out.println("Enter the hours: ");
			j.setHours(scan.nextInt());
			System.out.println("Enter the minimum pay: ");
			j.setPay(scan.nextDouble());
			return j;
		}
		else if (jobResponse == 'c') {
			ContractualJob j = new ContractualJob();
			System.out.println("Enter the job title: ");
			j.setName(scan.nextLine());
			System.out.println("Enter the company name: ");
			j.setCompanyName(scan.nextLine());
			System.out.println("Enter the job email address: ");
			j.setEmail(scan.nextLine());
			System.out.println("Enter the hours: ");
			j.setHours(scan.nextInt());
			System.out.println("Enter the minimum pay: ");
			j.setPay(scan.nextDouble());
			System.out.println("Enter the name of the project that will be performed: ");
			j.setProjectName(scan.nextLine());
			System.out.println("Enter the duration period (in months) of this job: ");
			j.setEmploymentPeriod(scan.nextInt());
			return j;
		}				
		return null;
	}
	
	public Applicant addApplicant() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter applicants first name: ");
		String fName = scan.nextLine();
		System.out.println("Enter applicants last name: ");
		String lName = scan.nextLine();
		System.out.println("Enter applicants phone number: ");
		String phoneNo = scan.nextLine();
		System.out.println("Enter applicants email: ");
		String email = scan.nextLine();
		System.out.println("Enter applicants Date of Birth: ");
		String DOB = scan.nextLine();
		System.out.println("Enter applicants SSN: ");
		String SSN = scan.nextLine();
		System.out.println("Enter applicants job position: ");
		String jobPosition = scan.nextLine();
		Applicant a = new Applicant(fName, lName, phoneNo, email, DOB, SSN, jobPosition);
		return a;
	}
	
	public Employer addEmployer() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employer's first name: ");
		String fName = scan.next();
		System.out.println("Enter employer's last name: ");
		String lName = scan.next();
		System.out.println("Enter employer's phone number: ");
		String phoneNo = scan.next();
		System.out.println("Enter employer's email: ");
		String email = scan.next();
		System.out.println("Enter employer's Company Name: ");
		String companyName = scan.next();
		System.out.println("Enter employer's Contact Title: ");
		String contactTitle = scan.next();
		System.out.println("Enter employer's extension number: ");
		String extNo = scan.next();
		Employer e = new Employer(fName, lName, phoneNo, email, companyName, contactTitle, extNo);
		return e;
	}
	
	public Job deleteJob (ArrayList<Job> j) {
		System.out.println("Enter the name of the job that you want to delete: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.printf("Are you sure you would like to permanently delete %s? (y/n)\n"
				+ "This action CANNOT be undone\n", name);
		char answer = scan.next().trim().charAt(0);
		if (answer == 'y') {
			for (int i = 0; i < j.size(); i++) {
				if (j.get(i).getName().equals(name)) {
					return j.get(i);
				}
			}
		}
		return null;
	}
	
	public Applicant deleteApplicant(ArrayList<Applicant> a) {
		System.out.println("Enter the name of the applicant that you want to delete: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.printf("Are you sure you would like to permanently delete %s? (y/n)\n"
				+ "This action CANNOT be undone\n", name);
		char answer = scan.next().trim().charAt(0);
		if (answer == 'y') {
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i).fName.equals(name)) {
					return a.get(i);
				}
			}
			System.out.printf("%s has been deleted", name);
		}
		else System.out.printf("%s has not been deleted\n", name);
		return null;
	}
	
	public Employer deleteEmployer(ArrayList<Employer> e) {
		System.out.println("Enter the name of the employer that you want to delete: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.printf("Are you sure you would like to permanently delete %s? (y/n)\n"
				+ "This action CANNOT be undone\n", name);
		char answer = scan.next().trim().charAt(0);
		if (answer == 'y') {
			for (int i = 0; i < e.size(); i++) {
				if (e.get(i).fName.equals(name)) {
					return e.get(i);
				}
			}
			System.out.printf("%s has been deleted", name);
		}
		else System.out.printf("%s has not been deleted\n", name);
		return null;
	}
	
	public void modifyApplicant(ArrayList<Applicant> a) {
		// TODO Auto-generated method stub
		boolean b = true;
		do {
			System.out.println("Enter the name of the applicant that you want to modify: ");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();
			int x = 0;
			int response = 0;
			for (int i = 0; i < a.size(); i++) {
				if (name.equals(a.get(i).fName)) {
					System.out.printf("Are you sure you want to make changes to %s? (y/n)", name);
					char answer = scan.next().trim().charAt(0);
					if (answer == 'y')
					do {
						b = true;
						if (x == 0) System.out.printf("Select what you would like to modify for %s?\n", a.get(i).fName);
						else System.out.printf("Select what else you would like to modify for %s?\n", a.get(i).fName);
						System.out.println("1. First Name\n"
								+ "2. Last Name\n"
								+ "3. Phone Number\n"
								+ "4. Email Address\n"
								+ "5. Date of Birth\n"
								+ "6. SSN\n"
								+ "7. Job Position\n"
								+ "8. Go back to Applicant Menu");
						response = scan.nextInt();
						scan.nextLine();
						switch (response) {
						case 1: {
							System.out.println("Edit the first name for the applicant: ");
							a.get(i).fName = scan.nextLine();
						}
						break;
						case 2: {
							System.out.println("Edit the last name for the applicant: ");
							a.get(i).lName = scan.nextLine();
						}
						break;
						case 3: {
							System.out.println("Edit the phone number of the applicant: ");
							a.get(i).phoneNo = scan.nextLine();
						}
						break;
						case 4: {
							System.out.println("Edit the email address of the applicant: ");
							a.get(i).email = scan.nextLine();
						}
						break;
						case 5: {
							System.out.println("Edit the birthday of the applicant: ");
							a.get(i).dateOfBirth = scan.nextLine();
						}
						break;
						case 6: {
							System.out.println("Edit the SSN of the applicant: ");
							a.get(i).SSN = scan.nextLine();
						}
						break;
						case 7: {
							System.out.println("Edit the job position for the applicant: ");
							a.get(i).jobPosition = scan.nextLine();
						}
						break;
						case 8: 
						break;
						}
						x = 1;
					} while (response != 8); //end while
				} //end if
				else if (i == a.size()-1 && response != 8){
					System.out.printf("Error finding %s. Try again\n", name);
					b = false;
				}
			} //end for
		} while (b == false);//end do while
	} //end function
	
	public void modifyEmployer(ArrayList<Employer> e) {
		// TODO Auto-generated method stub
		System.out.println("Enter the name of the employer that you want to modify: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		int response = 0;
		for (int i = 0; i < e.size(); i++) {
			if (name.equals(e.get(i).fName)) {
				System.out.printf("Are you sure you want to make changes to %s? (y/n)", name);
				char answer = scan.next().trim().charAt(0);
				if (answer == 'y')
				do {
					System.out.printf("Select what you would like to modify for %s?\n", e.get(i).fName);
					System.out.println("1. First Name\n"
							+ "2. Last Name\n"
							+ "3. Phone Number\n"
							+ "4. Email Address\n"
							+ "5. Company Title"
							+ "6. Contact Title\n"
							+ "7. Extension Number\n"
							+ "8. Go back to Applicant Menu");
					response = scan.nextInt();
					scan.nextLine();
					switch (response) {
					case 1: {
						System.out.println("Edit the first name for the employer: ");
						e.get(i).fName = scan.nextLine();
					}
					break;
					case 2: {
						System.out.println("Edit the last name for the employer: ");
						e.get(i).lName = scan.nextLine();
					}
					break;
					case 3: {
						System.out.println("Edit the phone number of the employer: ");
						e.get(i).phoneNo = scan.nextLine();
					}
					break;
					case 4: {
						System.out.println("Edit the email address of the employer: ");
						e.get(i).email = scan.nextLine();
					}
					break;
					case 5: {
						System.out.println("Edit the company name of the employer: ");
						e.get(i).companyName = scan.nextLine();
					}
					break;
					case 6: {
						System.out.println("Edit the contact title of the employer: ");
						e.get(i).contactTitle = scan.nextLine();
					}
					break;
					case 7: {
						System.out.println("Edit the extension number for the employer: ");
						e.get(i).extNo = scan.nextLine();
					}
					break;
					}
				} while (response != 8);
			}
		}		
	}
	
	public void searchAndEditJobs(ArrayList<Job> j) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the job name that you would like to search: ");
		String name = scan.nextLine(); 
		if (j.size() != 0)
			for (int i = 0; i < j.size(); i++) 
				if (j.get(i).getName().equals(name)) {
					System.out.printf("Found: %s\n"
							+ "Would you like to edit this job? (y/n)", name);
					char answer = scan.next().charAt(0);
					if (answer == 'y') {
						System.out.println("What would you like to edit?\n"
								+ "1. Job name\n"
								+ "2. Company Name\n"
								+ "3. Email\n"
								+ "4. Hours\n"
								+ "5. Pay\n"
								+ "6. Back to Job Menu");
						int response = scan.nextInt();
						scan.nextLine();
						switch (response) {
						case 1: {
							System.out.println("Edit the job name: ");
							j.get(i).setName(scan.nextLine());
						}
						break;
						case 2: {
							System.out.println("Edit the company name: ");
							j.get(i).setCompanyName(scan.nextLine());
						}
						break;
						case 3: {
							System.out.println("Edit the job email: ");
							j.get(i).setEmail(scan.nextLine());
						}
						break;
						case 4: {
							System.out.println("Edit the job hours: ");
							j.get(i).setHours(scan.nextInt());
						}
						break;
						case 5: {
							System.out.println("Edit the job pay: ");
							j.get(i).setPay(scan.nextDouble());
						}
						break;
						} //end switch
					} //end if
				} //end if					
	}
	
	public void viewJobs(ArrayList<Job> j) {
		if (j.size() != 0)
			for (int i = 0; i < j.size(); i++) 
				j.get(i).printJobInfo();
	}
	
	public void viewApplicants(ArrayList<Applicant> a) {
		if (a.size() != 0)
			for (int i = 0; i < a.size(); i++)
				a.get(i).PrintInfo();
	}
	
	public void viewEmployers(ArrayList<Employer> e) {
		if (e.size() != 0)
			for (int i = 0; i < e.size(); i++)
				e.get(i).PrintInfo();
	}
	
	public void updateApplicantsFile(ArrayList<Applicant> a) {
		String candFile = "C:\\Users\\Reagan\\Documents\\at_NSU\\Object Oriented Programming\\CandidatesOut.txt";
		BufferedWriter bufferW = null;
		FileWriter fileW = null;
		try {
			fileW = new FileWriter(candFile);
			bufferW = new BufferedWriter(fileW);
			if (a.size() != 0)
				for (int i = 0; i < a.size(); i++)
					bufferW.write(a.get(i).writeToFile() + "\r\n");
			bufferW.close();					
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void updateEmployersFile(ArrayList<Employer> e) {
		String candFile = "C:\\Users\\Reagan\\Documents\\at_NSU\\Object Oriented Programming\\EmployersOut.txt";
		BufferedWriter bufferW = null;
		FileWriter fileW = null;
		try {
			fileW = new FileWriter(candFile);
			bufferW = new BufferedWriter(fileW);
			if (e.size() != 0)
				for (int i = 0; i < e.size(); i++)
					bufferW.write(e.get(i).writeToFile() + "\r\n");			
			bufferW.close();					
		}
		catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
}
