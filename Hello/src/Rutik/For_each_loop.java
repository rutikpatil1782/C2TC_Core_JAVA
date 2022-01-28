package Rutik;

public class For_each_loop 
{
	public static void main(String[] args)
	{          // for 1D array
		int x[] = {10,20,30,40};   
		        //using conventional for loop
		for(int i=0;i<x.length;i++)   
		{
				System.out.println(x[i]);
		}
		System.out.println();

		        //using for each loop
		for(int x1:x)
		{
			    System.out.println(x1);
		}
		      
		            
		           // for 2D array
		int y[][] = {{10,20,30,40},{50,60}};
		for(int a=0;a<y.length;a++)   
		{
			for(int b=0;b<y[a].length;b++)   
			{
					System.out.println(y[a][b]);
			}
		
		}
		
		System.out.println();
		 			//using for each loop
		for(int[] y1:y)
		{
			for(int []y2: y)
            {
				System.out.println(y[2]);

			}
			
		}
			
		  
		
	}
}