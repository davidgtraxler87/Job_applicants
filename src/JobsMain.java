//Reagan Rosell
//HW4 Job Applicants Tracking
//12/7//2018

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;

public class JobsMain {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int response = 0;
		ArrayList<Job> job = new ArrayList<Job>();
		ArrayList<Applicant> applicant = new ArrayList<Applicant>();
		ArrayList<Employer> employer = new ArrayList<Employer>();
		FunctionManager man = new FunctionManager();
		
		do {
			System.out.println("Main Menu \n"
					+ "Make a selection: \n"
					+ "1. Job Applicant\n"
					+ "2. Employer\n"
					+ "3. Job\n"
					+ "4. Exit");
			response = scan.nextInt();
			if (response == 1) {
				do {
					System.out.println("\nApplicant Menu 1\n"
							+ "1. View applicants\n"
							+ "2. Import applicants from file\n"
							+ "3. Add an applicant\n"
							+ "4. Edit an applicant\n"
							+ "5. Delete an applicant\n"
							+ "6. Clear applicant list\n"
							+ "7. Update file\n"
							+ "8. Go back to main menu");
					response = scan.nextInt();
					switch (response) {
					case 1: {
						man.viewApplicants(applicant);					
					}
					break;
					case 2: {
						applicant = man.addApplicantsByFile();
					}
					break;
					case 3: {
						applicant.add(man.addApplicant());						
					}				
					break;
					case 4: {
						man.modifyApplicant(applicant);
						response = 0;
					}
					break;
					case 5: {
						applicant.remove(man.deleteApplicant(applicant));
					}
					break;
					case 6: {
						applicant.clear();
					}
					break;
					case 7: {
						man.updateApplicantsFile(applicant);
					}
					break;
					case 8: 
					break;
					} //end switch 
				} while (response != 8); //end while 
			} //end if
			else if (response == 2) {
				do {
					System.out.println("\nEmployer Menu 1\n"
							+ "1. View employers\n"
							+ "2. Import employers from file\n"
							+ "3. Add an employer\n"
							+ "4. Edit an employer\n"
							+ "5. Delete an employer\n"
							+ "6. Clear employer list\n"
							+ "7. Update file\n"
							+ "8. Go back to main menu");
					response = scan.nextInt();
					switch (response) {
					case 1: {
						man.viewEmployers(employer);					
					}
					break;
					case 2: {
						employer = man.addEmployersByFile();
					}
					break;
					case 3: {
						employer.add(man.addEmployer());					
					}				
					break;
					case 4: {
						man.modifyEmployer(employer);
						response = 0;
					}
					break;
					case 5: {
						employer.remove(man.deleteEmployer(employer));
					}
					break;
					case 6: {
						employer.clear();
					}
					break;
					case 7: {
						man.updateEmployersFile(employer);
					}
					case 8: 
					break;
					} //end switch
				}while (response != 8); //end while
			} 	//end else if
			else if (response == 3) {
				do {
					System.out.println("\nJob Menu 1\n"
							+ "1. View jobs\n"
							+ "2. Search for and/or edit a job\n"
							+ "3. import jobs from file\n"
							+ "4. Add job\n"
							+ "5. Delete job\n"
							+ "6. Clear job list\n"
							+ "7. Go back to main menu");
					response = scan.nextInt();
					switch (response) {
					case 1: {
						man.viewJobs(job);
						System.out.println();
					}
					break;
					case 2: {
						man.searchAndEditJobs(job);
					}
					break;
					case 3: {						
						job = man.addJobsByFile();
					}
					break;
					case 4: {
						job.add(man.addJob());
					}
					break;
					case 5: {
						job.remove(man.deleteJob(job));
					}
					break;
					case 6: {
						System.out.println("Are you sure you want to clear this job list? (y/n");
						char answer = scan.next().charAt(0);
						if (answer == 'y')
							job.clear();
					}
					break;
					case 7:
						break;
					} //end switch
				} while (response != 7); //end while
			}
			else if (response > 4) System.out.println("Error. Try again");
			System.out.println();
		} while (response != 4);	//end main while loop
		scan.close();				
	} //end main function
} //end class
