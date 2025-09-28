package tester;
import com.app.vehicles.*;
import com.app.Exceptions.*;
import com.app.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		   
		   while((choice=Showroom.menulist())!=3) {
			   switch (choice) {
			case 1:
				Showroom.addVehicle();
				 break;
			case 2:
					System.out.println("2.Display all vehicles");
					Showroom.printAllVehicle();
					break;
			case 3:
				System.out.println("Exit");
	            break;
			default:
				System.out.println("Invalid Choice ");
	            break;
			}
		   }
	}

}
