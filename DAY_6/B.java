package pTwo;
import pOne.A;

public class B extends A{

	public int a11 = 20;
	public void m11(){
		System.out.println("m11() method");
	}
	
	
	public B(){
		System.out.println("Different package sub class");
		System.out.println("public int: "+a1);	
		m1();
		System.out.println("protected int: "+this.a2);
		this.m2();
	}
	
	
	
	public static void main(String [] args){
		B b = new B();
		
		
	}	
	
}
