package studentdatabaseapp;

import java.util.Scanner;

public class StudentApp {
	public static void main(String args[]) {
		
		// Ask how many new users want to add
		System.out.println("Enter the number of new student to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numStudents = sc.nextInt();
		StudentService[] st = new StudentService[numStudents];

		// Create a number of new students
		for(int i=0; i<numStudents; i++) {
			st[i] = new StudentService();
			st[i].create();
		}
		
		for(int i=0; i<numStudents; i++) {
			st[i].showStatus();
		}
		
		System.out.println("\nThank You for visit us. Visite again!!!");
	}
}
