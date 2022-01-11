
class Pickle{
	
	void taste(){
		System.out.println("Sweet");
	}
}

interface Rice{ 

	 void type();
}

class Test4{

	public static void main(String [] args){
	
		Pickle p1 = new Pickle(){
		
			void taste(){
				System.out.println("Sour");
			}
		};

		new Pickle(){
			void taste(){
				System.out.println("Spicy");
			}
		}.taste();

		Pickle p = new Pickle();
		p.taste();

		p1.taste();  

		Rice r = new Rice(){
			
			public void type(){
				System.out.println("Basmati");
			}
		};

		r.type();

		new Rice(){
			public void type(){
				System.out.println("Normal");
			}
		}.type();


	}

	
}
