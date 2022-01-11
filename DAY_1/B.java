class A{

	int x;
	
	void show(){
		System.out.println(x);
	}
}

class B{

	public static void main(String[] args){
		
		A a = new A();
		
		a.x = 5;
		
		a.show(); 
	} 
	
}
