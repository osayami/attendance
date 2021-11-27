import java.util.*;
public class handler {
	static int year;
	static String dept, subjects;
	static ArrayList<Details> list=new ArrayList<Details>();;
	static Scanner s=new Scanner(System.in);
	
	static public void start() {
		
		System.out.println("Welcome to the attendance app! \n "
				+ "Please use it responsibly and not for a distopian work culture ;)");
		//choice();
		addStudent();
		addStudent();
		check();
		printDet();
		
	}
	 static public void choice() {
		 System.out.println("\n Please enter college details:");
		
		System.out.println("Enter your department: ");
		dept = s.next();
		System.out.println("Enter your year: ");
		year = s.nextInt();
		System.out.println("Enter your subject: ");
		subjects = s.next();
		
	}
	 // Method that records attendance responses of the students
		public static void check(){
			
			for(int j=0;j<list.size();j++) {
		    Details dis=list.get(j);
		    
			System.out.println(dis.id+"\t"+dis.name+"\t \t \t"+"Y or n:");
			
			
			char c=s.next().charAt(0);
			
			switch (c) {
			case 'y' :
			case 'Y' :
				dis.count++;
				break;
			case 'n' :
			case 'N' :
				break;
			default :
				System.out.println("please enter y or n");
			j--;
			break;
			}	
			
			System.out.println();
		}
		}
			
		
		//display
			public static void printDet(){
			    System.out.println("\t \t \t \t ---------------------Details------- ------------\n");
			    		System.out.println(" ID \t"+"\t"+"Name"+"\t \t \t"+"Attended");
			    for(int i=0;i<list.size();i++) {
			    Details dis=list.get(i);
			    
			    System.out.println(dis.id+"\t"+dis.name+"\t \t \t"+dis.count);
			}
			}
			
		static void addStudent() {
			    System.out.println("\n Please enter student details:");
				
				System.out.println("Enter the student name: ");
				Details det=new Details(s.next());
				list.add(det);
				
		}
}
