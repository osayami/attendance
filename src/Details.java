
public class Details {

	// Basic class object for the details of the student
	int id = 0, attended = 0;

	String name;

	public Details(String n) {
		name = n;
		id = Handler.studentlist.size();
	}

	public int getattended() {
		return attended;
	}

	public void setattended(int attended) {
		this.attended = attended;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Details [id=" + id + ", attended " + attended + "classes , name=" + name + "]";
	}

}