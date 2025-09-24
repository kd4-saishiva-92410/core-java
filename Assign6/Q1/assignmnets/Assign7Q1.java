package assignmnets;
import java.util.Scanner;

class Sentence{
	private String str;
	public Sentence(){
		
	}
	public Sentence(String str) {
		this.str=str;
	}
	public void setStr(String str) throws ExceptionLineTooLong {
		if(str.length()>80) throw new ExceptionLineTooLong(str);
		this.str=str;
	}
	public String getStr() {
		return str;
	}
	@Override
	public String toString() {
		return String.format("The string written is : %s ",str);
	}
	
}


public class Assign7Q1 {

	public static void main(String[] args) {
		String str;
		Sentence s1= new Sentence();
		try (Scanner sc= new Scanner(System.in)){
		
		System.out.println("Enter the String ");
		str=sc.nextLine();
		s1.setStr(str);
		
		}catch(ExceptionLineTooLong e) {
			System.out.println("Exception arised is :"+e.getMessage());
		}
		
		finally {
			System.out.println(s1.toString());
			
		}
		

	}

}
