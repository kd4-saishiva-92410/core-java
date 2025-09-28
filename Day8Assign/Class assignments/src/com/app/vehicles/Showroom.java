package com.app.vehicles;

import java.time.LocalDate;
import com.app.*;
import com.app.Exceptions.InValidChasisException;
import com.app.Exceptions.InvalidCategoryException;
import com.app.Exceptions.InvalidManufactureDate;
import com.app.vehicles.Vehicle;
import java.util.*;


public class Showroom {
	public static Scanner sc= new Scanner(System.in);
	public static List<Vehicle> list = Vehicle.getAllVehicles();
    
	///////////all vehicles
	///////////menulist
    public static int menulist() {
    	int choice;
    	System.out.println("------------menu------------");
    	System.out.println("1.Add vehicle");
    	System.out.println("2.Display all vehicles");
    	System.out.println("3.exit");
    	System.out.print("Enter your choice :");
    	choice = sc.nextInt();
    	sc.nextLine(); 
    	return choice;
    }
    public static void addVehicle(){
    	try {
			System.out.println("1.Add vehicle");
			Vehicle v1= new Vehicle();
			v1.acceptDetails();
			Showroom.list.add(v1);
			System.out.println("Vehicle added successfully!");
		} catch (InValidChasisException | InvalidCategoryException |InvalidManufactureDate e) {
			System.out.println("Error :"+e.getMessage());
		}
    }
    public static void printAllVehicle() {
          list.forEach(v->System.out.println(v));
    }
    
}
    
