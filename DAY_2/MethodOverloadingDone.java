
class A{

	int x;
	int y;
	
	A(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	
	/*void m1(){
		System.out.println("Overloaded Method having return type void");
	}
	
	int m1(){
		System.out.println("Overloaded Method having return type int");	
	}*/
	
	
	/*MethodOverloading.java:17: error: method m1() is already defined in class A
	int m1(){
	    ^
	1 error*/

	
	void m1(int n){
	
		System.out.println("Overloaded Method "+ n);
	}
	
	void m1(double n){
		System.out.println("Overloaded Method "+n);
	}
}


class MethodOverloadingDone{
	
	public static void main(String [] args){
		
		A a = new A(5,6);
		
		//a.m1();
		
		a.m1(2);
		
		a.m1(2.0);
	}
}
