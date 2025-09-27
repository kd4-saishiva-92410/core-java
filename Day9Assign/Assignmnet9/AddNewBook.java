package Assignmnet9;
import Assignmnet9.Book;
import java.util.*;
public class AddNewBook {
        public static Scanner sc= new Scanner(System.in);
        public static Book addbook() {
		 Book newbook =new Book();
		 System.out.println("Enter the values for isbn ");
		 newbook.setIsbn(sc.nextLine());
		 System.out.println("Enter the values for price ");
		 newbook.setPrice(sc.nextDouble());
		 sc.nextLine();
		 System.out.println("Enter the values for author name ");
		 newbook.setAuthorName(sc.nextLine());
		 System.out.println("Enter the values for quantity ");
		 newbook.setQuantity(sc.nextInt());
		 
		 return  newbook;
	}
}
