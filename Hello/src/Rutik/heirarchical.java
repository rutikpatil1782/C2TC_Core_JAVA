package Rutik;

class A {
	public void A()
	{ System.out.println("rutik"); }
}

class B extends A {
	public void B()
	{ System.out.println("patil"); }
}

class C extends A {
	public void C()
	{ System.out.println("kongaon"); }
}


public class heirarchical {
	public static void main(String[] args)
	{
		B h= new B();
		h.A();
		h.B();

		C g = new C();
		g.A();
		g.C();

		
	}
}

