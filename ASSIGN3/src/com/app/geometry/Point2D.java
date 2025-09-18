package com.app.geometry;

import java.util.Scanner;

public class Point2D{
	private int x;
	private int y;
	public Point2D(){
		this(0,0);
	}
	public Point2D(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x:");
		x=sc.nextInt();
		System.out.println("Enter y:");
		y=sc.nextInt();
	}

		 
		public void getDetails() {
			 System.out.println("(x,y) :"+"("+this.x+","+this.y+")");
		}
		
		public boolean isEqual(Point2D p) {
		      return this.x==p.getX()&&this.y==p.getY();
		}
		
		public void calDistance(Point2D p) {
			double diff_x=Math.pow((this.x-p.getX()), 2);
			double diff_y=Math.pow((this.y-p.getY()), 2);
			double sqr_val=Math.sqrt((diff_x+diff_y));
			System.out.printf("The distance between two points is %.4f:",sqr_val);
		}

}
