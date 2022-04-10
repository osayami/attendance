import java.util.ArrayList;
import java.util.Scanner;

//The Driver Class
public class Attendance {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the attendance app! \u00A9 \n "
				+ "Please use it responsibly and not for a distopian work culture ;)");
		ClassRoom cl=init();
		System.out.println("            ---------------------               \n");
		System.out.println(cl.toString());
		boolean running = true;
 			while (running) {
			System.out.println(
					"\n 1.Add Student \n 2.Print student details \n 3.Check attendance \n 4.Exit \n Enter your choice:");
			int c = s.nextInt();
			s.nextLine();
			
			switch (c) {
				case 1:
					System.out.println("Please enter the student's Hallticket:");
					String ht =s.nextLine();
					System.out.println("Please enter the student's name:");
					String stu =s.nextLine();
					cl.addStudent(new Student(ht,stu));
					System.out.println(stu +" was added successfully with hallticket no ="+ht);
					break;
				case 2:
					printAttendance(cl);
					break;

				case 3:
					
					checkAttendance(cl);
					break;
				case 4:
					running = false;
					break;
				default:
					System.out.println("Invalid choice!");
					break;
			}

		}
		
	}
	
	public static ClassRoom init() {
		System.out.println("\n Please enter college details:");
		System.out.println("Enter the department: ");
		String dept = s.nextLine();
		System.out.println("Enter the year: ");
		int year = s.nextInt();
		System.out.println("Enter the section: ");
		String sectionName = s.next();
		return new ClassRoom(year, dept, sectionName);
	}
	
	public static void checkAttendance(ClassRoom classRoom) {
		System.out.println("Checking attendance!");
		ArrayList<Student> studentList=classRoom.getStudentList();
		for (Student stu:studentList) {
			System.out.println("HaLLticket : " + stu.getHallTicket() +" , Name :" + stu.getName());
			System.out.println("please enter y or n");
			boolean didAttend=false;
			char c = s.next().charAt(0);

			switch (c) {
			case 'y':
			case 'Y':
				didAttend=true;
				break;
			case 'n':
			case 'N':
				break;
			default:
				System.out.println("please enter y or n");
				break;
			}
			stu.setAttend(didAttend);
			System.out.println();
		}
			
            
        }
	
	public static void printAttendance(ClassRoom classRoom) {
		ArrayList<Student> studentList=classRoom.getStudentList();
		
		System.out.println("\t \t \t \t ---------------------Details------- ------------\n");
		
		for (var student : studentList) {
			System.out.println(student.toString());
		}
	}
}
