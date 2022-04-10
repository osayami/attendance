
public class Student {

	// Basic class object for the details of the student
	private int attended = 0;

	private String name,hallTicket;

	public Student(String hallTicket ,String name) {
		this.name = name;
		this.hallTicket=hallTicket;
		
	}
	

	public int getAttended() {
		return attended;
	}

	public void setAttend(boolean didAttend) {
		if (didAttend) this.attended++;
	}

	public String getHallTicket() {
		return hallTicket;
	}


	public void setHallTicket(String hallTicket) {
		this.hallTicket = hallTicket;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return ("[H.T ="+  this.hallTicket + ", Name =" + this.name + " , Attended = " + this.attended+"]");
	}

}