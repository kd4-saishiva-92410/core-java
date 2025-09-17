import java.util.*;
import java.util.Calendar;

class Date{
	Calendar c= Calendar.getInstance();
	private int month;
	private int day;
	private int year;
	
	public Date() {
		this.day=c.get(Calendar.DATE);
		this.month=c.get(Calendar.MONTH)+1;
		this.year=c.get(Calendar.YEAR);
	}
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public int getMonth() {
		return this.month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return this.day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}


class TestDate{
	Scanner sc=new Scanner(System.in);
	Date dt=new Date();
	public void acceptDate() {
		System.out.println("Enter day(int)");
		int d=sc.nextInt();
		dt.setDay(d);
		System.out.println("Enter month(int)");
		int m=sc.nextInt();
		dt.setMonth(m);
		System.out.println("Enter year(int)");
		int y=sc.nextInt();
		dt.setYear(y);
	}
	public void printDate() {
	    int d=dt.getDay();
	    int m=dt.getMonth(),y=dt.getYear();
	    System.out.println("The Date is dd-MM-YY:");
	    System.out.println(d+"/"+m+"/"+y);
	    
	    
	}
}



public class Assign2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDate td1=new TestDate();
		td1.acceptDate();
		td1.printDate();

	}

}
