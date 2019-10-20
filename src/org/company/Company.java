package org.company;
import org.client.Client;
public class Company extends Client {
	public void companyName()
	{
		System.out.println("SBI");
	}
	public static void main(String[] args) {
		Company s=new Company();
		s.companyName();
		s.clientName();
		
	}
	

}
