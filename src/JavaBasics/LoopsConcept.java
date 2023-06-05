package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//while loop
		
		int i = 1; //initialization
		while(i<=10) { //conditional
			System.out.println(i);
			i=i+1; //incremental or decremental
		}
		
		System.out.println("***************");
		
		for(int j=1; j<=10; j=j+1) {
			System.out.println(j);
		}
		
		System.out.println("****************");
		for(int k=10; k>=-10; k=k-1) {
			
			System.out.println(k);
		}
		
	}

}
