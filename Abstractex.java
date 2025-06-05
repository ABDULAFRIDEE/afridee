package xyz;

abstract class Car{
	abstract void Features();
		public void Implementation(){
			System.out.println("you need to press the accelelator to run");
		}
		
	}
	
    class Car1 extends Car{
	void Features() {
		System.out.println("car work with the v6 engine");
	}
}
	
	
	
public class Abstractex{	
	
	public static void main(String[] args) {
		Car1 c= new Car1();
		c.Implementation();
	}
		
		
	}

