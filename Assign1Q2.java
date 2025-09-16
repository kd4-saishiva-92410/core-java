import java.util.*;

class checkType{
	double num1;
	double num2;
	Scanner sc= new Scanner(System.in);
	
	public boolean acceptValues() {
		boolean bool=false;
	   System.out.println("Give 1st num :");
	   if((sc.hasNextDouble()&&!sc.hasNextInt())) {
		   num1=sc.nextDouble();
		   System.out.println("Give 2st num :");
		   if((sc.hasNextDouble() && !sc.hasNextInt())) {
			   num2=sc.nextDouble();
		   }
		   bool =true;
	   }
	   else {
		   System.out.println("Not valid num1,num2 :");
		   bool=false;
	   }
	  return bool; 
	}
	
	public void disValues() {
		System.out.println("Num1:"+num1);
		System.out.println("Num2:"+num2);
	}
	public void aver() { 
		  double average= (num1+num2)/2;
		  System.out.println("The average is %.3f :"+average);
	}
	
}


public class Assign1Q2 {

	public static void main(String[] args) {
	   boolean check;
       checkType t1=new checkType();
       check=t1.acceptValues();
       if(check!=false) {
       t1.disValues();
       t1.aver();
       }
       else {
    	   System.out.println("Give valid values and try again :");
       }
       
       }

	}


