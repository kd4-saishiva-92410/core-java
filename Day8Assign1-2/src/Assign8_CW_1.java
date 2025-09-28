import java.util.*;
public class Assign8_CW_1{

	public static <T extends Number> void minNum(T[] arr){
		System.out.println("Array is");
		for(T e:arr) {
			System.out.print(e + " ");
			
		}
		System.out.println();
		T min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i].doubleValue()<min.doubleValue()) {
				min=arr[i];
			}
		}
		System.out.println("The min value is :"+min);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an array size :");
		int size= sc.nextInt();
		sc.nextLine();
		Integer[] arr = new Integer[size];
	for(int i=0;i<arr.length;i++) {
		System.out.print("Enter the digit :");
		arr[i]=sc.nextInt();
	}
	    System.out.println();
		minNum(arr);
	}

}
