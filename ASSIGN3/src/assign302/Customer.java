package assign302;
import java.util.Scanner;


public class Customer {
    int accNum;
    double balMonBegin;
    double totalAllItems;
    double totalAllCredits;
    double allowLimit;
    
    
    
	public Customer(int accNum, double balMonBegin, double totalAllItems, double totalAllCredits, double allowLimit) {
		
		this.accNum = accNum;
		this.balMonBegin = balMonBegin;
		this.totalAllItems = totalAllItems;
		this.totalAllCredits = totalAllCredits;
		this.allowLimit = allowLimit;
	}



	public Customer() {
		// TODO Auto-generated constructor stub
	}



	public int getAccNum() {
		return accNum;
	}



	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}



	public double getBalMonBegin() {
		return balMonBegin;
	}



	public void setBalMonBegin(double balMonBegin) {
		this.balMonBegin = balMonBegin;
	}



	public double getTotalAllItems() {
		return totalAllItems;
	}



	public void setTotalAllItems(double totalAllItems) {
		this.totalAllItems = totalAllItems;
	}



	public double getTotalAllCredits() {
		return totalAllCredits;
	}



	public void setTotalAllCredits(double totalAllCredits) {
		this.totalAllCredits = totalAllCredits;
	}



	public double getAllowLimit() {
		return allowLimit;
	}



	public void setAllowLimit(double allowLimit) {
		this.allowLimit = allowLimit;
	}
	
	
	public void newBalance() {
	    double newBal = this.balMonBegin + this.totalAllItems - this.totalAllCredits;
	    
	    System.out.println("New balance calculated: " + newBal);
	    
	    this.balMonBegin = newBal;  // Update the balance

	    if (this.balMonBegin > this.allowLimit) {
	        System.out.println("Credit limit exceeded! (Limit: " + this.allowLimit + ")");
	    } else {
	        System.out.println("Credit limit not exceeded. (Limit: " + this.allowLimit + ")");
	    }
	}
	
	
	public static void main(String[] args) {
		
	}

}
