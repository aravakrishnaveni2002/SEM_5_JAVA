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


class Test2{
	
	public static void main(String[] args){
		
		P p = new P();
		
		p.show();
		
		
		P p1 = new C1();
		
		p1.show();
		
		
		P p2 = new C2();
		
		p2.show();
		
		
		P p3 = new C3();
		
		p3.show();
		
		
	}
}
