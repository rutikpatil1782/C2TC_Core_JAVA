package Rutik;

class one {
	public void A()	
	{
		System.out.println("RUTIK");
	}
}

class two extends one {
	public void B()
	{ System.out.println("PATIL"); }
}

    //class three extends two {
	//public void C()

	
   //	{ System.out.println("KONGAON"); }
  //}

public class inheritance {
	public static void main(String[] args)
	{
		//three I = new three();
		  two I = new two();

		  I.A();
		  I.B();
		//I.C();
	}
}
