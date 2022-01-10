package myproject.circularbean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.circularbean.beans.Branch;
import myproject.circularbean.beans.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/circularbean/resources/applicationContext.xml");
		Student student = (Student) context.getBean("student");
		Branch branch = (Branch) context.getBean("branch");
		System.out.println(student.getStudentName());
		System.out.println(branch.getBranchName());
	}
}
