import java.util.*;


//Invoice class
class Invoice{
	private String part_num;
	private String part_desc;
    private int qty;
	private double price;
	
	public Invoice() {
		this.part_num="1002";
		this.part_desc="speakers";
		this.qty=1;
		this.price=255.5;
	}
	
	
	public Invoice(String part_num, String part_desc, int qty, double price) 
	{
		
		this.part_num = part_num;
		this.part_desc = part_desc;
		if(qty<0) {
			this.qty=0;
		}
		else {
		this.qty = qty;
		}
		if(price<0) {
			this.price=0.0;
		}
		else {
		this.price = price;
		}
	}
	public void setPartNum(String part_num) {
		this.part_num=part_num;
	}
	public void setPartDesc(String part_desc) {
		this.part_desc=part_desc;
	}
	public void setPartQty(int qty) {
		if(qty<0) {
			System.out.println("Not valid Qty hence made 0 (<0)");
			this.qty=0;
		}
		else {
		this.qty = qty;
		}
	}
	
	public void setPartPrice(double price) {
		if(price<0) {
			System.out.println("Not valid price hence made 0.0 (<0)");
			this.price=0.0;
		}
		else {
		this.price = price;
		}
	}
	
	public void getPartNum() {
		System.out.println("part num:"+this.part_num);
	}
	public void getPartDesc() {
		System.out.println("part desc:"+this.part_desc);
	}
	public int getPartQty() {
		
		return qty;
	}
	public double getPartPrice() {
		
		return this.price;
	}
	
}

/////Tester class
class Test{
	Invoice in=new Invoice();
	Scanner sc=new Scanner(System.in);

	
	public void acceptRecord() {
		System.out.println("Enter part num :");
		String name=sc.nextLine();
		in.setPartNum(name);
		System.out.println("Enter part desc :");
		String desc=sc.nextLine();
		in.setPartDesc(desc);
		System.out.println("Enter part qty:");
		int qty=sc.nextInt();
		in.setPartQty(qty);
		System.out.println("Enter part price :");
		double price=sc.nextDouble();
		in.setPartPrice(price);
		
	}
	public void printRecord() {
		System.out.println("-----------Invoice------------");
		in.getPartNum();
		in.getPartDesc();
		System.out.println("part qty:"+in.getPartQty());
		
		System.out.println("part price:"+in.getPartPrice());
		
		System.out.println("Total Invoice bill :"+in.getPartQty()*in.getPartPrice());
		
	}
	
}

////////////////main
public class Assign2Q1 {

	public static void main(String[] args) {
		Test t1= new Test();
		t1.acceptRecord();
		t1.printRecord();

	}

}
