import java.util.ArrayList;

public class ClassRoom {
    private int year;
	private String dept, sectionName;
    private ArrayList<Student> studentList;

    public ClassRoom(int year, String dept, String sectionName) {
        this.year = year;
        this.dept = dept;
        this.sectionName = sectionName;
        studentList = new ArrayList<Student>();
    }

	public void addStudent(Student stu) {
		studentList.add(stu);
	}


	public ArrayList<Student> getStudentList() {
		return studentList;
	}

    @Override
    public String toString() {
        return "ClassRoom [year = " + year + ",  dept = " + dept + ", sectionName = " + sectionName  +"]";
    }
}
