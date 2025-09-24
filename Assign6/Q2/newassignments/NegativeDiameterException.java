package newassignments;

public class NegativeDiameterException extends RuntimeException{
	private String message;
	private double diameter;
	public NegativeDiameterException() {
		this(0.0,"Unknown error");
	}
	public NegativeDiameterException(double diameter,String message) {
		this.diameter=diameter;
		this.message=message;
	}
	@Override
	public String getMessage() {
		return String.format("The diamter is %.2f and %s:",diameter,message);
	}
}