package demo;
import java.util.*;
public class Assign5Q1 {
    
	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter a String:");
		String user_input=sc.nextLine();
		String rev=" ";
		System.out.println("String:"+user_input);
		for(int i=user_input.length()-1;i>=0;i--) {
				rev=rev+user_input.charAt(i);
			
		}
		
		System.out.println("Rev:"+rev);
		}
		
		
		// TODO Auto-generated method stub

	}

}
