package pOne;

public class A{
	
	public int a1 = 10;
	public void m1(){
		System.out.println("public m1() method");
	}
	protected int a2 = 11;
	protected void m2(){
		System.out.println("protected m2() method");
	}
	
	public A(){
		System.out.println("Same class");
		System.out.println("public int: "+a1);
		System.out.println("protected int: "+a2);
		m1();
		m2();
	}
	
}
