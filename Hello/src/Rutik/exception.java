package Rutik;

import java.util.Scanner;
public class exception
{
	public static void main(String[] args) 
	{
		int age;
		System.out.println("Enter the age");
		Scanner s = new Scanner(System.in);
	    age =s.nextInt();
	    if(age<18)
	    {
	    	throw new CantDrive("You cannot drive a car....");
	    }
	    else
	    {
			System.out.println("You can happily drive...");
	    }
	}
}
class CantDrive extends RuntimeException
{
	CantDrive(String msg)
	{
		super(msg);
	}
}