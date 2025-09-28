package Assignment9;
import Assignment9.*;
import java.util.*;

public class MenuStudent {
    public static int menulist() {
    	int choice;
    	Scanner sc= new Scanner(System.in);
    	System.out.println("---------Menu-----------");
    	System.out.println("0.exit");
    	System.out.println("1.add Student");
    	System.out.println("2.Display all students");
    	System.out.println("3.search Student and display");
    	System.out.println("4.sort on Student's RollNo");
    	System.out.println("5.sort on Student's Name");
    	System.out.println("6.sort on Student's Marks");
    	System.out.print("Enter choice:");
    	choice=sc.nextInt();
    	return choice;
    }
    
    
    public static void acceptStudentDetails() {
       Student s1= new Student();
       Scanner sc= new Scanner(System.in);
   	   System.out.println("Rollno:");
   	   int rollNo=sc.nextInt();
   	   s1.setRollNo(rollNo);
   	   sc.nextLine();
   	   //name
   	   System.out.println("Name:");
 	   String name=sc.nextLine();
 	   s1.setName(name);
 	   //marks
 	   System.out.println("Marks:");
	   double marks=sc.nextDouble();
	   s1.setMarks(marks);
	   TesterStudent.list.add(s1);
   	   
      } 
    
    public static void displayAll(List<Student> list) {
    	ListIterator<Student> temp=list.listIterator();
    	while(temp.hasNext()) {
    		Student st=temp.next();
    		System.out.println(st.toString());
    	}
    }
    public static void displayStudentDetails(List<Student> list,int rollNo){
    	Student s1= new Student();
    	s1.setRollNo(rollNo);
    	 int index=list.indexOf(s1);
    	if(index!=-1) {
    		Student s2=list.get(index);
    		System.out.println("Student whose Roll no :"+rollNo+" ,Details: \n" +s2.toString());
    	}
    	else {
    		System.out.println("Wrong Input-Rollno Student Not fount");
    	}
    	
    }

}
