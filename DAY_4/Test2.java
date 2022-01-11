abstract class A{
	
	abstract void m1();
	
	abstract void m2();
	
	abstract void m3();
}

class B extends A{
	
	void m1(){
		System.out.println("m1 of B class");
	}
	
	void m2(){
		System.out.println("m2 of B class");
	}
}

class Test1{

	public static void main(String[] args){
		//A a = new A(); //A is abstract; cannot be instantiated

		B b = new B();//B is not abstract and does not override abstract method m3() in A

		
		b.m1();
		b.m2();
	}
}
