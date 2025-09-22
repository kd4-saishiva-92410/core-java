package com.app.fruits;
import com.app.fruits.*;
import java.util.Scanner;

public class Fruitsbasket {
    
    public static int menulist() {
    	Scanner sc=new Scanner(System.in);
    	int x;
    	System.out.println("-----------------------");
    	System.out.println("0.exit");
    	System.out.println("1.Mango");
    	System.out.println("2.Orange");
    	System.out.println("3.Apple");
    	System.out.println("Enter a x");
    	x=sc.nextInt();
    	return x;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size :");
		int size=sc.nextInt();
		Fruit[] obj= new Fruit[size];
		int choice;
		int counter=0;
		System.out.println("Enter your choice :");
		
		
		while((counter < obj.length) && ((choice=menulist())!=0)) {
			switch (choice) {
			     
			case 1:
				   System.out.println("It is mango");
				   obj[counter]=new Mango();
				   obj[counter].acceptFruit();
				   System.out.println(obj[counter].toString());		
				   counter++;
				
				break;
			case 2:
				   System.out.println("It is Orange");
				   obj[counter]=new Orange();
				   obj[counter].acceptFruit();
				   System.out.println(obj[counter].toString());	
				   counter++;
				   break;
			case 3:
				   System.out.println("It is Apple");
				   obj[counter]=new Apple();
				   obj[counter].acceptFruit();
				   System.out.println(obj[counter].toString());	
				   counter++;
			default:
				System.out.println("Enter valid values");
				break;
			}
			if(obj.length==counter) {
				System.out.println("----------------------------------------");
				System.out.println("Basket full");
				System.out.println("----------------------------------------");
			}
			
		}
		
		///all fruits in basket
		System.out.println();
		System.out.println();
		System.out.println("-------------------All Fruits-------------------");
		for(int i=0;i<obj.length;i++) {
			    if(obj[i]!=null) {
				      System.out.println("fruit:"+obj[i].getName());
			    }
		}
		
		System.out.println();
		System.out.println();
		
		//fresh fruits
		System.out.println("-------------------Fresh-Fruits-------------------");
		for(int i=0;i<obj.length;i++) {
			if(obj[i]!=null) {
			
				System.out.println("The fruit which are Fresh is:"+obj[i].name);
				System.out.println(obj[i].toString());
			}
		}
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("-------------------Before marking Stale-Fruits-------------------");
		boolean found = false;
		for (int i = 0; i < obj.length; i++) {
		    if (obj[i] != null && obj[i].isFresh == false) {
		        System.out.println("The fruit which is stale is: " + obj[i].name);
		        System.out.println("Taste: " + obj[i].taste());
		        found = true;
		    }
		}
		if (!found) {
		    System.out.println("No stale fruits yet.");
		}
        
		System.out.println();
		System.out.println();
		
		///Marking Fruit as stale
		
		System.out.println("-------------------Marking -as-Stale-Fruits-------------------");
		System.out.println("Enter the index you want to mark as stale:");
		int marker=sc.nextInt();

		if(marker >= 0 && marker < obj.length && obj[marker] != null) {
		    obj[marker].isFresh = false;
		    System.out.println("Fruit at index " + marker + " marked as stale.");
		} else {
		    System.out.println("Invalid index!");
		}
        
		System.out.println();
		System.out.println();
		
		System.out.println("-------------------After marking Stale-Fruits-------------------");
		for(int i=0;i<obj.length;i++) {
			if(obj[i].isFresh==false) {
				System.out.println("The fruit which is stale is:"+obj[i].name);
				System.out.println(obj[i].taste());
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Marking all sour fruits as stale");
	    for(Fruit fruit:obj) {
	    	if((fruit!=null) &&"Sour".equalsIgnoreCase(fruit.taste())) {
	    		fruit.setFresh(false);
	    	}
	    	
	    }
	    System.out.println();
		System.out.println();
	    
		System.out.println("-------------------After marking Sour-Fruits as Stale-------------------");
		for(int i=0;i<obj.length;i++) {
			if(obj[i].isFresh==false) {
				System.out.println("The fruit which is stale is:"+obj[i].name);
				System.out.println(obj[i].taste());
			}
		}

	}

}
