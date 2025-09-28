package Assignment9;
import java.util.*;
import Assignment9.*;
import Assignment9.SortByRules.SortByRollNo;
import Assignment9.*;
public class TesterStudent {
	public static List<Student> list= new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	Collections.addAll(list,
			new Student(21,"sai",23),
			new Student(23,"Shiva",27),
			new Student(33,"ravi",24),
			new Student(34,"sri",21)
			);	
	
	int choice;
	while((choice=MenuStudent.menulist())!=0) {
		switch (choice) {
        case 0:
			System.out.println("exit:");
			break;
		case 1:
			System.out.println("Accept Student details :");
			MenuStudent.acceptStudentDetails();
			break;
		case 2:
			MenuStudent.displayAll(list);
			break;
		case 3:
			System.out.println("Enter the student RollNo:");
			int rollno=sc.nextInt();
			MenuStudent.displayStudentDetails(list, rollno);
			break;
		case 4:
			System.out.println("Sort the students by RollNo:");
			SortByRollNo sort1= new SortByRollNo();
			list.sort(sort1);
			MenuStudent.displayAll(list);
			break;
		case 5:
			System.out.println("Sort the students by Name");
			Collections.sort(list,new SortByRules.SortByName());
			MenuStudent.displayAll(list);
			break;
		case 6:
			System.out.print("Sort the students by Marks");
			Collections.sort(list,new SortByRules.SortByMarks());
			MenuStudent.displayAll(list);
			break;
			
		default:
			System.out.print("Invalid choice");
			break;
		}
	}
		

	}

}
