interface interf1{
	
	void m1();

	void m2(); 
}

interface interf2{
	
	void m3();

	void m4();
}

interface interf3 extends interf1,interf2{
	
	void m5();
}

class Parent{
	
	void pa(){
		System.out.println("Parent method");
	}
}

class Child extends Parent implements interf3{


	void pa(){
		System.out.println("Child method");
	}

	public void m1(){
		System.out.println("m1() method");
	}

	public void m2(){
		System.out.println("m2() method");
	}

	public void m3(){
		System.out.println("m3() method");
	}

	public void m4(){
		System.out.println("m4() method");
	}

	public void m5(){
		System.out.println("m5() method");
	}

	
}

class Test3{
	
	public static void main(String [] args){

		Child c = new Child();

		Parent p = new Parent();

		Parent p1 = new Child();


		p1.pa();

		p.pa();

		
		c.m1();

		c.m2();

		c.m3();

		c.m4();

		c.m5();

		c.pa();

		
	}
}
