package tester;
import com.app.geometry.Point2D;

public class Assign3_01_tester{
	public static void main(String[] args)
	{
		Point2D p1=new Point2D();
		Point2D p2=new Point2D();
		System.out.println("Point p1 details ");
		p1.acceptData();
		p1.getDetails();
		System.out.println("Point p2 details ");
		p2.acceptData();
		p2.getDetails();
		System.out.println("If equal print equal else print distance between them ");
		boolean flag=false;
		flag=p1.isEqual(p2);
		if(flag==true) {
			System.out.println("Checking result:Equal");
		}
		else {
			System.out.println("Checking result:Not Equal");
			p1.calDistance(p2);
		}
		
	}


}