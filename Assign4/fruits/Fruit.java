package com.app.fruits;
import java.util.Scanner;

public abstract class Fruit {
        protected String name;
        protected String color;
        protected double weight;
        protected boolean isFresh;
	    public Fruit(){ 
	    	
	    }
	    public Fruit(String name,String color,double weight,boolean isFresh){
	    	this.name=name;
	    	this.color=color;
	    	this.weight=weight;
	    	this.isFresh=isFresh;
	    }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public boolean isFresh() {
			return isFresh;
		}
		public void setFresh(boolean isFresh) {
			this.isFresh = isFresh;
		}
	    public String toString() {
	    	return "Fruits name :"+name+" ,Weight: "+weight+" ,color :"+color+" ,isFresh(true of False): "+isFresh;
	    }
	    public abstract String taste(); 
	    
	    public void acceptFruit() {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("Fruit color:");
	    	color=sc.nextLine();
	    	System.out.println("Fruit weigth:");
	    	weight=sc.nextDouble();
	    }
}

//Apple///////////////////////////////////////

class Apple extends Fruit{
	public Apple(){
		super("Apple", "Apple", 0.0, true);
	}

	public Apple(String name,String color,double weight,boolean isFresh) {
		
		super("Apple",color,weight,true);
	}
	
	
	
	@Override
	public String taste() {
		return "Sweet and sour";
	}
	
}


//Orange///////////////////////////////////

class Orange extends Fruit{
	public Orange(){
		super("Orange", "Orange", 0.0, true);
	}

	public Orange(String name,String color,double weight,boolean isFresh) {
		super("Orange",color,weight,true);
		
	}
	
	@Override
	public String taste() {
		return "sweet";
	}
	
}
//Mango////////////////////////////////////////

class Mango extends Fruit{
	public Mango(){
		super("Mango", "mango", 0.0, true);
	}

	public Mango(String name,String color,double weight,boolean isFresh) {
		super("Mango",color,weight,true);
	} 
	
	
	
	@Override
	public String taste() {
		return "sour";
	}
	
}




