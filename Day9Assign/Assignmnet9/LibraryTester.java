package Assignmnet9;
import java.util.*;
import Assignmnet9.*;




public class LibraryTester{
	public static Scanner sc= new Scanner(System.in);
	public static List<Book> list= new ArrayList<>();
	
	
	public static Book[] getInstances() {
		Book[] bks= new Book[4];
		bks[0] = new Book("1000", 19.99, "J.K. Rowling", 15);
		bks[1] = new Book("1001", 24.50, "George Orwell", 8);
		bks[2] = new Book("1002", 15.75, "Harper Lee", 12);
		bks[3] = new Book("1003", 29.99, "F. Scott Fitzgerald", 5);
		
		return bks;
	}
	
	public static List<Book> toList(Book[] arr){
		for( Book bk :arr) {
			list.add(bk);
		}
		return list;
		
	}
	
	public static void printListForward(List<Book> list) {
	       ListIterator<Book> trav=list.listIterator();
	       while(trav.hasNext()) {
	    	   Book ele = trav.next();
	    	   System.out.println(ele.toString());
	       }
	}
	
	public static void printListBackward(List<Book> list) {
	       ListIterator<Book> trav=list.listIterator(list.size());
	       while(trav.hasPrevious()) {
	    	   Book ele = trav.previous();
	    	   System.out.println(ele.toString());
	       }
	}
	
	public static void printBookValue(Book bk) {
		if(bk!=null) {
		System.out.println(bk.toString());
		}
		else
			System.out.println("Book not found !!");
	}
	
	public static Boolean deletingBook(String isbn) {
		Book key = new Book();
		key.setIsbn(isbn);
		if(list.contains(key)) {
			System.out.println("found:");
			list.remove(key);
			return true;
		}
		else {
			System.out.println("Not found ");
			return false;
		}
	}
	
	
	
	public static int menulist() {
		int choice;
		System.out.println("----------------------------------------");
		System.out.println("0.exit");
		System.out.println("1.Add new book in list ");
		System.out.println("2.Display Forward Order ");
		System.out.println("3.Display Backward Order ");
		System.out.println("4.Delete book at given index ");
		System.out.println("5. Sort all books by price in desc order ");
		System.out.print("Enter your choice :");
		choice = sc.nextInt();
		return choice;
	}
	
        
	public static void main(String[] args) {
		int choice;
		Book[] books = getInstances();
		toList(books);
		
		while((choice=menulist())!=0) {
			switch (choice) {
			case 1:
				list.add(AddNewBook.addbook());
				printListForward(list);
				break;
			case 2:
				System.out.println("printing list in forward order ");
				printListForward(list);
				break;
			case 3:
				System.out.println("printing list in Backward order ");
				printListBackward(list);
				break;
			case 4:
				printListForward(list);
				System.out.println("Enter the list you want to delete :");
				 sc.nextLine();
	            String isbn_no=sc.nextLine();
	            boolean res=deletingBook(isbn_no);
	            System.out.println( "Operation result:"+res);
	            break;
			case 5:
			Comparator<Book> comparator = new SortByPrice();
				list.sort(comparator);
				printListForward(list);
				break;
			case 0:
			       System.out.println("exit ");;
					break;
			default:
				System.out.println("Invalid values");
				break;
			}
		}

	}

	}




