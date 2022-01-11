class Parent{

	static int i = 10;
	
	static{
		m1();
		System.out.println("Parent class FSB");
	}
	
	public static void main(String [] args){
		m1();
		System.out.println("Parent calss MM");
	}
	
	static void m1(){
		System.out.println(j);
	}
	
	static{
		System.out.println("Parent class SSB");
	}
	
	static int j = 20;
	
	
	
}

class Child extends Parent{

	static int x = 100;
	
	static{
		m2();
		System.out.println("Child class FSB");
	}
	
	public static void main(String [] args){
		m2();
		System.out.println("Child calss MM");
	}
	
	static void m2(){
		System.out.println(y);
	}
	
	static{
		System.out.println("Child class SSB");
	}
	
	static int y = 200;
	
}


