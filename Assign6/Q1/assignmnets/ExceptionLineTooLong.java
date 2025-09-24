package assignmnets;

public class ExceptionLineTooLong extends Exception {
    private String str;
    public ExceptionLineTooLong() {
            	
    }
    public ExceptionLineTooLong(String str) {
    	this.str=str;
    }
    
    public void setString(String str) {
    	this.str=str;
    }
    
    public String getString() {
    	return str;
    }
    @Override
   public String getMessage() {
       
	return String.format("String is %s which is out of bound(>80 chars)",str);
	   
   }
}
