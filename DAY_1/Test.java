class Student{

	int rollNo;
	String name;
	String stream;
	String college = "Academy Of Technology";
	
	Student(int rollNo,String name,String stream){
		this.rollNo = rollNo;
		this.name = name;
		this.stream = stream;
	
	}
	
	void showInformation(){
		System.out.println("RollNo" + " " + rollNo);
		System.out.println("Name" + " " + name);
		System.out.println("Stream" + " " + stream);
		System.out.println("College" + " " +college);
		System.out.println("\n");
	}
}

class Test{

	public static void main(String[] args){
		Student s1 = new Student(56,"Ram","CSE_1");
		Student s2 = new Student(65,"Shyam","CSE_2");
		
		s1.showInformation();
		s2.showInformation();
		
	}
}
