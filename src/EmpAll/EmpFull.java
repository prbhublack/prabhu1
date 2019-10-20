package EmpAll;
import org.project.Project;

public class EmpFull extends Project {
	public void empFull() {
		System.out.println("Full deatil printed here");


	}
	
	public static void main(String[] args) {
		System.out.println("new change");
		EmpFull uy=new EmpFull();
		uy.empFull();
		uy.projectName();
		uy.empName();
		uy.clientName();
		uy.companyName();
		
		
	}

}
