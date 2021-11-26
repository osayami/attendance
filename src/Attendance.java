import java.util.ArrayList;
import java.util.Scanner;

class Details { 
	// Basic class object for the details of the student
    int id,coun;
	String name;
	 
	public Details (int i,String n,int c) {
		id=i;
		name=n;
		coun=c;
	}
}

//The Driver Class
public class Attendance {
	
	public static void main(String[] args) {
		
		/*
		import java.util.Scanner;
		String dept, year, subjects;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your department: ")
		dept = s.next();
		System.out.println("Enter your year: ")
		year = s.next();
		System.out.println("Enter your subject: ")
		subject = s.next();

		*/
		String dept="CS";
		String year="2018-19";
		String subject="Software engineering";
		
		System.out.println("Department:"+dept +"\t Year:"+year+"\tSubject:"+subject+"\n");
		
		
		System.out.println(" ID \t"+"\t"+"Name"+"\t \t \t"+"Attended");
		ArrayList<Details> list=new ArrayList<>();
		Details st1=new Details(100,"Haany Ali",0);
		Details st2=new Details(101,"morwan khair",0);
		
		list.add(st1);
		list.add(st2);
		check(list);
		printDet(list);
	}
	
	
	//display
	public static void printDet(ArrayList<Details> list){
		System.out.println("\t \t \t \t -----UPDATED------- \n"+" ID \t"+"\t"+"Name"+"\t \t \t"+"Attended");
		for(int i=0;i<list.size();i++) {
	    Details dis=list.get(i);
	    
		System.out.println(dis.id+"\t"+dis.name+"\t \t \t"+dis.coun);
	}
	}
	
	// Method that records attendane responses of the students
	public static void check(ArrayList<Details> list){
		
		for(int j=0;j<list.size();j++) {
	    Details dis=list.get(j);
	    
		System.out.print(dis.id+"\t"+dis.name+"\t \t \t"+"Y or n:");
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		
		switch (c) {
		case 'y' :
		case 'Y' :
			dis.coun++;
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
}
