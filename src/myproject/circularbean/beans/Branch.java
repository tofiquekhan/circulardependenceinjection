package myproject.circularbean.beans;

public class Branch {

	Student student;
	public Branch(Student student) {
		this.student = student;
	}
	
	public String getBranchName() {
		return "Computers";
	}
}
