
interface Shape{

	double pie=3.14;
	
	double area();
}

class Circle implements Shape{

	double radius;

	Circle(double radius){
		this.radius = radius;
	}
	
	public double area(){

		return (pie*radius*radius);
	}
}

class Rectangle implements Shape{
	
	double length,breadth;

	Rectangle(double length,double breadth){
		
		this.length = length;
		this.breadth = breadth;
	}

	public double area(){

		return (length*breadth);
	}
}

class Test1{

	public static void main(String [] args){
		
		Circle c = new Circle(5);

		Rectangle r = new Rectangle(4,5);

		System.out.println("Circle having radius " + c.radius + " has an area of " + c.area());

		System.out.println("Rectangle having length " + r.length + " and breadth " + r.breadth + " has an area of " + r.area());
	}
}
