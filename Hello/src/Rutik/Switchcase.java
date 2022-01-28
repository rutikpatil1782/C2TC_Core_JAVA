package Rutik;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args)
	{
		int x;
		System.out.println("Enter the case:");

		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		
		switch(x) 
		{
		default:
			System.out.println("default");
			break;
			
		case 0:
			System.out.println(56);
			break;
			
		case 1:
			System.out.println(456);
			break;
	
		case 2:
			System.out.println(35662);
			
	    }
	}
}