package com.app.vehicles;

import com.app.Exceptions.*;

import java.util.*;
import java.time.*;

public class Vehicle {
   private String chasisNo;
   private String color;
   private String category;
   private double price;
   private LocalDate manufactureDate;
   private static List<Vehicle> allVehicles= new ArrayList<>(); 
    
   static {
       allVehicles.add(new Vehicle("V1001", "Red", "Petrol", 850000.0, LocalDate.of(2021, 6, 15)));
       allVehicles.add(new Vehicle("V1002", "Blue", "EV", 1200000.0, LocalDate.of(2021, 11, 30)));
       allVehicles.add(new Vehicle("V1003", "White", "Diesel", 950000.0, LocalDate.of(2022, 2, 10)));
       allVehicles.add(new Vehicle("V1004", "Green", "Hybrid", 1100000.0, LocalDate.of(2021, 4, 1)));
   }
   
   
   public Vehicle() {
	   
   }
 public String[] categoryarr= {"Petrol","Diesel","EV","Hybrid","CNG"};

public Vehicle(String chasisNo, String color, String category, double price,LocalDate manufactureDate) {
	this.chasisNo = chasisNo;
	this.color = color;
	this.category = category;
	this.price = price;
	this.manufactureDate = manufactureDate;
}

public String getChasisNo() {
	
	return chasisNo;
}

public void setChasisNo(String chasisNo)  {
    this.chasisNo=chasisNo;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public LocalDate getManufactureDate() {
	return manufactureDate;
}

public void setManufactureDate(LocalDate manufactureDate){ 
	   this.manufactureDate = manufactureDate;
}



@Override
public boolean equals(Object obj) {
	if(obj==null) {
		return false;
	}
	if(!(obj instanceof Vehicle)) {
		return false;
	}
	if(this==obj) {
		return true;
	}
	
	Vehicle other= (Vehicle)obj;
	if(this.chasisNo==other.chasisNo) {
		return true;
	}
	else {
		return false;
	}
}
/////////////////////////getInstances 

public static List<Vehicle> getAllVehicles() {
    return allVehicles; // or new ArrayList<>(allVehicles)
}
	

//////////////////accept values
public void acceptDetails() throws InValidChasisException,InvalidManufactureDate,InvalidCategoryException{
	Scanner sc = new Scanner(System.in);
	System.out.println("Accept chasisNo");
	chasisNo=sc.nextLine();
	for(Vehicle v:allVehicles) {
		if(chasisNo.equalsIgnoreCase(v.getChasisNo())) {
			throw new InValidChasisException("Chassis number already exist:", chasisNo);
		}
	}
	setChasisNo(chasisNo);
	
	
	System.out.println("Accept color");
	color=sc.nextLine();
	setColor(color);
	System.out.println("Accept price");
	price=sc.nextDouble();
	sc.nextLine();
	setPrice(price);
	System.out.println("Accept category");
	
	category=sc.nextLine();
	boolean catflag=false;
	for(int idx=0;idx<categoryarr.length;idx++) {
		if(categoryarr[idx].equalsIgnoreCase(category)) {
			catflag=true;
		}
	}
	if(catflag==true) {
		setCategory(category);
	}
	else {
		throw new InvalidCategoryException("Input category doesnt exist:", category);
	}
	
	
	
	
	
	///date
	System.out.println("Accept Date yyyy-MM-dd");
	String date=sc.nextLine();
	manufactureDate=LocalDate.parse(date);	
	LocalDate start= LocalDate.of(2020, 5, 1);
	LocalDate end= LocalDate.of(2022,3,31);
	if(manufactureDate.isBefore(start)||manufactureDate.isAfter(end)){
          throw new InvalidManufactureDate("Not valid date",manufactureDate);		
 	}
	else 
	setManufactureDate(manufactureDate);
}





@Override
public String toString() {
	return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", category=" + category + ", price=" + price
			+ ", manufactureDate=" + manufactureDate + "]";
}
 

   

}
