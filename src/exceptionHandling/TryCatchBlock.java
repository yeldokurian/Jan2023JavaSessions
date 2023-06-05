package exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		
		try {
		int i = 9/0;
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("AE........is coming");
			e.printStackTrace();
		}
		
		System.out.println("Bye");
				
	
	}

}
