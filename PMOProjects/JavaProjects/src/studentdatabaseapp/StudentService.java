package studentdatabaseapp;

import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	Student s = new Student();
	private static int id = 1000;

	public void create() {
		System.out.print("Enter the first name: ");
		s.setFirstName(sc.nextLine());
		System.out.print("\nEnter the last name: ");
		s.setLastName(sc.nextLine());
		System.out.print("1 - FreshMen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter the student class level: ");
		int gy = sc.nextInt();
		s.setGradeYear(gy);
		// Generate ID and set it
		id++;
		s.setStudentId(gy + "" + id);
		enroll();
	}

	// Enroll in course
	public void enroll() {
		String course = "";
		int pay = 0;
		sc.nextLine();
		do {
			System.out.print("Enter the course to enroll (Q for quite) : ");
			course = sc.nextLine();
			if (!course.equals("Q")) {
				course = s.getCourses() + ", " + course;
				s.setCourses(course);
				pay = s.getCostOfCourse() + pay;
			} else {
				break;
			}
		} while (true);
		s.setTuitionBalance(pay);
		payTuition();
	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + s.getTuitionBalance());
	}

	// Pay tuition
	public void payTuition() {
		System.out.print("Enter your payment : $");
		int payment = sc.nextInt();
		s.setTuitionBalance(s.getTuitionBalance() - payment);
		System.out.println("Thank you for your payment of $" + payment);
	}

	// Show status
	public void showStatus() {
		System.out.println(s.toString());
	}
}
