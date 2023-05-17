package studentdatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses;
	private int tuitonBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	//Constructor : User to generate student name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1- Freshmen\n2- Sophmore\n3- Junior\n4- Senior\nEnter Student class level : ");
		this.gradeYear = in.nextInt();
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " "+ gradeYear + " "+ studentId);
		
		
	}
	
	// generate Id
	private void setStudentID() {
		//Grade level id
		id++;
		this.studentId = gradeYear +""+ id;	
	}
	// Enroll the course
	public void enroll() {
		//get inside a loop user hits 0
		do {
		System.out.println("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q") ) {
			courses = courses + "\n" + course;
			tuitonBalance = tuitonBalance + costOfCourse;
		}
		else {
			
	System.out.println("BREAK");		break;}
		
		}while(1!=0);
		System.out.println("ENROLLED IN :" +courses);
		System.out.println("TUITION BALANCE :" +tuitonBalance);
			
			}
	//view balnace
	public void viewBalance() {
		System.out.println("Your Balance is: $" + tuitonBalance );
	}
	//pay tuiton
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your Payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitonBalance = tuitonBalance - payment;
		System.out.println("Thank you for your payment of $" +payment);
		viewBalance();
	}
	//show status
	public String toString() {
		return "Name: "+ firstName +" " + lastName +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tuitonBalance;
				
	}

}
