import java.util.Scanner;

//The Driver Class
public class Attendance {

	static Scanner s = new Scanner(System.in);
	static boolean running = true;

	public static void main(String[] args) {
		start();
	}

	static void start() {

		System.out.println("Welcome to the attendance app! \u00A9 \n "
				+ "Please use it responsibly and not for a distopian work culture ;)");
		
		while (running) {
			System.out.println("1.Enter College details \n 2.Add Student \n 3.Check attendance \n 4.Print details \n 5.Exit \n Enter your choice:");
			int c = s.nextInt();

			switch (c) {
			case 1:
				Handler.init();
				break;
			case 2:
				Handler.addStudent();
				break;

			case 3:
				Handler.check();
				break;
			case 4:
				Handler.printDet();
				break;
			case 5:
				running = false;
				break;
			default:
				System.out.println("Invalid choice!");
				break;

			}

		}

	}
}
