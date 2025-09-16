import java.util.*;

class Food{
	double bill;
	Scanner sc=new Scanner(System.in);
	int x;
	
	public int menulist() {
		
		System.out.println("--------MenuList----------");
		System.out.println("0.exit");
		System.out.println("1.Dosa:40 ");
		System.out.println("2.Samosa:20");
		System.out.println("3.idli:30");
		System.out.println("4.bun maska:25");
		System.out.println("5.Upma:20");
		System.out.println("6.kachori:15");
		System.out.println("7.Salt Biscuits:20");
		System.out.println("8.poha:20");
		System.out.println("9.Milk:20");
		System.out.println("10.Coffe:10 ");
		System.out.println("11.Generate bill :");
		System.out.println("Choose a value of x:");
		x=sc.nextInt();
		return x;
	
	}
	
}






public class Assign1Q3 {

	public static void main(String[] args) {
		int price;
		int choice;
		int qty;
		int total=0;
		int total_bill=0;
		Scanner sc=new Scanner(System.in);
		Food f1=new Food();
		while((choice=f1.menulist())!=0) {
			switch (choice) {
			case 1:
				System.out.println("1.Dosa:40 ");
				price=40;
				System.out.println("Qty");
				qty=sc.nextInt();
				total=qty*price;
				total_bill=total_bill+total;
				break;
			case 2:
				System.out.println("2.Samosa :20");
				price=20;
				System.out.println("Qty");
				qty=sc.nextInt();
				total=qty*price;
				total_bill=total_bill+total;
				break;
			case 3:
				System.out.println("3.Idli :30");
				price=30;
				System.out.println("Qty");
				qty=sc.nextInt();
				total=qty*price;
				total_bill=total_bill+total;
				break;
			case 4:
				System.out.println("4.bun maska:25 ");
				price=25;
				System.out.println("Qty");
				qty=sc.nextInt();
				total=qty*price;
				total_bill=total_bill+total;
				break;
			case 5:
				System.out.println("5.upma :20");
				price=20;
				System.out.println("Qty");
				qty=sc.nextInt();
				total=qty*price;
				total_bill=total_bill+total;
				break;
			case 6:
				System.out.println("6.kachori :15");
				price=15;
				System.out.println("Qty");
				qty=sc.nextInt();
				total=qty*price;
				total_bill=total_bill+total;
				break;
			case 7:
				System.out.println("7.Salt biscuits:20 ");
				price=20;
				System.out.println("Qty");
				qty=sc.nextInt();
				total=qty*price;
				total_bill=total_bill+total;
				break;
			case 8:
				System.out.println("8.poha :20");
				price=20;
				System.out.println("Qty");
				qty=sc.nextInt();
				total=qty*price;
				total_bill=total_bill+total;
				break;
			case 9:
				System.out.println("9.milk:15 ");
				price=15;
				System.out.println("Qty");
				qty=sc.nextInt();
				total=qty*price;
				total_bill=total_bill+total;
				break;
			case 10:
				System.out.println("10.coffe :10");
				price=10;
				System.out.println("Qty");
				qty=sc.nextInt();
				total=qty*price;
				total_bill=total_bill+total;
				break;
			case 11:
				System.out.println("Total bill : ");
			       System.out.println(total_bill);
				break;
			case 0:
				System.out.println("0.exit ");
				break;
			default:
				System.out.println("Invalid value ");
				break;
			}
			
		}
	

	}

}
