
class Test2{

	void m1(){
		System.out.println("Outer class m1() method");
	}
	
	class Inner{
		
		
		void m2(){
			m1();
			System.out.println("Inner class m2() method");
	
		}
		

	}

	public static void main(String [] args){
		
		Test2 t = new Test2();

		//t.m2();
	
		
		//cannot find symbol
		//t.m2();
		 //^
  		//symbol:   method m2()
  		//location: variable t of type Test2

		 


		Test2.Inner i = t.new Inner();

		i.m2();

		
	}

	
}
