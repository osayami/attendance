import java.util.*;

public class Details { 
	

	// Basic class object for the details of the student
    int id=0,count=0;
    
	String name;
	 
	public Details (String n) {
		name=n;
		id++;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Details [id=" + id + ", attended " + count + "classes , name=" + name + "]";
	}

}