class Test2{
	
	int x;
	
	Test2(int ele){
		x = ele; 
	}
	
}

class Four{


	int y;
	
	Four(int ele){
		y = ele;
	}
	
	Four returnObjSame(){
		return new Four(65);
		
	}
	
	Test2 returnObjDiff(){
		return new Test2(56);
		
	}
	
	public static void main(String[] args){
	
		Four f = new Four(45);
	
		Four same = f.returnObjSame();
		
		Test2 diff = f.returnObjDiff(); 
	
		System.out.println("Same"+ " " + same.y);
		
		System.out.println("Diff"+ " " + diff.x);
	
	}
}
