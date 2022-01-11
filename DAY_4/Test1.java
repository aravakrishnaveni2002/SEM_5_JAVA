

abstract class A{
	
	void m1(){
		System.out.println("m1 of abstract class");
	}
}

class B extends A{

}

class Test1{

	public static void main(String[] args){
		//A a = new A(); //A is abstract; cannot be instantiated

		B b = new B();
		
		b.m1();
	}
}
