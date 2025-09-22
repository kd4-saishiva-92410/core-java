package demo;
import java.util.Scanner;


public class Assign5Q3 {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);	
          System.out.println("Enter the sentence");
          String str= sc.nextLine();
          String[] words=str.split(" ");
          System.out.println("The words are ");
          for(int i=0;i<words.length;i++) {
        	  System.out.print("{"+words[i]+"}"+" ");
          }
          System.out.println();
          System.out.println();
          System.out.println("No of words :"+words.length);
          

	}

}
