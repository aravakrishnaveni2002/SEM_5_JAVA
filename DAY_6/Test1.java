class Parent{
	
	int i=10;
	
	{
		m1();
		System.out.println("Parent class FNSB");
	}
	
	Parent(){
		System.out.println("Parent class constructor");
	}
	
	public static void main(String [] args){
		Parent p = new Parent();
		System.out.println("Parent class MM");
		
	}
	
	void m1(){
		System.out.println(j);
	}
	
	int j = 20;
	
	{
		System.out.println("Parent class SNSB");
	}
}


class Child extends Parent{  

	int x=100;
	
	{
		m2();
		System.out.println("Child class NSB");
	}
	
	Child(){
		System.out.println("Child class constructor");
	}
	
	public static void main(String [] args){
		Child c = new Child();
		System.out.println("Child class MM");
		
	}
	
	void m2(){
		System.out.println(y);
	}
	
	int y = 200;
	
	{
		System.out.println("Child class SNSB");
	}
}

