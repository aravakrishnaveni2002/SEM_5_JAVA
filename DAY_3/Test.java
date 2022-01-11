
class P{
	
	void show(){
		System.out.println("P class");
	}
}

class C1 extends P{

	void show(){
		System.out.println("C1 class");
	}
}

class C2 extends P{

	void show(){
		System.out.println("C2 class");
	}
}


class C3 extends P{

	void show(){
		System.out.println("C3 class");
	}
}


class Test{
	
	public static void main(String[] args){
		
		P p = new P();
		
		p.show();
		
		
		C1 c1 = new C1();
		
		c1.show();
		
		
		C2 c2 = new C2();
		
		c2.show();
		
		
		C3 c3 = new C3();
		
		c3.show();
		
		
	}
}
