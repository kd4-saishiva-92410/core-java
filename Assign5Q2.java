package demo;
import java.util.Scanner;
import java.lang.String;
public class Assign5Q2 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter a String");
			String user_input=sc.nextLine();
			System.out.println("String:"+user_input);
			boolean flag=false;
			for(int i=0;i<user_input.length();i++) {
				for(int j=user_input.length()-1;j>=0;j--) {
					if((user_input.charAt(i)==user_input.charAt(j))) {
						flag=true;
					}
					else {
						flag=false;
					}
				}
				
			}
			
			
			if(flag==true) {
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not palindrome");
			}
			
			
			
		}

	}

}
