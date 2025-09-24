package newassignments;



public class Circle {
     private double myX;
     private double myY;
     private double myDiameter;
     public Circle() {
    	 this.myX=0;
    	 this.myY=0;
    	 this.myDiameter=0.0;
     }
	public Circle(double myX, double myY, double myDiameter){
		this.myX = myX;
		this.myY = myY;
		if(myDiameter<0) throw new NegativeDiameterException(myDiameter,"Diameter cant be negative");
		this.myDiameter = myDiameter;
	}
	public double getMyX() {
		return myX;
	}
	public void setMyX(double myX) {
		this.myX = myX;
	}
	public double getMyY() {
		return myY;
	}
	public void setMyY(double myY) {
		this.myY = myY;
	}
	public double getMyDiameter() {
		return myDiameter;
	}
	public void setMyDiameter(double myDiameter){
		if(myDiameter<0) throw new  NegativeDiameterException(myDiameter,"Diameter cant be negative");
        
        this.myDiameter = myDiameter;
	}
     
	@Override
	public String toString() {
		return String.format("The point is :(%.2f,%.2f) and diameter is %.2f",myX,myY,myDiameter);
	}
	
	public static void main(String[] args) {
		Circle c1= new Circle();
		c1.setMyX(1);
		c1.setMyY(2);
		
		
		try {
		c1.setMyDiameter(20);
		System.out.println("Obj :"+c1.toString());
		Circle c2=new Circle(1,2,-30);
		System.out.println("Obj :"+c2.toString());
		}
		catch(NegativeDiameterException e) {
			System.out.println("Exception arised :"+e.getMessage());
		}
		}
	
	
	
}


