
import java.util.*;

public class Handler {
	static int year;
	static String dept, sectionName;
	static ArrayList<Details> studentlist = new ArrayList<Details>();;
	static Scanner s = new Scanner(System.in);
	

	static public void init() {
		System.out.println("\n Please enter college details:");

		System.out.println("Enter the department: ");
		dept = s.next();
		System.out.println("Enter the year: ");
		year = s.nextInt();
		System.out.println("Enter the section: ");
		sectionName = s.next();

	}
	static void addStudent() {
		System.out.println("\n Please enter student details:");

		System.out.println("Enter the student name: ");
		Details det = new Details(s.next());
		studentlist.add(det);

	}
	// Method that records attendance responses of the students
	public static void check() {

		for (int j = 0; j < studentlist.size(); j++) {
			Details dis = studentlist.get(j);

			System.out.println(dis.id + "\t" + dis.name + "\t \t \t" + "Y or n:");

			char c = s.next().charAt(0);

			switch (c) {
			case 'y':
			case 'Y':
				dis.attended++;
				break;
			case 'n':
			case 'N':
				break;
			default:
				System.out.println("please enter y or n");
				j--;
				break;
			}

			System.out.println();
		}
	}

	// display
	public static void printDet() {
		System.out.println("\t \t \t \t ---------------------Details------- ------------\n");
		System.out.println(" ID \t" + "\t" + "Name" + "\t \t \t" + "Attended");
		for (int i = 0; i < studentlist.size(); i++) {
			Details dis = studentlist.get(i);

			System.out.println(dis.id + "\t" + dis.name + "\t \t \t" + dis.attended);
		}
	}

	
}
