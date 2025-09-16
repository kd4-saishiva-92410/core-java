import java.util.*;


class Intnum{
    Scanner sc= new Scanner(System.in);
    int num;
    Integer decimal_num=num;
    public Intnum() {
    	System.out.println("parameter less ctor");
    	this.num=10;
    }
    
    public void acceptNum() {
    System.out.println("Enter a number :");
    num=sc.nextInt();
    }
    //display
    public void displayNum() {
        System.out.println("number :"+num);
        }
    public void toBinary() {
    	String binary;
    	binary=decimal_num.toBinaryString(num);
    	System.out.println("Converted to binary :"+binary);
    	
    }
    public void toOctal() {
    	 String octal;
    	 octal=decimal_num.toOctalString(num);
    	 System.out.println("Converted to Octal :"+octal);
    }
    public void toHexa() {
         String hex;
         String hexupper;
         hex=decimal_num.toHexString(num);
         hexupper=hex.toUpperCase();
         System.out.println("Converted to Hexadecimal :"+hexupper); 
    }
}


public class Assign1Q1 {
	public static void main(String[] args) {
    Intnum n1= new Intnum();
    n1.acceptNum();
    n1.displayNum();
    n1.toBinary();
    n1.toOctal();
    n1.toHexa();

	}
}
