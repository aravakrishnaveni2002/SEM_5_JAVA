class Test1{
	
	int x;
	
	
}


class Third{


	int y;
	
	void printObj(Third obj1,Test1 obj2){
		System.out.println("Current Class Obj" + " " + obj1.y);
		System.out.println("Other Class Obj" + " " + obj2.x);
	}
	
	public static void main(String[] args){
		
		Third currObj = new Third();
		
		Test1 otherObj = new Test1();
		
		currObj.y = 65;
		
		otherObj.x = 55;
		
		currObj.printObj(currObj,otherObj);
		
		
	}
}
