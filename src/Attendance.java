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
		Handler.init();
		while (running) {
			System.out.println("1.Add Student \n 2.Check attendance \n 3.Print details \n 4.Exit");
			int c = s.nextInt();

			switch (c) {
			case 1:
				Handler.addStudent();
				break;

			case 2:
				Handler.check();
				break;
			case 3:
				Handler.printDet();
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
}
