import java.util.Arrays;
import java.util.Comparator;


/////

public class Assign8CW_Q2{
    private int roll; 
    private String name; 
    private String city; 
    private double marks; 
    
    public Assign8CW_Q2() {
    	
    }
   
	public Assign8CW_Q2(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}


	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	 @Override
	    public String toString() {
	        return "Roll: " + roll + ", Name: " + name + ", City: " + city + ", Marks: " + marks;
	    }
	
   /////////////////////
    
	 static class SortByRules implements Comparator<Assign8CW_Q2> {
		    @Override
		    public int compare(Assign8CW_Q2 o1, Assign8CW_Q2 o2) {
		        // 1st: City (descending) → o2.city vs o1.city
		        int diff1 = o2.getCity().compareTo(o1.getCity());
		        if (diff1 != 0) {
		            return diff1;
		        }

		        // 2nd: Marks (descending) → o2.marks vs o1.marks
		        int diff2 = Double.compare(o2.getMarks(), o1.getMarks());
		        if (diff2 != 0) {
		            return diff2;
		        }

		        // 3rd: Name (ascending) → o1.name vs o2.name
		        return o1.getName().compareTo(o2.getName());
		    }
		}

	 
	 
	 
	 
	 
	 
    ///////////////

	
	public static void main(String[] args) {
	     Assign8CW_Q2[] students = {
	             new Assign8CW_Q2(101, "Alice", "Mumbai", 88.5),
	             new Assign8CW_Q2(102, "Alice", "Mumbai", 92.0),
	             new Assign8CW_Q2(103, "Charlie", "Bangalore", 76.5),
	             new Assign8CW_Q2(104, "Diana", "Chennai", 95.5),
	             new Assign8CW_Q2(105, "Ethan", "Kolkata", 83.0)
	         };
	     System.out.println("before sorting :");
	     
	     for (Assign8CW_Q2 s : students) {
	            System.out.println(s.toString());
	        }
	     
         Arrays.sort(students,new SortByRules());
		
		System.out.println();
		System.out.println();
         System.out.println("After sorting :");
	     
	     for (Assign8CW_Q2 s : students) {
	            System.out.println(s.toString());
	        }
		
	}

}
