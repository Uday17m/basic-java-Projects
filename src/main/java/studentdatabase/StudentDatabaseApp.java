package studentdatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

	private static final Student[] Student = null;

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.enroll();
		stu1.payTuition();
		System.out.println(stu1.toString());
		
		//create n number of new students
		System.out.print("Enter number of new students to enroll :");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents-1];
		
		//create n number of new students
		for(int n = 0;n <numOfStudents ;n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		   	System.out.println(students[0].toString());
		   	System.out.println(students[1].toString());
			System.out.println(students[2].toString());
			
		
		}

	}


