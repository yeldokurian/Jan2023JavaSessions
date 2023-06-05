package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
	

		
		int a = 600;
		int b = 500;
		int c = 900;
		
		if(a>b && a>c) {
			System.out.println("a is the greatest number");
		}
		else if(b>c) {
			System.out.println("b is the greatest number");
		}
		
		else {
			System.out.println("c is the greatest number");
		}
	}

}
