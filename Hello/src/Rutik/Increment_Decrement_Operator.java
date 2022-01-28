package Rutik;

public class Increment_Decrement_Operator {

	public static void main(String[] args) {
		int x=10;   // initial value of x
		int y;
		System.out.println("Initial value of x="+x);
		y=++x;    // Pre-increment operator
		System.out.println("Results after Pre-increment");
		System.out.println("Value of y="+y);  // value of y
		System.out.println("Final value of x="+x);  //  value of x after Pre-increment
		System.out.println("**************************");
		
		x=10;	//  Assignment Operator (Reassigning initial value to x)
		System.out.println("Initial value of x="+x);
		y=x++;    // Post-increment operator
		System.out.println("Results after post-increment");
		System.out.println("Value of y="+y);  // value of y
		System.out.println("Final value of x="+x);  //  value of x after Post-increment
		System.out.println("**************************");
		
		x=10;	//  Assignment Operator (Reassigning initial value to x)
		System.out.println("Initial value of x="+x);
		y=--x;    // Pre-decrement operator
		System.out.println("Results after Pre-decrement");
		System.out.println("Value of y="+y);  // value of y
		System.out.println("Final value of x="+x);  //  value of x after Pre-decrement
		System.out.println("**************************");
		
		x=10;	//  Assignment Operator (Reassigning initial value to x)
		System.out.println("Initial value of x="+x);
		y=x--;    // Post-decrement operator
		System.out.println("Results after Post-decrement");
		System.out.println("Value of y="+y);  // value of y
		System.out.println("Final value of x="+x); //  value of x after Post-decrement
		System.out.println("**************************");
	}
}

