import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	public Student() {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter student first name");
		this.firstName = in.nextLine();

		System.out.println("Enter student last name");
		this.lastName = in.nextLine();

		System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();

		setStudentId();
	}

	private void setStudentId() {
		id++;
		this.studentId = gradeYear + "" + id;
	}

	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();

			if (!course.equals("Q")) {
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);
	}

	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}

	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);

		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of: $" + payment);
		viewBalance();
	}

	public String showInfo() {
		return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentId
				+ "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;
	}
}
