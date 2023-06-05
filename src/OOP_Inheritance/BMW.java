package OOP_Inheritance;

public class BMW extends Car{

	//Method Overriding - This is Poly Morphism also Run time Poly Morphism or Dynamic Poly Morphism
	//When you have a method in the parent class and the same method in the child class
	//with the same name
	//same number of parameters
	//with the same sequence of parameters
	//with the same return
	
	@Override
	public void start() {
		
		System.out.println("BMW.......start");
		
	}
	
	public void autoParking() {
		
		System.out.println("BMW.......autoParking");
	}
}
