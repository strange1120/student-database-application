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

		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
		
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
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		} else {
			break;
			}
		} while (1 != 0);
		
		
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	
		}
	}
	
