package org.project;
import org.emp.Employee;
public class Project extends Employee {
	public void projectName()
	{
		System.out.println("java");
	}
	public static void main(String[] args) {
		Project qw=new Project();
		qw.projectName();
		qw.empName();
		qw.clientName();
		qw.companyName();
		
	}

}
