import java.util.*;
class Employee{
	private String f_name;
	private String l_name;
	private double mon_sal;
	public Employee() {
		this.f_name="default ";
		this.l_name="Default ";
		this.mon_sal=0.0;
	}
	public void setFname(String f_name) {
		this.f_name=f_name;
	}
	public void setLname(String l_name) {
		this.l_name=l_name;
	}
	public void setMonSal(double mon_sal) {
		this.mon_sal=mon_sal;
	}
	
	public void getFname() {
		System.out.println("First Name :"+this.f_name);
	}
	public void getLname() {
		System.out.println("Last Name :"+this.l_name);
	}
	public double getMonSal() {
		return this.mon_sal;
	}
}

class EmpTest{
	Employee e1=new Employee();
	Scanner sc=new Scanner(System.in);
	
	
	public void acceptRecord() {
	System.out.println("First Name :");
	String fname=sc.nextLine();
	e1.setFname(fname);
	
	
	System.out.println("Last Name :");
	String lname=sc.nextLine();
	e1.setLname(lname);
	
	
	System.out.println("Monthly sal :");
	double msal=sc.nextDouble();
	if(msal<0) {
		msal=0.0;
		e1.setMonSal(msal);
	}
	else {e1.setMonSal(msal);
	}
	
	}
	
  	
	public void printRecord() {
	e1.getFname();
	e1.getLname();
	double month_sal=e1.getMonSal();
	System.out.println("Monthly sal :"+month_sal);
	System.out.println("Yearly sal :"+12*month_sal);
	}
	public void afterRaiseSal() {
		   double raised_sal=0;
		   double yearsal=12*e1.getMonSal();
		   raised_sal=yearsal+0.1*yearsal;
		   System.out.println("After sal raised :"+raised_sal);
		   
		}
		
    
	
}



public class Assign2Q2 {
  public static void main(String[] args) {
	EmpTest et1=new EmpTest();
	EmpTest et2=new EmpTest();
	et1.acceptRecord();
	System.out.println("Emp1 details:");
	et1.printRecord();
	et2.acceptRecord();
	System.out.println("Emp1 details:");
	et2.printRecord();
	
	System.out.println("Emp1 after raised sal:");
	et1.afterRaiseSal();
	System.out.println("Emp1 after raised sal:");
	et2.afterRaiseSal();

}
}
