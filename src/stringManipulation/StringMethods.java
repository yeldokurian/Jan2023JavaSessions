package stringManipulation;

public class StringMethods {

	public static void main(String[] args) {

		String s = "This is my Java code cvsafga";
		
	int len =	s.length();
	System.out.println(len);
	
	System.out.println(s.charAt(0));
	System.out.println(s.charAt(2));
	System.out.println(s.charAt(11));
		//System.out.println(s.charAt(20));
		//System.out.println(s.charAt(-1));

	System.out.println(s.indexOf('i'));
	System.out.println(s.indexOf('e'));
	System.out.println(s.indexOf('a', 13));
	System.out.println(s.indexOf('i', 4));
	System.out.println(s.indexOf('a', s.indexOf('a')+1));
	System.out.println(s.indexOf("Testing"));
	
	
String browser = ("chrome");
if(browser.equalsIgnoreCase("CHROME")) {
	System.out.println("PASS");	
}

else{
	
	System.out.println("FALSE");
}



	
	}

}
