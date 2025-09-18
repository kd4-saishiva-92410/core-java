package assign302;
import java.util.Scanner;

import assign302.Customer;

public class CLCTester {
	Customer c1=new Customer();
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("AccNo(int):");
		int accNo=sc.nextInt();
		c1.setAccNum(accNo);
		
		
		System.out.println("balance at the beginning of the month :");
		double bal=sc.nextDouble();
		c1.setBalMonBegin(bal);
		
		System.out.println(" total of all items charged by the customer this month  :");
		double AllItems=sc.nextDouble();
		c1.setTotalAllItems(AllItems);
		
		
		System.out.println(" total of all credits applied to the customer’s account this \r\n"
				+ "month :");
		double AllCredits=sc.nextDouble();
		c1.setTotalAllCredits(AllCredits);
		
		
		System.out.println("  allowed credit limit.  :");
		double Limit=sc.nextDouble();
		c1.setAllowLimit(Limit);
		
	}
	public void printRecord() {
		System.out.println("accno:"+c1.getAccNum());
		System.out.println("balMonBegin:"+c1.getBalMonBegin());
		System.out.println("totalAllItems:"+c1.getTotalAllItems());
		System.out.println("totalAllCredits:"+c1.getTotalAllCredits());
		System.out.println("allowLimit:"+c1.getAllowLimit());
		c1.newBalance();
	}


	public static void main(String[] args) {
		CLCTester t1=new CLCTester();
		t1.acceptRecord();
		t1.printRecord();

	}

}
